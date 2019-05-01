package com.sorting;

/**
 * Created by Sunil Golla on 4/1/2018.
 */
public class InsertionSort<T extends Comparable<T>> implements Sort<T> {

    public T[] sort(T[] input){

        for (int i = 1; i < input.length; i++) {
            for (int j = i; j >0; j--) {
                if(input[j-1].compareTo(input[j])>0){
                    this.swap(input,j-1,j);
                }
            }
        }
        return input;
    }
}
