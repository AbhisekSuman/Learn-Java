package Algorithems;


import Class60.SearchingAlgos;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchingAlgos algos = new SearchingAlgos();

        String[] input1 = scanner.nextLine().split("\\s+");
        String[] input2 = scanner.nextLine().split("\\s+");

        int[] arr1 = new int[input1.length];
        int[] arr2 = new int[input2.length];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        ArrayList arrayList = new ArrayList();

        for (int i: arr2) {

            if (algos.binarySearch(arr1, i) > 0) {
                arrayList.add(i);
            }
        }

        System.out.println(arrayList);

    }
}
