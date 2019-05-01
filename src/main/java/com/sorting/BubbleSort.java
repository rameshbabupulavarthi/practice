package com.sorting;

/**
 * Created by Sunil Golla on 3/31/2018.
 */
public class BubbleSort<T extends Comparable<T>> implements Sort<T>{

    public T[] sort(T[] input){
        for(int i=0;i<input.length;i++){
            for (int j = 1; j < input.length-i; j++) {
                if(input[j-1].compareTo(input[j])>0){
                    T temp=input[j-1];
                    input[j-1]=input[j];
                    input[j]=temp;
                }
            }
        }
        return input;
    }
}
