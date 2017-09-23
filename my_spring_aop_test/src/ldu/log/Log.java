package ldu.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class Log {
	//@Before("execution(public void ldu..*.*())")
	public void before(){
		System.out.println("before test...............");
	}

}
