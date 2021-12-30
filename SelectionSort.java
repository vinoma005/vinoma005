package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] values = {1,4,3,25,6,7};
        selectionSort(values);
        System.out.println(Arrays.toString(values));

    }

    public static void swapElements(int[] array,int i,int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } //Swap elements

    public static int indexLowest(int[] array,int start){
        int lowIndex = start;
        for(int i=start;i<array.length;i++){
            if(array[i]< array[lowIndex]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }
    // Find the index of lowest value
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int j = indexLowest(array,i);
            swapElements(array,i,j);
        }

    }
}

