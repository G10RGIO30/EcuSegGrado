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
public class NoRaizRealException extends Exception {
    private double a,b,c;
    public NoRaizRealException (String m, double a, double b, double c){
        super(m);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String getMessage(){
        return "Para los coeficientes "+(float)a+", "+(float)b+", "+(float)c + super.getMessage();
    }
}
