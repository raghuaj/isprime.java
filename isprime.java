package com.raghu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
	if(isprime()==false){
	    System.out.println("number is not prime number");
    }
	else {
        System.out.println("number is  prime number");
    }
    }
    public static boolean isprime(){
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=2;i<=n/2;i++)
            if(n%i==0){
                return false;
            }
        return true;
    }

}
