import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // khai báo mảng số nguyên 10 phần tử
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các phần tử của mảng");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            nums[i] = sc.nextInt();
        }
        // khai báo biến tổng
        int sum = 0;
        // in ra các phần tử của mảng
        for (int i = 0; i < nums.length; i++) {
            // tính tổng
           //sum = sum + nums[i];
            sum += nums[i];

        }
        System.out.println("Tổng các phần tử là "+sum);

        System.out.println("Tất cả phần tử có giá trị chẵn");
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
                System.out.println(nums[i]);
        }

        // tìm phần tử lớn nhất
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là : "+ max);
    }
}
