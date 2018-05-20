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
public class testZad3 {
    public static void main(String[] arg0){
        zad3 z3 = new zad3();
        
        try
        {
            z3.a();
            System.out.println("Znaleziono wyjątek");
        }
        catch(ArithmeticException e)
                {
                    System.out.println("Nie znaleziono wyjątku");
                }
        
    }
}
