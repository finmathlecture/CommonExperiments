package com.DominikMilewski.Generic;

public class LaguerrePolynomial implements FunctionalInterfaceLaguerre<Integer, Double> {
	


	public Double evaluate(int n, double x) {
		
		if(n==0){
			return 1.0;
		}
		else if(n==1){
			return 1-x;
		}
		else
			
			return ((2*(n-1)+1-x)*evaluate(n-1,x)-(n-1)*evaluate(n-2,x))/(n);
			}

	
	public Double evaluatesum(int n,double x){
		
		double sum = 0;
		for(int k=0;k<n+1;k++){
			sum+=binomial(n,k)*Math.pow(-1, k)*Math.pow(x, k)/fakultaet(k);
		}
		return sum;
		
	}
	
	public static long binomial(int n, int k) {
		if (k == 0) {
		return 1; }
		else { 
		return (n/k) * binomial(n-1, k-1);
		}
	}
	
	
	
	
	public static long fakultaet(int n){
	if ( n > 0 )
    {
		return (long)n*fakultaet(n-1);	
    }
	else
		return (long)1;
}
	
}