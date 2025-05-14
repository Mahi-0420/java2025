package j0514;

public class Main3 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20 + a;
        int c = 30 * 2;

        a = b = c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("こん" + a + "にちは");
    }
}
