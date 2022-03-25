package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      //getBit
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos=2;
        int bitmask=1<<pos;

        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
          
          //setBit
          public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
            //clearBit
            clear Bit
  	int n = 5;
	  int pos = 2;
	  int bitWise = 1<<pos;
	  int notBitWise = ~(bitWise);
	
	  int newNumber = (notBitWise & n);
	  System.out.println("This is clear bit method"+newNumber);
            //Update bit function
	  Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 for set bit"
			+ "and Press 0 for clear bit");
	int operation = sc.nextInt();
	int n=5;
	int pos=1;
	int bitWise=1<<pos;
	if(operation==1) {
		
		int newNumber = bitWise | n;
		System.out.println("This is set bit : "+newNumber);
	}else {
		
		int newbitWise = ~(bitWise);
		int newNumber1 = newbitWise & n;
		System.out.println("This is clear bit : "+newNumber1);
	}
	
