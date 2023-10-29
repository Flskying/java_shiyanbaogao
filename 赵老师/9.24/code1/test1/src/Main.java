import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("最大公约数（GCD）是：" + gcd);
        System.out.println("最小公倍数（LCM）是：" + lcm);
    }

    // 计算最大公约数
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 计算最小公倍数
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
}
