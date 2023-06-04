public class task4 {
    public static void main(String[] args) {
        int n = 10;
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println("Факторіал " + n + " за допомогою циклу for: " + f);

        f = 1;
        int i = 1;
        while (i <= n) {
            f=f*i;
            i++;
        }
        System.out.println("Факторіал " + n + " за допомогою циклу while: " + f);
    }
}
