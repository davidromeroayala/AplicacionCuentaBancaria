/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

import java.util.Scanner;

/**
 *
 * @author DRA69
 */
public class Menu {
    
    
    public static void mostrarMenu() {
        System.out.println("Bienvenido a su Agenda Personal\n ***********************************************************\n "
                + "seleccione una opcion:\n ***********************************************************\n "
                + "1. Ver el número de cuenta completo (CCC- Código Cuenta Cliente)\n "
                + "2. Ver el titular de la cuenta.\n "
                + "3. Ver el código de la entidad\n "
                + "4. Ver el código de la oficina.\n "
                + "5. Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control).\n "
                + "6. Ver el número de control.\n "
                + "7. Realizar un ingreso. Habrá que solicitar por teclado la cantidad que se desea ingresar.\n "
                + "8. Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar.\n "
                + "9. Consultar saldo.\n " 
                + "0. Salir");
    }
    
    
    
}
