package vn.plusplus.activity4;

import org.w3c.dom.css.CSSUnknownRule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Activity44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] arrfake = new int[n];
        System.out.println("Enter arr[n]:");
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("\tarr[" + i + "] = ");
            arr[i] = input.nextInt();
            arrfake[i] = arr[i];
        }
        //1. Tính trung bình cộng của các số lẻ ở vị trí chẵn.
        int j = 0, sum = 0;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 != 0) {
                    j++;
                    sum += arr[i];
                }
            }
        }
        System.out.println("1. AVG = " + ((float) sum / (float) j));
        //2. Tìm số lớn nhất trong mảng vừa nhập.
        int max = arr[0];
        for (i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("2. MAX = " + max);
        //3. Tìm số nhỏ nhất và vị trí của số nhỏ nhất đó trong mảng.
        int min, index = 0;
        min = arr[0];
        for (i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("3. MIN = " + min + ", INDEX = " + index);
        //4. Đếm các số chính phương có trong mảng.
        int count = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > 1 && (int) Math.sqrt(arr[i]) * (int) Math.sqrt(arr[i]) == arr[i]) {
                count++;
                for (int l = i + 1; l < n; l++) {
                    if (arr[i] == arr[l]) {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println("4. COUNT(not again) = " + count);
        //5. Hiển thị các số nguyên tố có trong mảng lên màn hình.
        System.out.print("5. PRIME(S): ");
        j=0;
        for (i = 0; i < n; i++) {
            boolean flag = true;
            if (arr[i] < 2) flag = false;
            else {
                for (int l = 2; l < arr[i]; l++) {
                    if (arr[i] % l == 0) {
                        flag = false;
                    }
                }
            }
            if (flag) System.out.print(arr[i] + " ");
            else j++;
        }
        if(j==arr.length) System.out.print("null");
        //6. Thay thế các phần tử âm có trong mảng bằng giá trị 0.
        System.out.print("\n6. ARRAY (replaced): ");
        for (i = 0; i < arrfake.length; i++) {
            if (arrfake[i] < 0) {
                arrfake[i] = 0;
            }
        }
        for (int e : arrfake) {
            System.out.print(e + " ");
        }
        //7. Xóa các phần tử âm có trong mảng.
        ArrayList<Integer> list = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        System.out.print("\n7. ARRAY (removed):" +
                " ");
        for (Integer e : list) {
            System.out.print(e + " ");
        }
        //8. Sắp xếp mảng đã nhập theo thứ tự giảm dần.
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\n8. ARRAY (sorted): ");
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
