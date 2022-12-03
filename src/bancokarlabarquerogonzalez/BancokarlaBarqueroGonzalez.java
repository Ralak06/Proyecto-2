/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancokarlabarquerogonzalez;

import javax.swing.JOptionPane;

/**
 *
 * @author Karla
 */
public class BancokarlaBarqueroGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 

        Cola colaClientes1 = new Cola();
        Cola colaClientes2 = new Cola();
        Cola colaClientes3 = new Cola();
        Cola colaClientes4 = new Cola();
        int opc = 0, elemento = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Cliente por Cedula \n2 Eliminar elementos ."
                    
                    + ".\n3"
                    + " Salir"));

            switch (opc) {
                case 1:

                    System.out.println("Ingresa el Cliente");
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa elemento en la cola 1 ", JOptionPane.QUESTION_MESSAGE));
                    colaClientes1.insertar(elemento);
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa elemento en la cola 2 ", JOptionPane.QUESTION_MESSAGE));
                    colaClientes2.insertar(elemento);
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa elemento en la cola 3 ", JOptionPane.QUESTION_MESSAGE));
                    colaClientes3.insertar(elemento);
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa elemento en la cola 4 ", JOptionPane.QUESTION_MESSAGE));
                    colaClientes4.insertar(elemento);

                    break;

                case 2:
                    if (!colaClientes1.estavacia()) {
                        JOptionPane.showInputDialog(null, "El elemento atendido es" + colaClientes1.quitar());
                        JOptionPane.showInputDialog(null, "El elemento atendido es" + colaClientes2.quitar());
                        JOptionPane.showInputDialog(null, "El elemento atendido es" + colaClientes3.quitar());
                        JOptionPane.showInputDialog(null, "El elemento atendido es" + colaClientes4.quitar());

                    } else {
                        JOptionPane.showInputDialog(null, "la cola esta vacia ");
                    }
                    break;
                
              
          
                
                
                default:
            }
        } while (opc != 4);

    }
}
