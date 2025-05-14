package j0514;

public class Main2 {
    public static void main(String[] args) {
        String prof1 = "名前:朝香あゆみ\n （あさかあゆみ）";
        int age = 30;
        String prof2 = """
                    名前:朝香あゆみ
                    （あさかあゆみ）
                    ↑ふりがな
                    """;
        System.out.println(prof1);
        System.out.println(prof2);
        System.out.println("年齢:" + age);
    }
}
