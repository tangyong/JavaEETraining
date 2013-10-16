package tangyong.javaee.understadingcdi.basic14;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@I
@Priority(Interceptor.Priority.APPLICATION + 10)
public class I2 {

	@AroundInvoke
	public Object logMethod(InvocationContext ic) throws Exception {
		System.out.println("Entering I2");
		try {
			return ic.proceed();
		} finally {
			System.out.println("Exiting I2");
		}
	}
}
