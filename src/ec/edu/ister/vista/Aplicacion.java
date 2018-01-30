package ec.edu.ister.vista;

import ec.edu.ister.controlador.EstructurasBasicas;
import ec.edu.ister.modelo.Persona;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        EstructurasBasicas prueba= new EstructurasBasicas();
        //prueba.notasEstructura();
        prueba.notasEDDinamic();
        prueba.imprimirNotas();
        
        
        Persona A1= new Persona("Maria","Loya","123456789");
       Persona A2= new Persona("Fernando","Belitama","098765432");
       Persona persona= new Persona();
        Persona persona1 = new Persona("pauly","Gualpa","123456789");
        Persona persona2 = new Persona();
       persona.setNombre("Karen");
        persona.setApellido("Oña");
        
        JOptionPane.showMessageDialog(null, persona1.toString()+
                "\n\nSe han creado: "+Persona.getContador()+" objetos");
    }

}
