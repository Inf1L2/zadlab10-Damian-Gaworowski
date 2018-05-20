package zad2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */


public class zad2 {
    public static void main(String[] args) {
        int[] tablica = {22, 23, 34, 45, 21};
        Scanner sc = new Scanner(System.in);
        
        System.out.println("elem tab ?");
        int index = sc.nextInt();
        sc.close();
        try {
            System.out.println(tablica[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Niema takiego elem tab");
        }
    }
}
