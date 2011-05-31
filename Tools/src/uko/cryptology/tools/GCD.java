/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uko.cryptology.tools;

/**
 *
 * @author uko
 */
public class GCD
{
	public static int euclidean(int a, int b)
	{
		if(b>a)
			return euclidean(b, a);
		if(b==0)
			return a;
		return euclidean(b, a%b);
	}
}
