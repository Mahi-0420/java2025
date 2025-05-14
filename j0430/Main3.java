package j0430;

public class Main3 {
    public static void main(String[] args) {
        double pi = 3.14;   // 円周率
        int pie = 5;        // 食べられるアップルパイの半径

    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pie);
    System.out.println("パイの半径を倍にします");
    pi = 10;    // 誤り！代入すべき変数[pie]
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    }
}
