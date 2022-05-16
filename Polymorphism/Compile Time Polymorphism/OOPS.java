class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }
 
   public void displayInfo(int age) {
       System.out.println(age);
   }
 
   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}


public class OOPS{
    
    public static void main(String args[]){
        Student s1 = new Student();
        
        s1.age = 24;
        s1.name ="Prateek";
        
        s1.displayInfo(s1.name,s1.age);
    }
}