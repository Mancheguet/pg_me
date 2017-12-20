package Calificacion;

import java.util.Scanner;

public class Ejercicio4 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
     
        
        int d, d2, n, n2, p, diasTotales;
        
        p = sc.nextInt();
        
        while(p!=0){
        
            d=sc.nextInt();
            n=sc.nextInt();
            diasTotales = d;
            
            for (int i = 1; i < p; i++) {
                d2=sc.nextInt();
                n2=sc.nextInt();
                
                if(d<d2){
                    diasTotales = d2;
                } else{
                    
                   //diasTotales +=;
                }
                p = sc.nextInt();
            }

        }
        
        
        
        
    }
    
}
