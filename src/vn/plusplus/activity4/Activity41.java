package vn.plusplus.activity4;

public class Activity41 {
    public static void main(String[] args) {
        // Chuong trinh in ra tat ca so Armstrong

        // Dung vong lap for chong len nhau
        /*int a, b, c;
        for(int i =0;i<5;i++){
            for(int j=0;j<10;j++){
                for(int k =0;k<10;k++){
                    a = i*i*i;
                    b = j*j*j;
                    c = k*k*k;
                    if(a+b+c == i*100 + j*10 +k){
                        System.out.println(a+b+c);
                    }
                }
            }
        }
        System.out.println("Ket thuc chuong trinh");*/
        // Dung mang 1 chieu
        int[] arr = new int[501];
        for(int i=0;i<501;i++){
            // Gan i vao arr[i]
            arr[i] = i;
            // Tách lấy từng số trong arr[i]
            int a = arr[i] / 100;
            int k = arr[i] % 100;
            int b = k / 10;
            int l = k % 10;
            int c = l;
            //System.out.println(arr[i] + " = " + (a*100+b*10+c));
            // Chọn ra số Armstrong với điều kiện arr[i] = a*a*a + b*b*b + c*c*c
            int arms = a*a*a + b*b*b + c*c*c;
            if(arr[i] == arms) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
