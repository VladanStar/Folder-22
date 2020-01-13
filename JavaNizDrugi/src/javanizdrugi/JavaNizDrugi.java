
package javanizdrugi;

import java.util.Scanner;


public class JavaNizDrugi {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        /*for(int brojac:a)
            System.out.println(brojac);
        System.out.println(" ");
        */
        for(int i=0; i<5; i++)
        {
            System.out.println("Unesite vrednost elementa niza: ");
            a[i] = input.nextInt();
        }
       // for( int brojac :a){
        //    System.out.print(brojac + " ");
    
   // }
        for(int i =0; i<4; i++)
            for(int j=i+1;j<5;j++)
            {
               
                if(a[i]> a[j])
                {
                     int pom = a[i];
                    a[i] = a[j];
                    a[j] = pom;
                    }
            }
         for( int brojac :a){
            System.out.print(brojac + " ");
                    }
}
}
