// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
   static int sumaCifara(int n){
       int suma = 0;
       while(n != 0){
           suma += n%10;
           n/=10;
       }
       return suma;
   }
   public static void main(String[] args){
       System.out.println("Unesite broj n: ");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for(int i = 1; i<n; i++){
        if(i % sumaCifara(i) == 0){
            System.out.println(i);
        }
       }
   }
}