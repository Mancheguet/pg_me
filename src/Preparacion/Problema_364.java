package Preparacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema_364 {

    public static Scanner sc = new Scanner(System.in);
    public static final String FIN = "FIN";
    public static ArrayList<String> listado = new ArrayList<>();
    
    public static void main(String[] args) {

        String alf="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String codi="BCDEFGHIJKLMNOPQRSTUVWXYZA";
       
        String linea=sc.nextLine();
        String linea2;
        while(!linea.equals(FIN) && (linea.length()<=100)){
            linea2="";
            linea=linea.toUpperCase();
            for (int i = 0; i < linea.length(); i++) {
                if(!(linea.charAt(i)==' ')){
                    for (int j = 0; j < alf.length(); j++) {
                        if(linea.charAt(i)==alf.charAt(j)){
                            linea2+=codi.charAt(j);
                        }
                    }
                }else{
                    linea2+=" ";
                }
            }
            
            
            listado.add(linea2);
            linea=sc.nextLine();
        }
        
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
        }
        
        
    }
}
