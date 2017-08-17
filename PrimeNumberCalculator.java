/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbercalculator;

import java.util.Scanner;

/**
 *
 * @author Nathan Hansen
 *
 */
public class PrimeNumberCalculator {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
    
    Scanner keyboard = new Scanner(System.in);
	System.out.println("What is the prime number you want me to check?");
	int myNumber = keyboard.nextInt();
	boolean prime = true;

	if (myNumber <= 100)
	{
		for (int divisor=2; divisor<=10; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
		}
        
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else if (myNumber <= 2500)
	{
		for (int divisor=2; divisor<=50; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
		}
        
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else if (myNumber <= 10000)
	{
		for (int divisor=2; divisor<=100; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
        }
         
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else if (myNumber <= 40000)
	{
		for (int divisor=2; divisor<=200; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
		}
        
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else if (myNumber <= 250000)
	{
		for (int divisor=2; divisor<=500; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
		}
        
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else if (myNumber <= 1000000)
	{
		for (int divisor=2; divisor<=1000; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
		}
        
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else if (myNumber <= 100000000)
	{
		for (int divisor=2; divisor<=10000; divisor++) 
		{
			if (myNumber % divisor == 0)
			{
				prime = false;
			}
		}
        
        if (prime = true)
		{
		System.out.println("After checking, your number " + myNumber + " has been determined to be prime.");
		}
		else
		{
		System.out.println("After checking, your number " + myNumber + " is not prime.");
		}
	}

	else
	{
		System.out.println("Your number is too big for this program in its current version.");
	}

    }
}