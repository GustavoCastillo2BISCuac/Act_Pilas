package pila_html;
import java.util.Stack;
/**@author Gustavo_Castillo */
public class Pila_HTML {
    public static void main(String[] args) {
        String cadena = "<Cadena <> <<><<>>>>";
        String cadena2 = "<Cadena ><<><>>>";
        String cadena3 = "<Cadena ><<><>>>";
        System.out.println("<b><i>Hola Uac</i></b>");
        System.out.println(verificarParentesis(cadena));
        System.out.println("<b><i>Hola FI</i>/b>");
        System.out.println(verificarParentesis(cadena2));
        System.out.println("<b><i>Hola ISC</i></b");
        System.out.println(verificarParentesis(cadena3));
    }
    public static boolean verificarParentesis(String cadena)  {
        Stack<String> pila = new Stack<String>();       int i = 0;
            while (i<cadena.length()) {
                if(cadena.charAt(i)=='<') {pila.push("<");}
                else if  (cadena.charAt(i)=='>') {  
                            if (!pila.empty()){ pila.pop(); } 
                            else { pila.push(">"); break; } 
                }
                i++;
            }
            if(pila.empty()){ return true; } else { return false; }
    }
}