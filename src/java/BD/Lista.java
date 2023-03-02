/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import Modelo.SesionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Lista {
    
    public static List<SesionDTO> lista = new ArrayList<SesionDTO>();
    
    public static void cargarDatos(){
        
        SesionDTO d1 = new SesionDTO("mequieromorir@correo.com","123456","noe","778930");
        SesionDTO d2 = new SesionDTO("paknaci@correo.com","123456","alex","7789301");
        SesionDTO d3 = new SesionDTO("noquiero@correo.com","123456","alex","7789302");
        lista.add(d1);
        lista.add(d2);
        lista.add(d3);


        
    }
}
