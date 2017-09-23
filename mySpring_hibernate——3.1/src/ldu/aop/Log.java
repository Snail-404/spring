package ldu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


public class Log {
	public void log(){
		System.out.println("aop-------------------");
	}
}
