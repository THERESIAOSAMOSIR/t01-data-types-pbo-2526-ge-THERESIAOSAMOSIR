import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Solver {
    void solve(Scanner scanner);
}

class Soal1Solver implements Solver {
    @Override
    public void solve(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                int sum = a + b;
                boolean overflow = false;

                if (a > 0 && b > 0 && sum < 0) {
                    overflow = true;
                } else if (a < 0 && b < 0 && sum >= 0) {
                    overflow = true;
                }

                if (overflow) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(sum);
                }
            }
        }
    }
}

class Soal2Solver implements Solver {
    @Override
    public void solve(Scanner scanner) {
        if (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double y = scanner.nextDouble();
                float sumFloat = (float) x + (float) y;
                double sumDouble = x + y;
                double diff = Math.abs(sumFloat - sumDouble);
                System.out.printf("%.6f%n", diff);
            }
        }
    }
}

class Soal3Solver implements Solver {
    @Override
    public void solve(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Integer a = n;
            Integer b = a;
            a = a + 1;
            
            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }
    }
}

class Soal4Solver implements Solver {
    @Override
    public void solve(Scanner scanner) {
        if (scanner.hasNext()) {
            String s = scanner.next();
            String a = s;
            String b = new String(s);
            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }
    }
}

class Soal5Solver implements Solver {
    @Override
    public void solve(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (scanner.hasNextDouble()) {
                double dbl = scanner.nextDouble();
                if (scanner.hasNextBoolean()) {
                    boolean bool = scanner.nextBoolean();
                    double result = num * dbl;
                    if (!bool) {
                        result = result * -1;
                    }
                    System.out.printf("%.2f%n", result);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Solver> solvers = new HashMap<>();

        solvers.put("Soal1", new Soal1Solver());
        solvers.put("Soal2", new Soal2Solver());
        solvers.put("Soal3", new Soal3Solver());
        solvers.put("Soal4", new Soal4Solver());
        solvers.put("Soal5", new Soal5Solver());

        if (scanner.hasNext()) {
            String command = scanner.next();
            Solver solver = solvers.get(command);

            if (solver != null) {
                solver.solve(scanner);
            } else {
                System.out.println("Soal tidak ditemukan!");
            }
        }

        scanner.close();
    }
}