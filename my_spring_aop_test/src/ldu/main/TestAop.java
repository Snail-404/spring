package ldu.main;

import ldu.test.Test;
import ldu.testImpl.TestImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAop {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Test ttt=(Test)ac.getBean("ti");
		ttt.say();
		
	}

}
