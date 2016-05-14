package com.DominikMilewski.Generic;
public class Simpson extends Cosinus{
	
	
	public static double simpsonMethod(Function<Double> f,int n,double lowerbound,double upperbound){
		
		double h=(upperbound-lowerbound)/(2*n);
		double sum1 = f.evaluate(lowerbound)+f.evaluate(upperbound);
		
		for(int k = 1;k<n;k++){
			sum1 += 4*f.evaluate(lowerbound+ h*(2*k-1))+2*f.evaluate(lowerbound+h*2*k);
		}
		
		return (h/3)*sum1;
	}

	public static void main(String[]args){
		
		Cosinus cosine = new Cosinus();
		
		System.out.println(simpsonMethod(cosine,1000,0,1));
		
	}
}
