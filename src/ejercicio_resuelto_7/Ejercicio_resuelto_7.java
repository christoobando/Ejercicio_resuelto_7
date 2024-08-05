/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_resuelto_7;

/**
 *
 * @author Christopher
 */
import java.util.Scanner;
public class Ejercicio_resuelto_7 {
    
    int A;
    int B;
    
    Ejercicio_resuelto_7(int A,int B){
        this.A = A;
        this.B = B;
    }

    String Comparar(int A, int B) {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    VentanaR7 ventana = new VentanaR7();
    ventana.show(true);
    }
    
}
