package Calificacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> listado = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int numEntradas;
        String entrada1, entrada2;
        
        numEntradas = sc.nextInt();
        
        for (int i = 0; i < numEntradas; i++) {
            entrada1 = sc.next();
            entrada2 = sc.next();
            if(entrada1.equals("C-3PO") && entrada2.equals("creador")){
                listado.add(entrada1+", yo soy tu "+entrada2);
            } else if(entrada1.equals("Luke") && entrada2.equals("padre")){
                listado.add("TOP SECRET");
            } else if(entrada1.equals("Luke") && entrada2.equals("Padre")){
                listado.add(entrada1+", yo soy tu "+entrada2);
            } else if(entrada1.equals("Princesa") && entrada2.equals("Principe")){
                listado.add(entrada1+", yo soy tu "+entrada2);
            }
        }
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
        }
    }
}
