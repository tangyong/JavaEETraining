package tangyong.javaee.understadingcdi.basic12;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

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
