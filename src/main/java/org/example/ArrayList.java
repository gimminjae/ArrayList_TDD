package org.example;

import java.util.List;

public class ArrayList {


    private int[] arr;

    private int size;
    ArrayList() {
        arr = new int[2];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(int i) {
        if(size == arr.length) {
            int[] nArr = new int[arr.length * 2];
            for(int j = 0; j < arr.length; j++) {
                nArr[j] = arr[j];
            }
            arr = nArr;
        }
        arr[size] = i;
        size++;
    }

    public int get(int i) {
        return arr[i];
    }

    public void removeAt(int i) {
        for(int j = i; j < size; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i < size; i++) {
            System.out.printf("%d : %d", i, arr[i]);
        }
    }
}
