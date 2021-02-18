package pila_sum_res;
/*** @author Gustavo_Castillo*/
public class Pila_SUM_RES {
    public static void main(String[] args) {
        System.out.println("SUMA Y RESTA DE PILAS");
        int numero;
        numero =1;
        int [] Pila1 = new int[numero];
        int [] Pila2 = new int[numero];
        int [] Pila3 = new int[numero];
        int [] Pila4 = new int[numero];
        int [] sumaPila = new int [numero];
        System.out.println("");
        for(int  p = 0; p < numero; p++){}
        int p = 0;
        Pila1[p] = (int) (Math.random() + 10 + 15);
        System.out.println("Suma (10) , Suma(15) = " + Pila1[p]);
        Pila2[p] = (int) (Math.random() + 25 - 5);
        System.out.println("Suma (15) , Resta(5) = " + Pila2[p]);
        Pila3[p] = (int) (Math.random() +  25 + 0);
        System.out.println("Cancelar() = " + Pila3[p]);
        Pila4[p] = (int) (Math.random() +  20 + 15);
        System.out.println("Resta(5) , Suma(15) = " + Pila4[p]);
        for (int s = 0; s<numero; s++){
        sumaPila[s]=Pila1[s] + Pila2[s] + Pila3[p] + Pila4[p];
        }
        System.out.println("");
        int s = 0;
        System.out.println("Total general = "  + sumaPila[s] );
    }
}