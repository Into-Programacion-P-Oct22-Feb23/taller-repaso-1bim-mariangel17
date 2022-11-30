/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Usuario PC
 */
public class Repaso {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     entrada.useLocale(Locale.US);
    int numEmpleados = 0;
    int horasMatutinas = 0;
    int horasNocturnas = 0;
    int horasTotales = 0;
    double valorHoraMatutina = 10;
    double valorHoraNocturna = 15;
    double valorHoraNocturnaAdicional = 0;
    double valorHoraNocturnaAdicionalTotal = 0;
    double valorHoraNocturnaTotal = 0;
    double valorHoraMatutinaTotal = 0;
    double valorHoraTotal = 0;
    double valorSeguroSocial = 0;
    double valorTotal = 0;
    String nombre = "";
    String cedula = "";
    String ciudad = "";
    String continuar = "";
    boolean bandera = true;
    int contador = 0;
    String reporte="Nomina de Trabajadores\n";
    while(bandera){
     
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cédula del empleado");
        cedula = entrada.nextLine();
        System.out.println("Ingrese la ciudad de la empresa");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese las horas matutinas trabajadas");
        horasMatutinas = entrada.nextInt();
        System.out.println("Ingrese las horas nocturnas trabajadas");
        horasNocturnas = entrada.nextInt();
        horasTotales = horasMatutinas + horasNocturnas;
        valorHoraMatutinaTotal = horasMatutinas * valorHoraMatutina;
        valorHoraNocturnaTotal = horasNocturnas * valorHoraNocturna;
        if (horasNocturnas >= 10) {
            valorHoraNocturnaAdicional = valorHoraNocturna * 0.1;
            valorHoraNocturnaAdicionalTotal = valorHoraNocturnaAdicional * horasNocturnas;
            valorHoraNocturnaTotal = valorHoraNocturnaTotal + valorHoraNocturnaAdicionalTotal;
        }
        valorHoraTotal = valorHoraMatutinaTotal + valorHoraNocturnaTotal;
        valorSeguroSocial = valorHoraTotal * 0.18;
        valorTotal = valorHoraTotal - valorSeguroSocial;
        reporte = String.format("%s\nRol del trabajador de nombre %s y cédula %s.\n"
                + "Horas matutina trabajadas: %d.\n"
                + "Horas nocturnas trabajadas: %d.\n"
                + "Subtotal a cancelar $%.2f\n"
                + "Seguro Social $%.2f\n"
                + "Total a cancelar $%.2f\n", reporte, nombre, cedula, horasMatutinas, horasNocturnas, valorHoraTotal, valorSeguroSocial, valorTotal);
        System.out.println("Desea ingresar otro empleado? Ingrese Si");
        continuar = entrada.next();
        if (continuar.equals("Si")) {
                bandera = false;
                }
        System.out.println(reporte);
        System.out.println("Numero de empleados: " + contador);
   
    }
    }
    }    