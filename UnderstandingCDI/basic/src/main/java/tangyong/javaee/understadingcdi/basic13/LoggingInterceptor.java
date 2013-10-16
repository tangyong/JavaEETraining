package tangyong.javaee.understadingcdi.basic13;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggingInterceptor {

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

	@PostConstruct
	public void postInit(InvocationContext ic) throws Exception {
		System.out.println(ic.getTarget().toString());
		try {
			ic.proceed();
		} finally {
			System.out.println(ic.getTarget().toString());
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
