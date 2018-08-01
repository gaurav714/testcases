package com.stackroute.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ex2_test {
	Ex2 obj = new Ex2();
	@Test
	void test() 
	{
		
		assertEquals("Jerry", obj.func(22));
	}
	@Test
	void test2()
	{
		
		assertEquals("Tom", obj.func(21));
	}

}
