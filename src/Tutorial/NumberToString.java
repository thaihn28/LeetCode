package Tutorial;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        NumberToString g = new NumberToString();
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Nhap n");
            n = sc.nextInt();
            System.out.println(g.numberToString(n));
        }
    }


    static String hangChuc(int number, boolean isThreeDigits, String[] textOfNumber) {
        String chuoi = "";
        // Lay so hang chuc (56/10 = 5)
        int chuc = number / 10;
        // Lay so hang don vi (56 % 10 = 6)
        int donVi = number % 10;
        // So hang chuc >= 20
        if (chuc > 1) {
            chuoi = " " + textOfNumber[chuc] + " muoi";
        } else if (chuc == 1) {//So hang chuc tu 10-19
            chuoi = " muoi";
        } else if (isThreeDigits && donVi > 0) {// Neu hang don vi khac 0 va co cac so hang tram (101 => daydu = true => doc "mot tram linh mot")
            chuoi = " linh";
        }

        if (donVi == 4 && chuc > 1) {//Neu don vi la so 4 va co hang chuc >=20 thi chuoi se la " tu" chu phong phai "bon"
            chuoi += " tu";
        }
        else if (donVi == 5 && chuc >= 1) {// Neu don vi la so 5 va co hang chuc thi chuoi se la " lam" chu phong phai "nam"
            chuoi += " lam";
        }else if ((donVi != 0) && (donVi != 4 || donVi != 5 ) || ( donVi == 1 && chuc == 0)) {
            chuoi += " " + textOfNumber[donVi];
        }
        return chuoi;
    }

    static String hangTram(int number, boolean isThreeDigits, String[] textOfNumber) {
        String chuoi = "";
        // Lay so hang tram (123 / 100 = 4)
        int tram = number / 100;
        // Lay phan du cua hang tram (123 % 100 = 23 (du 23)
        number = number % 100;
        if (isThreeDigits || tram > 0) {
            chuoi = " " + textOfNumber[tram] + " tram";
            chuoi += hangChuc(number, true, textOfNumber);
        } else {
            chuoi = hangChuc(number, false, textOfNumber);
        }
        return chuoi;
    }

    static String hangTrieu(int number, boolean isThreeDigits, String[] textOfNumber) {
        String chuoi = "";
        // Lay so hang trieu
        int trieu = number / 1000000;
        // Lay phan du sau so hang trieu 2 123 000 => du 123 000
        number = number % 1000000;
        if (trieu > 0) {
            chuoi = hangTram(trieu, isThreeDigits, textOfNumber) + " trieu";
            isThreeDigits = true;
        }
        // Lay hang nghin
        int nghin = number / 1000;
        // Lay phan du sau so hang nghin
        number = number % 1000;
        if (nghin > 0) {
            chuoi += hangTram(nghin, isThreeDigits, textOfNumber) + " nghin";
            isThreeDigits = true;
        }
        if (number > 0) {
            chuoi += hangTram(number, isThreeDigits, textOfNumber);
        }
        return chuoi;
    }
    static String numberToString(int a) {
        String[] textOfNumber = {"khong","mot","hai","ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        String result = "";
        int billion = 1000000000;

        if(a == 0) return textOfNumber[0];

        if (a >= billion) {
            return "Khong hop le";
        } else {
            result = hangTrieu(a, false, textOfNumber);
        }
        return result.trim();
    }
}
