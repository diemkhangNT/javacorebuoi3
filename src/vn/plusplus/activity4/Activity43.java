package vn.plusplus.activity4;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Khởi tạo mảng động
        ArrayList<Integer> arrst = new ArrayList<Integer>();
        ArrayList<Integer> arrnd = new ArrayList<Integer>();
        // Nhập phần tử vào mảng 1 chiều và gán vào mảng động để dễ xử lý hơn
        System.out.print("Enter the size of the 1st array: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of the 1st array: ");
        for(int i = 0;i<n;i++){
            System.out.print("arr1["+i+"] = ");
            arr1[i] = input.nextInt();
            arrst.add(arr1[i]);
        }
        System.out.print("Enter the size of the 2nd array: ");
        int m = input.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements of the 2nd array: ");
        for(int i = 0;i<m;i++){
            System.out.print("arr2["+i+"] = ");
            arr2[i] = input.nextInt();
            arrnd.add(arr2[i]);
        }
        // Xuất 2 mảng vừa nhập
        System.out.println("Original array: ");
        System.out.print("Length = "+arrst.size()+"; elements =");
        for(int i=0;i<arrst.size();i++){
            System.out.print(" "+arrst.get(i));
        }
        System.out.println();
        System.out.print("Length = "+arrnd.size()+"; elements =");
        for(int i=0;i<arrnd.size();i++){
            System.out.print(" "+arrnd.get(i));
        }
        // Gộp các phần tử
        System.out.println();
        arrst.addAll(arrnd);
        System.out.println("Merged array: ");
        System.out.print("Length = "+arrst.size()+"; elements =");
        for(int i=0;i<arrst.size();i++){
            System.out.print(" "+arrst.get(i));
        }
    }
}
