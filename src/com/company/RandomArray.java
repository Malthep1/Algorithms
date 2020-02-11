package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class RandomArray {

    private ArrayList <Integer> list = new ArrayList<>();

    public ArrayList<Integer> printRandomArray(int n) {
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        //for (int i = 0; i < list.size()+1; i++){
        //    System.out.println(list.get(i));
        //}
        return list;

    }
    public static int kredse(ArrayList<Integer> list){
        int kreds = 0;
        for(int k=0; k<list.size(); k=k+1){
            int p = list.get(k);
            if(p!=-1){
                while(p!=-1){
                    int t = list.get(p);
                    list.set(p,-1);
                    p = t;
                }
                kreds = kreds+1;
            }
        }
        return kreds;
    }
}
