/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import laempresa.empresaprivada;
import Personal.Trabajador;
public class Principal {

    public static void main(String[] args) {
        
        Trabajador t1 = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40, 10);
        Trabajador t2 = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50, 10);
        
        
        Trabajador []t = {t1, t2};
        empresaprivada e = new empresaprivada(t);
        System.out.println(e);
    }
    }
    

