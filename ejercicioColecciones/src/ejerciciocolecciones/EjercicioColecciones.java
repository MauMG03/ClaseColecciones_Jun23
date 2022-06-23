/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolecciones;

/**
 *
 * @author invitado
 */
public class EjercicioColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa miEmpresa = new Empresa();
        
        System.out.println("El promedio del salario de los empleados es de: "
                + miEmpresa.promedioSalarios() + "\n");
        
        
        miEmpresa.salarioAlto();
        System.out.println("");
        
        miEmpresa.mejoresSalarios();
        System.out.println("");
        
        miEmpresa.salariosAuxiliares();
    }
    
}
