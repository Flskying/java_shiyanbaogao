public class Simulator{
    public void playsound(Animal animal){
        System.out.println("正在发声的动物是："+animal.getAnimalName());
        animal.cry();
    }
}
