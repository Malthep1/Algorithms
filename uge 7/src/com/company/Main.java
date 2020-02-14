package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //insertionsort
        //InsertionSort is = new InsertionSort();
	    //int[] A = {31,41,59,26,41,58};
	    //A = is.runsort(A);
	    //for(int i = 0; i < A.length; i++){
        //System.out.println(A[i]);

        //randomIntArray
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try{
        i =  Integer.parseInt(sc.nextLine());
        RandomArray rand = new RandomArray();
            System.out.println(rand.kredse(rand.printRandomArray(i)));
        }
        catch(Exception e){
            System.out.println("Input was not an integer.");
        }

    }

}

