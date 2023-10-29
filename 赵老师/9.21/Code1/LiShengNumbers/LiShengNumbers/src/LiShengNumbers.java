import java.util.Scanner;
public class LiShengNumbers {


        public static void main(String[] args) {
            int n = 2; // 范围的起始值
            int m; // 范围的结束值
            Scanner input =new Scanner(System.in);
            m = input.nextInt();
            for (int i = n; i <= m - 2; i++) {

                if (isPrime(i) && isPrime(i + 2)) {
                    System.out.println("(孪生数为:" + i + "," + (i + 2) + ")");
                }
            }
        }

        // 检查一个数是否为素数
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            if (num == 2 || num == 3) {
                return true;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                return false;
            }

            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }
    }
