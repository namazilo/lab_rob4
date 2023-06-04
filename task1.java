public class task1 {
    public static void main(String[] args) {

        System.out.println("for");

        for (int i = 500; i <= 650; i = i + 10) {
            System.out.println(i);
        }

        int k = 500;
        int x = 650;

        System.out.println("while");

        while (k <= x) {
            System.out.println(k);
            k = k + 10;
        }

        k = 500;

        System.out.println("do-while");

        do {
            System.out.println(k);
            k = k + 10;
        } while (k <= x);
    }
}

