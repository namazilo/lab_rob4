public class task3 {
    public static void main(String[] args) {
    int n = 10;
    System.out.print("Дільники числа " + n + ": ");
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            System.out.print(i + " ");
        }
    }
  }
}
