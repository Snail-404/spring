package ldu.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogIntercepter implements InvocationHandler{
	private Object target;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	public void beforeSave(){
		System.out.println("save before............");
	}
	public void afterSave(){
		System.out.println("after save");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		beforeSave();
		method.invoke(target, args);
		afterSave();
		
		return null;
	}

}
