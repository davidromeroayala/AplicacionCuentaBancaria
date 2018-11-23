/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

/**
 *
 * @author DRA69
 */
public class CuentaBancaria {
   private String nombre;
   private String cuenta;
   private String iban;
   private String codigoEntidad;
   private String codigoOficina;
   private String codigoControl;
   private String codigoInterno;
   private int saldo;

    public CuentaBancaria(String nombre, String cuenta, String iban, String codigoEntidad, String codigoOficina, String codigoControl, String codigoInterno, int saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.iban = iban;
        this.codigoEntidad = codigoEntidad;
        this.codigoOficina = codigoOficina;
        this.codigoControl = codigoControl;
        this.codigoInterno = codigoInterno;
        this.saldo = saldo;
    }

    public CuentaBancaria() {
    nombre="";
    cuenta="";
    iban="";
    codigoEntidad="";
    codigoOficina="";
    codigoControl="";
    codigoInterno="";
    saldo=0;
    }
    public int ingreso(int ingresar){
    saldo+=ingresar;
    return saldo;
    }
    public int retirar(int retirar){
    saldo-=retirar;
    return saldo;
    }
    
    }
   
   

