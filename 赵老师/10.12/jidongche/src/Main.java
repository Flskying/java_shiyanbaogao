import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Vehicle car1,car2;  //构造两个对象

        car1=new Vehicle();
        car2=new Vehicle();
        car1.setPower(128);     //为car1设置功率
        car2.setPower(76);      //为car2设置功率
        System.out.println("car1的功率是："+car1.getPower()); //获取car1功率
        System.out.println("car2的功率是："+car2.getPower());     //获取car2功率

        car1.speed=80.0;    //设置car1和car2速度为80.0
        car2.speed=80.0;
        System.out.println("car1目前的速度："+car1.speed);    //获取速度
        System.out.println("car2目前的速度："+car2.speed);

        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1目前的速度：70.0");    //获取速度
        System.out.println("car2目前的速度：60.0");
    }
}
// your code
class Vehicle {
    double speed;
    int power;
    //加速
    public void speedUp(int m){
        speed=speed+m;
    }
    public void speedDown(int n){
        if(speed>n)
        speed=speed-n;
    }
    //设置机动车功率
    public void setPower(int p){

       // Scanner setp=new Scanner(System.in);
        power=p;
       // System.out.println("请输入机动车功率");
    }
    //获取机动车功率
    public int getPower(){
        return power;
        //System.out.println("的功率是："+power);
    }


}