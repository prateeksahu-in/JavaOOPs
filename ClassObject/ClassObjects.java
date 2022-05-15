class Pen{
    
    String color;
    String type;
    
    public void write(){
        System.out.println("writing something");
    }
    
    public void printColor(){
        System.out.println(this.color);
    }
}

public class ClassObjects{
    
    public static void main(String args[]){
        Pen pen1 = new Pen();
        
        pen1.color = "Blue";
        pen1.type = "Gel";
        
        System.out.println(pen1.color);
        System.out.println(pen1.type);
        
        pen1.write();

        
        Pen pen2 = new Pen();
        pen2.color = "Black";
        
        pen1.printColor();
        pen2.printColor();
    }
    
    
}