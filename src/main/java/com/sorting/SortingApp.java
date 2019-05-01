package com.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sunil Golla on 3/31/2018.
 */
public class SortingApp {

    public static void main(String args[]){

        /*Integer[] array={4,7,9,4,8,5,6,-1,34};
        Sort<Integer> sortAlgo=new InsertionSort<Integer>();*/

        String[] array={"d","c","z","a"};
        Sort<String> sortAlgo=new InsertionSort<String>();
        sortAlgo.sort(array);
        System.out.println(array);
        List list= Arrays.asList(array);
        list/*.stream()*/.forEach(l -> {
            System.out.println(l);
        });
    }
}
