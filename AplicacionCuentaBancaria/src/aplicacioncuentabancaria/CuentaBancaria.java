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
   private String codigoEntidad;
   private String codigoOficina;
   private String codigoControl;
   private String codigoInterno;
   private int saldo;

    public CuentaBancaria(String nombre, String cuenta, codigoControl, String codigoInterno, int saldo) {
        if (nombre.length()>19){
            this.nombre = nombre.substring(0, 19);
        }else{
            this.nombre = nombre;
        }
        if (cuenta.length()==19){
            dividirCuenta(cuenta);
        }else{
            do{
                System.out.println("La cuenta son 20 dígitos");
                
            }while (cuenta.length()!=19);
            dividirCuenta(cuenta);
        }
        
        
        this.saldo = saldo;
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
        setSaldo(getSaldo() - retirar);
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
       
        this.codigoEntidad=cuenta.substring(0,3);
        this.codigoOficina=cuenta.substring(4,7);
        this.codigoControl=cuenta.substring(8,9);
        this.codigoInterno=cuenta.substring(10,19);
       
    
    }
    public boolean confirmarCuenta(){
        int resultado=0;
       resultado+=(Integer.parseInt(codigoEntidad.substring(0,0))*4); 
       resultado+=(Integer.parseInt(codigoEntidad.substring(1,1))*8); 
       resultado+=(Integer.parseInt(codigoEntidad.substring(2,2))*5); 
       resultado+=(Integer.parseInt(codigoEntidad.substring(3,3))*10); 
       
    }   
   
}
   


