class People{
    protected double height,weight;
    public void speakHello(){}
    public void averageHeight(){}
    public void averageWeight(){}
        }

class ChinaPeople extends People{
    public void chinaGongfu(String b){
        System.out.println(b);
    }
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        System.out.println("中国人的平均身高:"+height+" 厘米");
    }
    public void averageWeight(){
        System.out.println("中国人的平均体重:"+weight+"千克");
    }
        }

class AmericanPeople extends People {

    public void americanBoxing(String a){
        System.out.println(a);
    }
    public void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        System.out.println("American's average height"+height+"cm");
    }
    public void averageWeight(){
        System.out.println("American's average weight:"+weight+"kg");
    }
        }

class BeijingPeople extends ChinaPeople{
    public void beijingOpera(String c){
        System.out.println(c);
    }
    public void speakHello(){
        System.out.println("您好");
    }
    public void averageHeight(){
        System.out.println("北京人的平均身高:"+height+" 厘米");
    }
    public void averageWeight(){
        System.out.println("北京人的平均体重:"+weight+"千克");
    }
        }

public class Main {
         public static void main(String args[]) {
         ChinaPeople chinaPeople = new ChinaPeople();
         AmericanPeople americanPeople = new AmericanPeople();
         BeijingPeople beijingPeople = new BeijingPeople();
         chinaPeople.speakHello();
         americanPeople.speakHello();
         beijingPeople.speakHello();
         chinaPeople.height = 168.78;
         chinaPeople.averageHeight();
         americanPeople.height = 176.0;
         americanPeople.averageHeight();
         beijingPeople.height = 172.5;
         beijingPeople.averageHeight();
         chinaPeople.weight = 65;
         chinaPeople.averageWeight();
         americanPeople.weight=75;
         americanPeople.averageWeight();
         beijingPeople.weight = 70.0;
         beijingPeople.averageWeight();
         chinaPeople.chinaGongfu("坐如钟,站如松,睡如弓");
         americanPeople.americanBoxing("直拳、钩拳、组合拳");
         beijingPeople.beijingOpera("花脸、青衣、花旦和老生");
         chinaPeople.chinaGongfu("坐如钟,站如松,睡如弓");
         }
        }