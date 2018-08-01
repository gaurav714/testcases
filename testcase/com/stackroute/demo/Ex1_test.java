package com.stackroute.demo;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ex1_test {
	
	Ex1_for_test obj = new Ex1_for_test();
	@Test
	void testpal()
	{
		assertEquals("123 is not a palindrome ", obj.num(123));
	}
	@Test
	void testpal2()
	{
		assertEquals("121 is palindrome and sum of even number is not greater than 25", obj.num(121));
	}
}
