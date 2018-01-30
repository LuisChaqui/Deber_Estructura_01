package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class EstructurasBasicas {
    Persona [] lista = new Persona[5];
    int numeros[]= new int[5];
    double notas[]= new double[5];
    Scanner input = new Scanner(System.in);
    public void notasEstructura(){
        notas[0]=Math.random();
        notas[1]=Double.parseDouble(JOptionPane.showInputDialog("ingres una nota"));
        notas[2]=input.nextDouble();
        notas[3]=6.8;
        notas[4]=Math.random()*5;
    }
    
    public void notasEDDinamic(){
        for (int i = 0; i < notas.length; i++) {
            notas[i]=Math.random();
        }
    }
    public void imprimirNotas(){
       
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
    
}




