/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto6.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        int num_positivos=0;
        int num_negativos=0;
        int ceros=0;
        for (int i = 1; i <= 10; i++){
            System.out.print("ingrse un numero " + i + ": ");
            num=input.nextInt();
            if (num>0){
            num_positivos+=1;}
            else if (num<0){
            num_negativos+=1;}
            else {
            ceros+=1;}
        }
        System.out.print("numeros positivos: " + num_positivos + "\nnumeros negativos: " + num_negativos + "\nceros: " + ceros);
        
    }
    
}
