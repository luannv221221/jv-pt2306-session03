import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showMenu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhạp vào số thứ nhất ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhạp vào số thứ hai ");
                int b = Integer.parseInt(sc.nextLine());
                // gọi hàm
                System.out.printf("%d + %d = %d",a,b,tinhTong(a,b));
                break;
            case 2:
                break;
            default:
                System.out.println("Lua chon sai");
        }
    }

    // định nghĩa phương thức
    public static int tinhTong(int a, int b){
        int tong = a + b;
        return tong;
    }

    public static void showMenu(){
        System.out.println("========MENU========");
        System.out.println("1. Tính tổng 2 số");
        System.out.println("2. Tìm số lớn nhất trong 3 số nhập vào");
        System.out.println("Nhập vào lựa chọn");
    }
}
