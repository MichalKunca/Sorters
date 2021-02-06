package org.flamingfly.gfa;

public abstract class AbstractSorter {
    protected static AbstractSorter instance;
    protected static void getInstance(){

    }

    public static int[] Sort(int[] toSort){
        if(instance == null){
            getInstance();
        }
        return instance.DoSort(toSort);
    }
    private int[] DoSort(int[] data){
        return null;
    }
}
