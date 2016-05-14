package com.DominikMilewski.Generic;

public class TestLaguerre {

	public static double Test(FunctionalInterfaceLaguerre<Integer,Double> f,int n,double x){
		
		return f.evaluate(n, x);
		
	}
	
	
	public static void main(String[] args){
		
		LaguerrePolynomial pol = new LaguerrePolynomial();
		System.out.println(Test(pol,1,2));
		System.out.println(pol.evaluatesum(5, 3.0));
	}
	
}
