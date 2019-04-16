package com.java.sorting;

/**
 * Created by Sunil Golla on 4/1/2018.
 */
public class SelectionSort<T extends Comparable<T>> implements Sort<T> {

    public T[] sort(T[] input){


        for (int i = 0; i < input.length; i++) {
            int smallIndex=i;
            for (int j = i+1; j < input.length; j++) {
                if(input[smallIndex].compareTo(input[j])>0){
                    smallIndex=j;
                }
            }
            if(i!=smallIndex) {
                this.swap(input, i, smallIndex);
            }
        }

        return input;
    }
}
