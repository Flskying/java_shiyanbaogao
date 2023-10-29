import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入数组的长度
        //System.out.print("请输入数组的长度 n: ");
        int n = scanner.nextInt();

        // 输入数组的元素
        int[] array = new int[n];
        //System.out.println("请输入 " + n + " 个整数:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // 统计谷值的个数
        int valleyCount = 0;

        if (n == 1) {
            // 如果只有一个元素，它也算作谷值
            valleyCount++;
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0 && array[i] <= array[i + 1]) {
                    valleyCount++;
                } else if (i == n - 1 && array[i] <= array[i - 1]) {
                    valleyCount++;
                } else if (array[i] <= array[i - 1] && array[i] <= array[i + 1]) {
                    valleyCount++;
                }
            }
        }

        System.out.println(valleyCount);

        scanner.close();
    }
}