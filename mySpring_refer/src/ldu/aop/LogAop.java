package ldu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAop {
	public void logBefore(){
		System.out.println("before add logs");
	}
	public void logsAop(){
		System.out.println("after add logs!!");
	}

}
