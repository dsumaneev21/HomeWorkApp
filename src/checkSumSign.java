public class checkSumSign {
    public static void main(String[] args) {
        int a = 8;
        int b = -9;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else if (sum <=0) {
            System.out.println("Сумма отрицательная");
        }
    }
}