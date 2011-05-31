/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uko.cryptology.tools;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uko
 */
public class BinaryMethodTest
{
	public BinaryMethodTest()
	{
	}
	/**
	 * Test of calculate method, of class calculate.
	 */
	@Test
	public void testBinaryMethod()
	{
		System.out.println("BinaryMethod");
		int number = 88;
		int power = 7;
		int module = 187;
		int expResult = 11;
		int result = BinaryMethod.calculate(number, power, module);
		assertEquals(expResult, result);
	}
	/**
	 * Test of calculate method, of class calculate.
	 */
	@Test
	public void testBinaryMethod2()
	{
		System.out.println("BinaryMethod");
		int number = 88;
		int power = 2;
		int module = 187;
		int expResult = 77;
		int result = BinaryMethod.calculate(number, power, module);
		assertEquals(expResult, result);
	}
}
