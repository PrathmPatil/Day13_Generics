package com.generics;

import java.util.Scanner;

public class Generics <P extends Comparable<P>> {
	P x;
	P y;
	P z;

	public Generics(P x, P y, P z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
   public P max()
   {
	   return Generics.max(x, y, z); 
   }
	
   public static <P extends Comparable<P>> P max(P x, P y, P z)
   {
	   P max=x;
	   if(y.compareTo(max)>0)
	   {
		   max=y; //if y is Higher
	   }
	   if(z.compareTo(max)>0)
	   {
		   max=z; //if z is Higher
	   }
	   printMax(max); //call to print
	   return max; 	   
   }
   public static <P> void printMax( P max)
   {
	   System.out.println("Maximun String is "+max);
   }
	public static void main(String[] args) {
//		Integer xFlo, yFlo,zFlo;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter 1st Integer :");
//		xFlo=sc.nextInt();
//		System.out.print("Enter 2nd Integer :");
//		yFlo=sc.nextInt();
//		System.out.print("Enter 3rd Integer :");
//		zFlo=sc.nextInt();
		/*
		 * Enter float value
		 */
//		Float xFlo, yFlo,zFlo;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter 1st Float :");
//		xFlo=sc.nextFloat();
//		System.out.print("Enter 2nd Float :");
//		yFlo=sc.nextFloat();
//		System.out.print("Enter 3rd Flaot :");
//		zFlo=sc.nextFloat();
//		
		String xSti, ySti,zSti;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st String :");
		xSti=sc.nextLine();
		System.out.print("Enter 2nd String :");
		ySti=sc.nextLine();
		System.out.print("Enter 3rd Flaot :");
		zSti=sc.nextLine();
		
		/*
		 * take value to generics
		 */
		new Generics(xSti, ySti,zSti).max();
		
	}

}
