import java.io.*;
import java.util.*;

public class Person {
    private int age;    
  
    public Person(int initialAge) {
          if(initialAge < 0 ) {
              
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
              
          }
          else {
              
              this.age = initialAge;
          }
          
          
          
    }

    public void amIOld() {
         
        String message = "";
        if(age < 13){
            message = "You are young.";
        }else if(age>=3 && age<18){
            message="You are a teenager.";
        }else{
            message = "You are old.";
        }
        System.out.println(message);
    }

    public void yearPasses() {
         
         age ++;
         
         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int i = 0; i<T; i++){
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j=0; j<3; j++){
                p.yearPasses();   
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();   
        }
}