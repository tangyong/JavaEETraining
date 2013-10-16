package tangyong.javaee.understadingcdi.basic12;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class I1 {

	@AroundInvoke
	public Object logMethod(InvocationContext ic) throws Exception {
		System.out.println("Entering I1");
		try {
			return ic.proceed();
		} finally {
			System.out.println("Exiting I1");
		}
	}
}
