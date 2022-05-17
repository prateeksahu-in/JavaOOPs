abstract class Animal{
    
    abstract void walk();
}


class Horse extends Animal{
    public void walk(){
        System.out.println("4legs");
    }
}


class Chiken extends Animal{
    public void walk(){
        System.out.println("2legs");
    }
}

public class OOPS {
    public static void main(String args[]) {
      
        Horse h1 = new Horse();
        h1.walk();
        Chiken c1 = new Chiken();
        c1.walk();
    }
}