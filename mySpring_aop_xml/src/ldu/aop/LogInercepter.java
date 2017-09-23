package ldu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class LogInercepter {
	//@Before("execution(public void ldu.dao.impl.UserDaoImpl.save(ldu.model.User))")
	public void before(){
		System.out.println("start save6666666666666");
	}

}
