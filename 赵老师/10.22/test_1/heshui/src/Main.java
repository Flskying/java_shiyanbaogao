class Village {
         static int waterAmount;
         int peopleNumber;
         String name;
         Village(String s){
         name = s;
         }
         static void setWaterAmount(int m){
         if(m>0)
         waterAmount=m;
         }
         void drinkWater(int n){
         if(waterAmount-n>0){
         waterAmount=waterAmount-n;
         System.out.println(name+"喝了"+n+"升水");
         }
         else
         waterAmount=0;
         }
         static int lookWaterAmount(){
         return waterAmount;
         }
         void setPeopleNumber(int n){
         peopleNumber=n;
         }
         int getPeopleNumber(){
         return peopleNumber;
         }
        }
         public class Main {
         public static void main(String []args){
         Village.setWaterAmount(200);
         int leftWater = Village.waterAmount;
         System.out.println("水井中有 " +leftWater+ " 升水");
         Village zhaozhuang,majiahezhi;
         zhaozhuang=new Village("赵庄");
         majiahezhi=new Village("马家河子");
         zhaozhuang.setPeopleNumber(80);
         majiahezhi.setPeopleNumber(120);
         zhaozhuang.drinkWater(50);
         leftWater=majiahezhi.lookWaterAmount();
         String name=majiahezhi.name;
         System.out.println(name+"发现水井中有 "+leftWater+" 升水");
         majiahezhi.drinkWater(100);
         leftWater=zhaozhuang.lookWaterAmount();
         name=zhaozhuang.name;
         System.out.println(name+"发现水井中有 " + leftWater +" 升水");
         int peopleNumber=zhaozhuang.getPeopleNumber();
         System.out.println("赵庄的人口:"+peopleNumber);
         peopleNumber=majiahezhi.getPeopleNumber();
         System.out.println("马家河子的人口:"+peopleNumber);
         }
        }