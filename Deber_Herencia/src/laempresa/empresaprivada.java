/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;
import Personal.Trabajador;

public class empresaprivada extends Empresa{
    private int ventas_mensual_fijo;
    private int numero_sucursales;
    
// Constructor
    public empresaprivada(Trabajador []t){
        super(t);
        establecer_ventas_mensual_fijo(200000);
        establecer_numero_sucursales(12);
    }
    
    public void establecer_ventas_mensual_fijo(int v){
        ventas_mensual_fijo=v;
    }
     public int obtener_ventas_mensual_fijo(){
        return ventas_mensual_fijo;
    }
    public void establecer_numero_sucursales(int s){
        numero_sucursales=s;
    }
    public int obtener_numero_sucursales(){
        return numero_sucursales;
    }
   
    @Override
    public String toString(){
        String cadena_trabajadores="";
        Trabajador []A = obtener_trabajadores();
        for (int i=0; i<A.length; i++){
            cadena_trabajadores+=(i+1)+")\t"+A[i];
        }
        String cadena = String.format("%s\n"
                + "Ventas: $ %d\n"
                + "Sucursales: %d\n"
                + "Lista de trabajadores:\n"
                + "%s",
                super.toString(),
                obtener_ventas_mensual_fijo(),obtener_numero_sucursales(),cadena_trabajadores);
        return cadena;
    }
}
