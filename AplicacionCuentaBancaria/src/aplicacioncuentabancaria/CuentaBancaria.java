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
public class CuentaBancaria {
   private String nombre;
   private String cuenta;
   private String codigoEntidad;
   private String codigoOficina;
   private String codigoControl;
   private String codigoInterno;
   private int saldo;

    public CuentaBancaria(String nombre, String cuenta) {
        if (nombre.length()>19){
            this.nombre = nombre.substring(0, 20);
        }else{
            this.nombre = nombre;
        }
        
        this.cuenta = cuenta;
        do{
            
            if (this.cuenta.length()==20){
                dividirCuenta(this.cuenta);
            }else{
                do{
                    System.out.println("Cuenta erronea la cuenta son 20 dígitos");
                    Scanner leer=new Scanner(System.in);
                    this.cuenta=leer.nextLine();
                }while (this.cuenta.length()!=20);
                dividirCuenta(this.cuenta);
            }    
            
        }while (!confirmarCuenta());
        
      
        
      saldo =0;
    }

    public CuentaBancaria() {
    nombre="";
    cuenta="";
    codigoEntidad="";
    codigoOficina="";
    codigoControl="";
    codigoInterno="";
    saldo=0;
    }
    public int ingreso(int ingresar){
        setSaldo(getSaldo() + ingresar);
    return getSaldo();
    }
    public int retirar(int retirar){
        if (retirar>saldo) {
            System.out.println("No puede retirar dicha cantidad");
        }else{
            setSaldo(getSaldo() - retirar);
        }
        
    return getSaldo();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the codigoEntidad
     */
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * @param codigoEntidad the codigoEntidad to set
     */
    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    /**
     * @return the codigoOficina
     */
    public String getCodigoOficina() {
        return codigoOficina;
    }

    /**
     * @param codigoOficina the codigoOficina to set
     */
    public void setCodigoOficina(String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    /**
     * @return the codigoControl
     */
    public String getCodigoControl() {
        return codigoControl;
    }

    /**
     * @param codigoControl the codigoControl to set
     */
    public void setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
    }

    /**
     * @return the codigoInterno
     */
    public String getCodigoInterno() {
        return codigoInterno;
    }

    /**
     * @param codigoInterno the codigoInterno to set
     */
    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    private void dividirCuenta(String cuenta) {
       
        this.codigoEntidad=cuenta.substring(0,4);
        this.codigoOficina=cuenta.substring(4,8);
        this.codigoControl=cuenta.substring(8,10);
        this.codigoInterno=cuenta.substring(10,20);
       
    
    }
    private boolean confirmarCuenta(){
        boolean confirmado=false;
        int resultado=0;
        int codigo1=11;
        int codigo2=11;
        int codigototal=0;
       resultado+=(Integer.parseInt(codigoEntidad.substring(0,1))*4); 
       resultado+=(Integer.parseInt(codigoEntidad.substring(1,2))*8); 
       resultado+=(Integer.parseInt(codigoEntidad.substring(2,3))*5); 
       resultado+=(Integer.parseInt(codigoEntidad.substring(3,4))*10); 
       resultado+=(Integer.parseInt(codigoOficina.substring(0,1))*9);
       resultado+=(Integer.parseInt(codigoOficina.substring(1,2))*7);
       resultado+=(Integer.parseInt(codigoOficina.substring(2,3))*3);
       resultado+=(Integer.parseInt(codigoOficina.substring(3,4))*6);
       resultado=resultado%11;
       codigo1-=resultado;
        if (codigo1==10) {
            codigo1=1;
        }
        if (codigo1==11) {
            codigo1=0;
        }
        resultado=0;
        resultado+=(Integer.parseInt(codigoInterno.substring(0,1))*1);
        resultado+=(Integer.parseInt(codigoInterno.substring(1,2))*2);
        resultado+=(Integer.parseInt(codigoInterno.substring(2,3))*4);
        resultado+=(Integer.parseInt(codigoInterno.substring(3,4))*8);
        resultado+=(Integer.parseInt(codigoInterno.substring(4,5))*5);
        resultado+=(Integer.parseInt(codigoInterno.substring(5,6))*10);
        resultado+=(Integer.parseInt(codigoInterno.substring(6,7))*9);
        resultado+=(Integer.parseInt(codigoInterno.substring(7,8))*7);
        resultado+=(Integer.parseInt(codigoInterno.substring(8,9))*3);
        resultado+=(Integer.parseInt(codigoInterno.substring(9,10))*6);
        resultado=resultado%11;
        codigo2-=resultado;
          if (codigo2==10) {
            codigo2=1;
        }
        if (codigo2==11) {
            codigo2=0;
        }
        codigototal=(codigo1*10)+(codigo2);
        if (codigototal==Integer.parseInt(codigoControl)) {
            confirmado=true;
        }else{
            this.cuenta="";
        }
        return confirmado;
    }   
   
}
   


