package com.fs.d01.java;
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World");

        if(args.length == 0)
        	System.out.println("No arguement is passed");
        else {
            System.out.println("Printing the args passed..");
        	for(int i = 0; i <args.length; i ++) {
                System.out.println(args[i] + "\n");
    		}
        }    }
}