

package com.mycompany.peluqueriacaninajulio.LOGICA;

import com.mycompany.peluqueriacaninajulio.PERSISTENCIA.ControladorPersistencia;
import java.util.ArrayList;
import java.util.List;



public class ControladorLogica {

    
    
    ControladorPersistencia contr = new ControladorPersistencia();

    public void crear(String celDuenio, String color, String nomDuenio, String nombre, String observaciones, String raza, String alergico, String atenEsp) {
        
        Duenio due = new Duenio();
        due.setCelular(celDuenio);
        due.setNombre(nomDuenio);
        
        Mascota masco = new Mascota();
        
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setColor(color);
        masco.setNombre(nombre);
        masco.setObservaciones(observaciones);
        masco.setRaza(raza);
        masco.setUnDuenio(due);
        
        
        contr.crear(due, masco);
        
    }

    public List<Mascota> traertodos() {
        
        return contr.traertodos();
    }

    public void eliminar(int numero) {
       
        contr.eliminar(numero);
    }

    public Mascota traerMascota(int numero87) {
        
        return contr.traerMascota(numero87);
    }

    public void editar(Mascota maso89, String celDuenio, String color, String nomDuenio, String nombre, 
            String observaciones, String raza, String alergico, String atenEsp) {
        
        Duenio due99 = this.traerDuenio(maso89.getUnDuenio().getId());
        due99.setNombre(nomDuenio);
        due99.setCelular(celDuenio);
        
        maso89.setAlergico(alergico);
        maso89.setAtencion_especial(atenEsp);
        maso89.setColor(color);
        maso89.setNombre(nombre);
        maso89.setObservaciones(observaciones);
        maso89.setRaza(raza);
        maso89.setUnDuenio(due99);
      
        contr.editar(maso89);
        contr.editarDuenio(due99);
        
    }

    private Duenio traerDuenio(int id) {
       
        return contr.traerDuenio(id);
    }
    
   
    
    
    

   
    

   

    
  



    
    
}
