package org.flamingfly.gfa;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DirectSort extends AbstractSorter{

    protected static void getInstance(){
        instance = new DirectSort();
    }

    private int[] DoSort(int[] toSort){
        Integer[] result = new Integer[toSort.length];
        int score;
        for(int itemA:toSort){
            score = 0;
            for(int itemB:toSort){
                if(itemA > itemB){
                    score++;
                }
            }
            while(result[score] != null){
                score++;
            }
            result[score] = itemA;
        }
        for(int i=0; i < toSort.length; i++){
            toSort[i] = result[i];
        }
        return toSort;
    }
    private static String dataToString (int[] data){
        return Arrays.stream(data).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }

    public static void main(String[] args){
        int size = (int)((1 - Math.random())*10)+10;
        int[] data = new int[size];
        for(int i=0; i < size; i++){
            data[i] = (int)((Math.random())*100);
        }
        int A = (int)(Math.random()*size);
        int B = (int)(Math.random()*size);
        data[A] = data[B];
        System.out.println("List going in: " + dataToString(data));
        Sort(data);
        System.out.println("List going out: " + dataToString(data));
    }
}
