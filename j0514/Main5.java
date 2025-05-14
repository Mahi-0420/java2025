package j0514;

public class Main5 {
    public static void main(String[] args) {
        // 0-5まで画面に表示するfor文
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        // i++ : 後置インクリメント（+1していく）
        int i = 10;
        System.out.println(i++);
        System.out.println(i);

        // ++i : 前置インクリメント（+1してから）
        int j = 10;
        System.out.println(++j);
        System.out.println(j);
    }
}
