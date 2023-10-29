abstract class Employee {
    public abstract double earnings();
}
class YearWorker extends Employee {
    int yearworker;
    double yearsalary;
    YearWorker(int y, double s){
        yearworker = y;
        yearsalary = s;
    }
    public double earnings(){
        return yearworker * yearsalary;
    }   //重写earnings()方法
}
class MonthWorker extends Employee {
    int monthworker;
    double monthsalary;
    MonthWorker(int m, double s){
        monthworker = m;
        monthsalary = s;
    }
    public double earnings(){
        return monthworker * monthsalary;
    }	 //重写earnings()方法
}
class WeekWorker extends Employee {
    int weekworker;
    double weeksalary;
    WeekWorker(int w, double s){
        weekworker = w;
        weeksalary = s;
    }
    public double earnings(){
        return weekworker * weeksalary;
    } 	 //重写earnings()方法。
}
class Company {
    Employee[] employee;
    double salaries=0;
    Company(Employee[] employee) {
        this.employee=employee;
    }
    public double salariesPay() {
        salaries=0;
        //计算salaries
        return salaries;
    }
}
public class Main{

}