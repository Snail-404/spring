package ldu.testImpl;

import org.springframework.stereotype.Component;

import ldu.test.Test;

@Component("ti")
public class TestImpl implements Test{

	@Override
	public void say() {
		System.out.println("sssssssss");
		
	}

}
