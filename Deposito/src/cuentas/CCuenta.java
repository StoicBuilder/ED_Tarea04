/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * CLase que incluye los métodos para manejar las distintas funciones de la
 * cuenta.
 *
 * @author Álvaro
 */
public class CCuenta {

    /**
     * Método para obetener el valor de cuenta.
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que permite modificar el valor de cuenta.
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obetener el valor de saldo.
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que permite modificar el valor de cuenta.
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Atributos de clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor de la clase.
     */
    public CCuenta() {
    }

    /**
     * Método constructor de la clase que permite introducir los diferentes parámetros.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método que permite asignar un nombre.
     * @param nom 
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que muestra el nombre.
     * @return nombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que muestra el estado.
     * @return 
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método que permite ingresar una cantidad.
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que permite retirar una cantidad.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que muestra cuenta
     * @return cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Método que muestra el nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite asignar un nombre.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que muestra el tipo de interés.
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que permite asignar el tipo de interés.
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
