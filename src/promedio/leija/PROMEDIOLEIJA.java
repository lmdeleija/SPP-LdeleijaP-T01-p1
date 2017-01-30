/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio.leija;
//meter el teclado
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class PROMEDIOLEIJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //meter variables numéricas
        double Mat, Cal1, Cal2, Cal3, Cal4, Cal5, Pro;
        //declarar el teclado
        Scanner Tec = new Scanner (System.in);
        
        //pedir datos
        System.out.println("Introduzca su matrícula sin A");
        Mat = Tec.nextDouble();
        System.out.println("Digite su calif 1");
        Cal1= Tec.nextDouble();
        System.out.println("Digite su calif 2");
        Cal2= Tec.nextDouble();
        System.out.println("Digite su calif 3");
        Cal3= Tec.nextDouble();
        System.out.println("Digite su calif 4");
        Cal4= Tec.nextDouble();
        System.out.println("Digite su calif 5");
        Cal5= Tec.nextDouble();
        
        Pro = ((Cal1+Cal2+Cal3+Cal4+Cal5)/5);
        System.out.println("Su promedio es =" + Pro);
        
        if (Pro<=6.9){
            System.out.println("REPROBADO");
        } else if(Pro>=7.0){
            System.out.println("APROBADO");
        }
    
        
        
    }
    
}
