
package boletin2.pkg7;

import java.util.Scanner;


public class Boletin27 {

    public static void main(String[] args) {
        float centigrados, kelvin, farenhait;
    System.out.println("Grados Centígrados");
    Scanner dato = new Scanner (System.in);
    centigrados=dato.nextFloat();
    kelvin = (float) (centigrados-273);
    farenhait=  centigrados * 32 + (5/9);
    System.out.println("a temperatura expresada en grados kelvin é" +kelvin+ " e expresada en farenhait é " +farenhait);
    }
      
    }
    

