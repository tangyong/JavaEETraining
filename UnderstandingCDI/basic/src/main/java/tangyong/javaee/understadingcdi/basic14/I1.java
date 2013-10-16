package tangyong.javaee.understadingcdi.basic14;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@I
@Priority(Interceptor.Priority.APPLICATION + 20)
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
