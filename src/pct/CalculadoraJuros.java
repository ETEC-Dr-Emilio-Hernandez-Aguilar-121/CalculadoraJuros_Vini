/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
import java.util.Scanner;

/**
 *
 * @author vastv
 */ //Tmj professor
public class CalculadoraJuros {
    public static void main(String[] args) {
        //Variáveis
        double  c, i, n, j; //c - capital; i - taxa; n - prazo; j - juros
        
        //Instancia e objetos de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t |Calculadora de Juros| \n\t\t\t");
        
        //Entradas
        System.out.print("Insira o capital: R$ ");
        c = entrada.nextDouble();
        
        System.out.print("Insira a taxa (%) : ");
        i = entrada.nextDouble();
        
        System.out.print("Período de Capitalização em mêses: "); //Pode se inserir por exemplo: três mêses e duas semana = 3,2
        n = entrada.nextDouble();
        
        //Processo
        j = c * i * n / 100;
        
        //Saída 
        System.out.printf("\n\tJuros a pagar : R$ %.2f\n\n", j);
        }
    
}
