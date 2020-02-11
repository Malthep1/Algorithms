package com.company;

public class Main {

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
	    int[] A = {31,41,59,26,41,58};
	    A = is.runsort(A);
	    for(int i = 0; i < A.length; i++){
        System.out.println(A[i]);
	    }

    }
}
