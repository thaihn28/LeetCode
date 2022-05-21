package Tutorial;

public class totalDigitOfNumber {
    public static int DEC_10 = 10;
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int num = ScannerIns.SC.nextInt();

        String convertNum = Integer.toString(num);

        System.out.println(totalDigitsOfNumber(num));

        System.out.println(10 + 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 + 20);
    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
