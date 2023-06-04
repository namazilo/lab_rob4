public class tack5 {
    public static void main(String[] args) {

    int a = 0;

    for (int h = 0; h < 24; h++) {
        for (int m = 0; m < 60; m++) {
            int hT = h / 10; // перша цифра години
            int hO = h % 10; // друга цифра години
            int mT = m / 10; // перша цифра хв
            int mO = m % 10; // друга цифра хв

            if (hT == mO & hO == mT) {
                a++;
            }
        }
    }

    System.out.println("Кількість симетричних комбінацій: " + a);
}
}
