 class Animal{
     public void sound(){
        System.out.println("some sound");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("meow meow");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("woof woof");
    }
}
interface Test2{

}
abstract class Test3{

}

interface Test{
    public static String alo(){
        return "";
    }
    public abstract void hehe();
    public  void gg();
    static String gg = "";
    final String gg2 = "";
}


public class Static{

    public static void main(String[]args){
        /*// Up-casting
        Animal animal1=new Cat();
        animal1.sound();
        // Up-casting
        Animal animal2 = new Dog();
        animal2.sound();*/
        int number = 987654, reverse = 0;
        /*while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);*/
        reverseNumber(4321);
}
    public static void reverseNumber(int number)
    {
        int x = 0;
        if (number < 10)
        {
            System.out.println(number);
            return ;
        }
        else
        {
            System.out.print(number % 10);
            reverseNumber(number/10);
        }
    }

    void test(){
        test2();
    }
    static void test2(){

    }
}
