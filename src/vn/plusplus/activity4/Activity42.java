package vn.plusplus.activity4;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {
        // Nhập vào số phần tử
        System.out.print("Nhap vao so phan tu: ");
        Scanner intput = new Scanner(System.in);
        int n = intput.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Nhập vào giá trị từng phẩn tử
        for(int i=0;i<n;i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = intput.nextInt();
            list.add(arr[i]);
        }
        // In ra mảng ban đầu nhập vào
        System.out.println("Original array: ");
        System.out.print("Length = "+list.size()+"; arr[] =");
        for(int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
        // Xóa phần tử trùng lặp
        for(int i=0;i< list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                }
            }
        }
        // In ra mảng đã xóa
        System.out.println();
        System.out.println("Array after remove all duplicate elements: ");
        System.out.print("Length = "+list.size()+"; arr[] =");
        for(int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
    }
}
