/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author HP
 */
public class zad3 extends java.lang.Exception{
    public void a(){
        double a=15,b=0,wynik;
     
        try
        {
            wynik=a/b;
        }
        catch(ArithmeticException e)
                {
                    System.out.println("dzielisz przez 0");
                }
    }
}


