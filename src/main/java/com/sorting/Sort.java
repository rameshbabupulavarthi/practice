package com.sorting;

/**
 * Created by Sunil Golla on 3/31/2018.
 */
public interface Sort<T extends Comparable<T>> {

    public T[] sort(T[] input);

    public default void swap(T[] input, int firstIndex, int secondIndex){

        T temp=input[firstIndex];
        input[firstIndex]=input[secondIndex];
        input[secondIndex]=temp;
    }
}
