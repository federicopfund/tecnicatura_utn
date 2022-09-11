/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.math;

/**
 *
 * @author feder
 */
public class CalculadorasSalario {
      // Definimos variables
        double ratioHoras   = 37;
        int horasPorSemana  = 40;
        int semanasPorAño   = 52;
        int vacacionePorAño = 3;
        
        // calcula.
        int tiempoTrabajado = semanasPorAño - vacacionePorAño; 
        double anualCompaniaPaga = tiempoTrabajado * horasPorSemana * ratioHoras;
        
}
