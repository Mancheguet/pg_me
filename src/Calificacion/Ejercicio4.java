package Calificacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static Scanner sc = new Scanner(System.in);
    public static String[] dosStrings=new String[2];
    public static ArrayList<Integer> listadoResultados=new ArrayList();
    
    public static void main(String[] args) {
     
        
        int d=0, d2, n=0, n2, p=1, diasTotales=0;
        
        while(p!=0){
            
            d2=d;
            n2=n;
            
            p=sc.nextInt();
            
            for (int i = 0; i < p; i++) {
            
                String linea = sc.nextLine();
                dosStrings = linea.split(" ");
                d=Integer.parseInt(dosStrings[0]);
                n=Integer.parseInt(dosStrings[1]);
            
                diasTotales = d;
                
                if(d<d2){
                    
                    diasTotales = d2;
                    
                } else{
                    
                    diasTotales = d2+d2;
                }
            }
            listadoResultados.add(diasTotales);
            p = sc.nextInt();
        }
        
        for (int i = 0; i < listadoResultados.size(); i++) {
            System.out.println(listadoResultados.get(i));
        }
    }
}
