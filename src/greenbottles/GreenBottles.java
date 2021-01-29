
package greenbottles;

import java.util.Scanner;

public class GreenBottles {

   
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    System.out.println("Please input a number of green bottles:");
    int bottles = input.nextInt();
    
    
    while(bottles>0){
        System.out.println(bottles+" green bottles sitting on a wall, "+bottles+" green bottles sitting on a wall, and if one green bottle should accidentally fall, there will be "+(bottles=bottles-1)+" green bottles sitting on the wall…");
    }
        
        
    }
    
}
