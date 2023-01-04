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
		/*
		 * enter integer value
		 */
		Integer xInt, yInt,zInt;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Integer :");
		xInt=sc.nextInt();
		System.out.print("Enter 2nd Integer :");
		yInt=sc.nextInt();
		System.out.print("Enter 3rd Integer :");
		zInt=sc.nextInt();
		/*
		 * Enter float value
		 */
		Float xFlo, yFlo,zFlo;
		Scanner fl=new Scanner(System.in);
		System.out.print("Enter 1st Float :");
		xFlo=fl.nextFloat();
		System.out.print("Enter 2nd Float :");
		yFlo=fl.nextFloat();
		System.out.print("Enter 3rd Flaot :");
		zFlo=fl.nextFloat();
/*
 * 	
 */
		String xSti, ySti,zSti;
		Scanner st=new Scanner(System.in);
		System.out.print("Enter 1st String :");
		xSti=st.nextLine();
		System.out.print("Enter 2nd String :");
		ySti=st.nextLine();
		System.out.print("Enter 3rd Flaot :");
		zSti=st.nextLine();
		
		/*
		 * take value to generics
		 */
		new Generics(xInt, yInt,zInt).max();
		new Generics(xFlo, yFlo,zFlo).max();
		new Generics(xSti, ySti,zSti).max();
		
	}

}
