/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uko.cryptology.tools;

/**
 *
 * @author uko
 */
public class BinaryMethod
{
	public static int calculate(int number, int power, int module)
	{
		if(power==0)
			return 1;
		if(power==1)
			return number%module;
		return (calculate(number, power/2, module)*calculate(number, power-power/2, module))%module;
	}
}
