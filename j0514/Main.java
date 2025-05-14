package j0514;

public class Main {
    public static void main(String[] args){
        // 変数の宣言
        int a;
        int b;

        // 値を代入
        a = 20;
        b = a + 5;

        System.out.println(a);
        System.out.println(b);

        // 10進数
        int c = 10;
        System.out.println("10進数" + c);
        // 16進数
        int d = 0x10;
        System.out.println("16進数" + d);
        // 8進数
        int e = 07;
        System.out.println("8進数" + e);
        // 2進数
        int f = 0b0011;
        System.out.println("2進数" + f);
    }
}
