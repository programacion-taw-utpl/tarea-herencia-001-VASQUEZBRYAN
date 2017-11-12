/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import Personal.Trabajador;

/**
 *
 * @author Usuario
 */
public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    protected Trabajador []trabajadores;
   
    public Empresa (Trabajador []tr){
        establecer_nombre("Soluciones Software");
        establecer_siglas("SS's");
        establecer_ciudad("Loja");
        trabajadores=tr;
    }
    
    public void establecer_nombre(String nom){
        nombre=nom;
    }
     public String obtener_nombre(){
        return nombre;
    }
    public void establecer_siglas(String sig){
        siglas=sig;
    }
    public String obtener_siglas(){
        return siglas;
    }
    public void establecer_ciudad(String c){
        ciudad=c;
    }
     public String obtener_ciudad(){
        return ciudad;
    }
    public void establecer_trabajadores(Trabajador []t){
        trabajadores=t;
    }
    public Trabajador[] obtener_trabajadores(){
        return trabajadores;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s",
                obtener_nombre(),
                obtener_siglas(),
                obtener_ciudad());
        return cadena;
    }
}
