/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuSegGrado;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class Raices {
    public static void main(String[] args) {
        RaizSegGrado rc;
        double a,b,c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coeficientes de la ecuacion de segundo grado:");
        System.out.println("a = ");
        a = entrada.nextDouble();
        System.out.println("b = ");
        b = entrada.nextDouble();
        System.out.println("c = ");
        c = entrada.nextDouble();
        try{
            rc = new RaizSegGrado(a,b,c);
            rc.raices();
            rc.escribir();
        }catch(NoRaizRealException e){
            System.out.println(e.getMessage());
        }catch(CoefAceroException e){
            System.out.println(e.getMessage());
        }
    }
}
