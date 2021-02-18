package pila_algebraica;
import java.util.Stack;
/**@author Gustavo_Castillo*/
public class Pila_Algebraica {
    public static void main(String[] args) {
        String cadena = "(Cadena () (()(())))";
        String cadena2 = "(Cadena )(()()))";
        String cadena3 = "(Cadena () (()(()))) ";
        String cadena4 = "(Cadena )(()())) ";
        String cadena5 = "(Cadena )(()())) ";
        System.out.println("(123*4)+((12-1)*(1+2))");
        System.out.println(verificaParentesis(cadena));
        System.out.println("(123*4)+((12-1)*+1+2))");
        System.out.println(verificaParentesis(cadena2));
        System.out.println("((pila.size()==0)&&(flag))");
        System.out.println(verificaParentesis(cadena3));
        System.out.println("((pila.size)==0)&&(flag))");
        System.out.println(verificaParentesis(cadena4));
        System.out.println("((pila.size()==0)&&(flag)");
        System.out.println(verificaParentesis(cadena5));
    }
    public static boolean verificaParentesis(String cadena)  {
        Stack<String> pila = new Stack<String>();       int i = 0;
            while (i<cadena.length()) {  
                if(cadena.charAt(i)=='(') {pila.push("(");}                                
                else if  (cadena.charAt(i)==')') {  
                            if (!pila.empty()){ pila.pop(); } 
                            else { pila.push(")"); break; } 
                }
                i++;
            }
            if(pila.empty()){ return true; } else { return false; }
    }
}