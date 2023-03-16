
package javaapplication25;

import java.util.Scanner;

public class JavaApplication25 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,top=0;
        System.out.println("sayi :");
        sayi=input.nextInt();
        
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0) {
                top+=i;
               
            }
            
        }
        if(top==sayi){
            System.out.println("mukemmel sayidir");
        }else{
            System.out.println("mukemmel sayi degil");
        }
    }
    
}
