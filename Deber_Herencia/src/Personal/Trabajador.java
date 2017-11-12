/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *
 * @author Usuario
 */
public class Trabajador extends Persona{
    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;
    
    public Trabajador (String n, String a, int e, int c, int cs, int h, int ch){
        super(n,a,e,c);
        establecer_costo_seguro(cs);
        establecer_horas_trabajadas(h);
        establecer_costo_por_hora(ch);
    }
    // Metodos set
    public void establecer_costo_seguro(int cs){
        costo_seguro=cs;
    }
     public int obtener_costo_seguro(){
        return costo_seguro;
    }
    public void establecer_horas_trabajadas(int h){
        horas_trabajadas=h;
    }
     public int obtener_horas_trabajadas(){
        return horas_trabajadas;
    }
    public void establecer_costo_por_hora(int ch){
        costo_por_hora=ch;
    }    
    public int obtener_costo_por_hora(){
        return costo_por_hora;
    }
   
    
    public int obtener_sueldo(){
        int sue=0;
        sue=(horas_trabajadas*costo_por_hora)+costo_seguro;
        return sue;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s"
                + "\tSeguro: $ %d\n"
                + "\tHoras trabajadas: %d\n"
                + "\tValor por hora: $ %d\n"
                + "\tSueldo: $ %d\n",
                super.toString(),
                obtener_costo_seguro(),
                obtener_horas_trabajadas(),
                obtener_costo_por_hora(),
                obtener_sueldo());
        return cadena;
    }
    
}
