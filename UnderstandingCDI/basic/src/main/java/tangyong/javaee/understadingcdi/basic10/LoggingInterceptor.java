package tangyong.javaee.understadingcdi.basic10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {
	@Inject
	Logger logger;

	@AroundConstruct
	private void init(InvocationContext ic) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("Current Time: " + df.format(new Date())
				+ " Entering constructor");
		try {
			ic.proceed();
		} finally {
			System.out.println("Current Time: " + df.format(new Date())
					+ " Exiting constructor");
		}
	}

	@AroundInvoke
	private Object logMethod(InvocationContext ic) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("Current Time: " + df.format(new Date())
				+ " Entering TargetClassName: "
				+ ic.getTarget().getClass().getName() + "MethodName: "
				+ ic.getMethod().getName());
		try {
			Thread.sleep(1000);
			return ic.proceed();
		} finally {
			System.out.println("Current Time: " + df.format(new Date())
					+ " Exiting TargetClassName: "
					+ ic.getTarget().getClass().getName() + "MethodName: "
					+ ic.getMethod().getName());
		}
	}
}
