package trabalhopoo.q1;

import java.util.Scanner;

public class q1_a {
	   static Scanner input = new Scanner(System.in);
       public static void main(String[] args) {
           
           int tpalavra, a, b, c;
           
           System.out.printf("Digite uma palavra com 5 letras :\n");
           String palavra = input.nextLine();
           
           
           if(palavra.length() > 5) {
           System.out.printf("ERRO! Palavra com mais de cinco letras\n");
           }
           else {
           tpalavra = palavra.length();
           
           for(a = 0; a < tpalavra; a++)
               for(b = 0; b < tpalavra;b++)
                   for(c = 0; c < tpalavra;c++) {
                       if(a != b && a != c && b != c)
                           System.out.printf("%c%c%c \n",palavra.charAt(a), palavra.charAt(b), palavra.charAt(c));
                   }
           }
       }
}
