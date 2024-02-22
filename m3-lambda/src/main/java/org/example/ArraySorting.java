package org.example;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSorting = () -> System.out.println("Quick sorting");

        as.sort(quickSorting);

        as.sort(()-> System.out.println("quick sorting"));

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
