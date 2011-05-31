/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uko.cryptology.tools;

import java.util.Random;

/**
 *
 * @author uko
 */
public class Generators
{
	public static int generate(int lowest, int highest)
	{
		Random generator = new Random();
		return generator.nextInt(highest+1-lowest)+lowest;
	}
}
