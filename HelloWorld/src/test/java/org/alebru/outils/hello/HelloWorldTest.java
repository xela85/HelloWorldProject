package org.alebru.outils.hello;

import static org.junit.Assert.*;

import org.alebru.outils.hello.HelloWorld;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	HelloWorld hello;
	
	@Before
	public void setUp() {
		hello = new HelloWorld();
	}
	
	@Test
	public void test() {
		assertEquals(hello.greeting(), "Hello world ! :D");
	}

}
