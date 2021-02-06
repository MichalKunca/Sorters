package org.flamingfly.gfa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FailSortTest {

    @Test
    void sort() {
        int size = (int)((1 - Math.random())*10)+10;
        int[] data1, data2;
        data1= new int[size];
        data2= new int[size];
        for(int i=0; i < size; i++){
            data1[i] = (int)((Math.random())*100);
        }
        // ensure at leas one duplicate
        data1[(int)(Math.random()*size)] = data1[(int)(Math.random()*size)];
        System.arraycopy(data1,0, data2, 0, size);
        Arrays.sort(data1);
        FailSort.Sort(data2);
        Assertions.assertArrayEquals(data1, data2);
    }
}