import java.util.Scanner;
public class shulie {
    int n1; //首项
    double d; //公差
    double n2; //项数
    double sum=0; // 前n项和
    double an;
    Scanner input =new Scanner(System.in);
    //获取n1首项的值
    public int getN1() {
        System.out.print("请输入首项n1: ");
        n1 = input.nextInt();
        return n1;
    }
    //获取公差d的值
    public double getD() {
        System.out.print("请输入公差d: ");
        d = input.nextInt();
        return d;
    }
    //获取项数的值
    public double getN2(){
        System.out.print("请输入项数n2: ");
        n2 = input.nextInt();
        return n2;
    }
    //计算sum的值
    public double dosum(){
        sum=n2*(n1+(n1+(n2-1)*d))/2;
        System.out.println(sum);
        return sum;
    }
}
