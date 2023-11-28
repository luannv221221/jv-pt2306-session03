import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // khai bao bien mang chua tuoi cua 3 ban sinh vien

        /*
        int age1 = 10;
        int age2 = 11;
        int age3 = 13;
        */
        int[] ages = {10,11,13};

        // truy cập vào phần tử thứ nhất
        ages[0] = 18;
        System.out.println("Tuoi cua hoc sinh thu nhat la : "+ages[0]);
        System.out.println("Tuoi cua học sinh thứ ba "+ages[2]);

        // khai bao mang chua ten của 3 sinh vien
        String[] studentNames = new String[3];

        Scanner sc = new Scanner(System.in);
        
        /*
        System.out.println("Nhập vào họ tên sinh viên thứ nhất");
        studentNames[0] = sc.nextLine();
        System.out.println("Nhập vào họ tên sinh viên thứ hai");
        studentNames[1] = sc.nextLine();
        System.out.println("Nhập vào họ tên sinh viên thứ ba");
        studentNames[2] = sc.nextLine();
        */
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Nhập vào họ tên sinh viên thứ "+(i+1));
            studentNames[i] = sc.nextLine();
        }
        
        System.out.println("Danh sách sinh viên");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }

        /*
        Khai mảng số nguyên có 10 phần tử
          int[] nums = new int[10];
        Nhập vào 10 phần tử
          // for nhập
        // tính tổng của 10 phần tử
          // duyệt qua tất cả phần tử cộng dồn vào
        // in ra những phần tử có giá trị chẵn
          // chia hết cho 2
        // tìm phần tử lớn nhất
          // if
          */

        // duệt phần tử của mảng thông qua vòng lặp
    }
}
