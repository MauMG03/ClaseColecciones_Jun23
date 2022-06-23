/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocolecciones;

import java.util.ArrayList;

/**
 *
 * @author invitado
 */
public class Empresa {
    ArrayList<Empleado> listadoEmpleados;

    
    Empresa(){
        listadoEmpleados = new ArrayList<>();
        
        listadoEmpleados.add(new Empleado("Pedro",1200000,"contador"));
        listadoEmpleados.add(new Empleado("Antonio",900000,"auxiliar"));
        listadoEmpleados.add(new Empleado("Manuel",750000,"auxiliar"));
        listadoEmpleados.add(new Empleado("Jose",1200000,"ventas"));
        listadoEmpleados.add(new Empleado("Sebastian",1000000,"bodega"));
        listadoEmpleados.add(new Empleado("Carlos",500000,"auxiliar"));
        listadoEmpleados.add(new Empleado("Pablo",850000,"auxiliar"));
        listadoEmpleados.add(new Empleado("Felipe",1250000,"tecnico"));
        listadoEmpleados.add(new Empleado("Rodrigo",2000000,"tecnico"));
        listadoEmpleados.add(new Empleado("Juan",2200000,"ceo"));
        
    }
    
    public float promedioSalarios(){
        
        float promedio = 0;
        for (Empleado empleado: listadoEmpleados) {
            promedio += empleado.getSalario();
        }
        
        promedio = promedio/listadoEmpleados.size();
        
        return promedio;
    }
    
    public void salarioAlto(){
        String nombreAlto = "";
        float salarioAlto = 0;
        for (Empleado empleado : listadoEmpleados) {
            
            if(salarioAlto < empleado.getSalario()){
                salarioAlto = empleado.getSalario();
                nombreAlto = empleado.getNombre();
            }
        }
        
        System.out.println("El Salario más alto es el de " + nombreAlto 
                + " con un valor de " + salarioAlto);
    }
    
    public void mejoresSalarios(){
        float promedio = promedioSalarios();
        
        System.out.println("Las personas que ganan un salario mayor al promedio"
                + " son: ");
        
        for (Empleado empleado : listadoEmpleados) {
            if(empleado.getSalario() > promedio){
                System.out.println(empleado.getNombre());
            }
        }
    }
    
    public void salariosAuxiliares(){
        System.out.println("Las personas con el cargo de auxiliar son:");
        
        for (Empleado empleado : listadoEmpleados) {
            if(empleado.getCargo() == "auxiliar"){
                System.out.println(empleado.getNombre() 
                        + " - "
                        + empleado.getSalario());
            }
        }
    }
}
