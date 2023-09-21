public class Empleetest
{
    public static void main(String[] args){
        Emplyee emp1 = new Emplyee();

        emp1.id = 43;
        emp1.name = "赵泽辉";
        emp1.age = 22;
        emp1.salary = 12000;

        emp1.birthday = new MyDate();
        emp1.birthday.year = 2002;
        emp1.birthday.month = 10;
        emp1.birthday.day = 22 ;
        //打印老板信息
        System.out.println("id = " + emp1.id + ",name=" + emp1.name + ",age=" + emp1.age + ",salary=" + emp1.salary + ",borthday = ["
        + emp1.birthday.year + "年" + emp1.birthday.month + "月" + emp1.birthday.day + "日]");
    }
}