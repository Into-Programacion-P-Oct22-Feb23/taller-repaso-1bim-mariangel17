/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author SALA I
 */
public class Repaso {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        String nombre="";
        int numero_empleados=0;
        int cedula= 0;
        int horas_matutinas= 0;
        int hora_matutina_adicional;
        int hora_nocturna_adicional;
        int horas_nocturnas= 0;
        String ciudad;
        double sueldo_final;
        int contador;
        double horas_total=0;
        String opcion = null;
        double total_horas_matutinas;
        double total_horas_nocturnas;
        String informe="Rol del trabajador";
        double valor_seguro_social= 0;
        int valor_hora_total=0;
        int horas_matutinas_total = 0;
        int horas_nocturnas_total = 0;
   
        System.out.println("Ingrese el nombre del empleado");
        nombre=entrada.nextLine();
        System.out.println("Ingrese la cédula del empleado");
        cedula=entrada.nextInt();
        System.out.println("Ingrese las horas matutinas");
        horas_matutinas = entrada.nextInt();
        System.out.println("Ingrese las horas nocturnas");
        horas_nocturnas = entrada.nextInt();
        System.out.println("Ingrese la ciudad de la empresa");
        ciudad = entrada.nextLine();
        horas_total= horas_matutinas + horas_nocturnas;
        total_horas_matutinas= horas_matutinas * horas_matutinas_total;
        total_horas_nocturnas= horas_nocturnas * horas_nocturnas_total;
        if (horas_nocturnas <= 10 ){
          total_horas_nocturnas= total_horas_nocturnas*1.1;
           }
        valor_seguro_social= valor_hora_total*0.18;
        valor_hora_total = horas_matutinas +horas_nocturnas;
        horas_total= valor_hora_total + valor_seguro_social;
    
        informe = String.format("%s\nRol del trabajador%s y cédula%s\n "
                + "+horas_matutinas%d\n"+ "horas_nocturnas%d\n",informe,cedula,horas_matutinas,horas_nocturnas);
        
        


        }
        
        }
        
        
   

      
