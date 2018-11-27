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
public class AplicacionCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        int ingreso;
        int retirar;
        Scanner leer=new Scanner(System.in);
        String nombre;
        String cuenta;
        CuentaBancaria cuentaBancaria;
        System.out.println("Introduzca el nombre y el numero de cuenta");
        nombre=leer.nextLine();
        cuenta=leer.nextLine();
        cuentaBancaria=new CuentaBancaria(nombre, cuenta);
        
        
        do {
            System.out.println("\n"
                    + "\n");
         Menu.mostrarMenu();
         opc=leer.nextInt();
          switch(opc){
              case 1:
                  System.out.println("su numero de cuenta entera es "+cuentaBancaria.getCuenta());
                  break;
              case 2:
                  System.out.println("el nombre del titular es "+cuentaBancaria.getNombre());
                  break;
              case 3:
                  System.out.println("el numero de la entidad es "+cuentaBancaria.getCodigoEntidad());
                  break;
              case 4:
                  System.out.println("el numero de oficina es "+cuentaBancaria.getCodigoOficina());
                  break;
              case 5:
                  System.out.println("el numero de cuenta es "+cuentaBancaria.getCodigoInterno());
                  break;
              case 6:
                  System.out.println("el codigo de control es "+cuentaBancaria.getCodigoControl());
                  break;
              case 7:
                  System.out.println("Introduzca el importe a depositar");
                  ingreso=leer.nextInt();
                  System.out.println("su saldo es de "+cuentaBancaria.ingreso(ingreso));
                  break;
              case 8:
                  System.out.println("Introduzca el importe a retirar");
                  retirar=leer.nextInt();
                  System.out.println("su saldo es de "+cuentaBancaria.retirar(retirar));
                  break;
              case 9:
                  System.out.println("su saldo es de "+cuentaBancaria.getSaldo());
                  break;
              case 0:
                  System.out.println("Adios");
                  break;
          }
        
            
        } while (opc!=0);
        
       
    
}
}
