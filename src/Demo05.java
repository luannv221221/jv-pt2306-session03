public class Demo05 {
    public static void main(String[] args) {
        int num = 10;
        tang(num);
        System.out.println(num);
    }

    public static int tang(int num){
        num++;
        System.out.println("trong phuong thuc" + num);
        return num;
    }
}
