package pila_letra_par_impar;
import java.util.Scanner;
import java.util.Stack;
/**@author Gustavo_Castillo */
public class Pila_Letra_par_impar {

    public static void main(String[] args) {
        Scanner Inicio = new Scanner(System.in);
        String resp = "S"; String cadena = ("");
        while (resp.equalsIgnoreCase("S")){
            System.out.println ("¿Qué cadena desea analizar?");
            cadena=Inicio.nextLine();
            String textoPorPantalla="";
            char[] array = {'a','e','i','o','u'};
            for (int i=0; i<array.length; i++) {
                switch (analizarVocal(cadena,array[i])){
                    case 1: textoPorPantalla=textoPorPantalla+"\nEl número de letras "+array[i]+" es par. "; break;
                    case -1: textoPorPantalla=textoPorPantalla+"\nEl número de letras "+array[i]+" es impar. "; break;
                    case 0: textoPorPantalla=textoPorPantalla+"\nEl número de letras "+array[i]+" es cero. "; break;
                }
            }
                System.out.println (textoPorPantalla);
                System.out.print ("¿Desea analizar otra cadena? (S/N) ");
                resp = Inicio.nextLine();           
        }
    }
          public static int analizarVocal (String cadena, char vocalParaAnalizar) {
              Stack<String> pila = new Stack<String>(); char v=vocalParaAnalizar; String vocal=String.valueOf(vocalParaAnalizar);
              int i=0; int auxiliar=0;
              while (i<cadena.length()) {
                  if (Character.toLowerCase(cadena.charAt(i))==v&&pila.empty()) {pila.push(vocal); auxiliar++;}
                  else if (Character.toLowerCase(cadena.charAt(i))==v&&!pila.empty()) {pila.pop();}
                  i++;
              }
              if (auxiliar==0) {return 0;} else { if (pila.empty()) {return 1;} else {return -1;}}
    }
}