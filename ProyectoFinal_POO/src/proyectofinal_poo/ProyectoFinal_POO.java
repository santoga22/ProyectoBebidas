/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal_poo;

/**
 *
 * @author USUARIO
 */
public class ProyectoFinal_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(1, "Tilin");
        Empleado empleado2 = new Empleado(2, "Ana");
        Empleado empleado3 = new Empleado(3, "David");

        // Métodos y variables de la clase bebidas
        Bebidas destinarBebidas = new Bebidas();
        int empleadoBebida[] = new int[1];
        String seleccionInicial []= new String[3];
        destinarBebidas.selectBebida(empleado3, empleado1, empleado2, empleado3, empleadoBebida,seleccionInicial);
        destinarBebidas.repetirCiclo(empleado3, empleado1, empleado2, empleado3, empleadoBebida, seleccionInicial);
        destinarBebidas.cambioBebida(empleado3, empleado1, empleado2, empleado3, empleadoBebida, seleccionInicial);
        destinarBebidas.cambioBebida(empleado3, empleado1, empleado2, empleado3, empleadoBebida, seleccionInicial);
    }
    
    
}
