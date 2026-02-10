import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        /* =====================
           SOAL 1: Overflow int
           ===================== */
        if (soal.equals("Soal1")) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Deteksi overflow tanpa long / BigInteger
            if ((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) ||
                (a < 0 && b < 0 && a < Integer.MIN_VALUE - b)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(a + b);
            }
        }

        /* ==========================
           SOAL 2: Float vs Double
           ========================== */
        else if (soal.equals("Soal2")) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float floatSum = (float) x + (float) y;
            double doubleSum = x + y;

            double diff = Math.abs(doubleSum - floatSum);

            System.out.printf("%.6f%n", diff);
        }

        /* ==========================
           SOAL 3: Wrapper Comparison
           ========================== */
        else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

            Integer a = Integer.valueOf(N); // objek Integer
            Integer b = Integer.valueOf(a); // salin NILAI, bukan referensi

            a = a + 1; // membuat objek baru

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        /* ==========================
           SOAL 4: String Reference
           ========================== */
        else if (soal.equals("Soal4")) {
            String S = sc.next();

            String a = S;
            String b = new String(S);

            a = a + "X"; // String immutable

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        /* ==========================
           SOAL 5: Parsing & Safety
           ========================== */
        else if (soal.equals("Soal5")) {
            int i = Integer.parseInt(sc.next());
            double d = Double.parseDouble(sc.next());
            boolean flag = Boolean.parseBoolean(sc.next());

            double result = i * d;

            if (!flag) {
                result = -result;
            }

            System.out.printf("%.2f%n", result);
        }

        sc.close();
    }
}
