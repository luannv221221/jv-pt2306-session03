import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

//        float[] diemSV1 = {9,8,10};
//        float[] diemSV2 = {9,8,10};
//        float[] diemSV3 = {10,10,10};
//        float[] diemSV4 = {5,7,5};
//
//        // mảng đa chiều (2 chiều )
//        // mảng 2 chiều là mảng mà phần tử của nó lại là một mảng khac
//
//        float[][] diemSV = {diemSV1,diemSV2,diemSV3,diemSV4};
//
//        System.out.println(diemSV[3][1]);

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào các phần tử ");
        int[][] arr = new int[3][3];
        /*
        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();
        arr[0][2] = sc.nextInt();
        arr[1][0] = sc.nextInt();
        arr[1][1] = sc.nextInt();
        arr[1][2] = sc.nextInt();
        arr[2][0] = sc.nextInt();
        arr[2][1] = sc.nextInt();
        arr[2][2] = sc.nextInt();

        /*
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
         */

        // nhập vào các phần tử
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]=",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
        // in đường chéo chính
        System.out.println("đường chéo chính");
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i == j){
                        System.out.printf("%3d",arr[i][j]);
                    } else {
                        System.out.printf("\t");
                    }

                }
                System.out.println();
        }

        // in đường chéo chính
        System.out.println("đường chéo phụ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i + j == arr.length -1){
                    System.out.printf("%3d",arr[i][j]);
                } else {
                    System.out.printf("\t");
                }

            }
            System.out.println();
        }
        // in đường viền
        System.out.println("đường viền");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 0 || j == 0 || i == arr.length - 1 || j == arr.length -1){
                    System.out.printf("\t%d",arr[i][j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }
}
