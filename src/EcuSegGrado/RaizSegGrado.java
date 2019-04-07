/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuSegGrado;

/**
 *
 * @author Giovanni
 */
public class RaizSegGrado {
    private double a,b,c;
    private double r1,r2;
    public RaizSegGrado(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void raices() throws NoRaizRealException, CoefAceroException{
        double discr;
        if(b*b < 4*a*c)
            throw new NoRaizRealException("Discriminante negativo",a,b,c);
        if(a==0)
            throw new CoefAceroException("No ecuacion de segundo grado ");
        discr = Math.sqrt(b*b - 4*a*c);
        r1 = (-b - discr) / (2*a);
        r2 = (-b + discr) / (2*a);
    }
    public void escribir(){
        System.out.println("Raices de la ecuacion: r1 = "+(float)r1+" r2 = "+(float)r2);
    }
}
