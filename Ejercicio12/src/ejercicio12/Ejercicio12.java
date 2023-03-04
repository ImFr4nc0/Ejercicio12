/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        double horas, valor_h, salario_bruto, salario_neto, re_fuente;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas horas trabaja:");
        horas = entrada.nextDouble();
        System.out.println("Ingrese el valor por hora:");
        valor_h = entrada.nextDouble();
        salario_bruto = horas*valor_h;
        re_fuente = salario_bruto*0.125;
        salario_neto = salario_bruto - re_fuente;
        
        System.out.println("Todo queda de la siguiente manera:");
        System.out.println("");
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Retencion en la fuente: " + re_fuente);
        System.out.println("Salario neto: " + salario_neto);
    }
    
}
