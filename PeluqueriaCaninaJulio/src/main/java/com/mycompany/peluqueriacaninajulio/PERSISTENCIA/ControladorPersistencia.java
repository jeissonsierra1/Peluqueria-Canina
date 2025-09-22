

package com.mycompany.peluqueriacaninajulio.PERSISTENCIA;

import com.mycompany.peluqueriacaninajulio.LOGICA.Duenio;
import com.mycompany.peluqueriacaninajulio.LOGICA.Mascota;
import com.mycompany.peluqueriacaninajulio.PERSISTENCIA.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorPersistencia {
    
    MascotaJpaController masc = new MascotaJpaController();
    DuenioJpaController duee = new DuenioJpaController();

    public void crear(Duenio due, Mascota masco) {
       
        duee.create(due);
        masc.create(masco);
        
    }

    public List<Mascota> traertodos() {
       
        return masc.findMascotaEntities();
    }

    public void eliminar(int numero) {
       
        try {
            masc.destroy(numero);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Mascota traerMascota(int numero87) {
        
        return masc.findMascota(numero87);
    }

    public Duenio traerDuenio(int id) {
        
        return duee.findDuenio(id);
    }

    public void editar(Mascota maso89) {
        
        try {
            masc.edit(maso89);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarDuenio(Duenio due99) {
       
        try {
            duee.edit(due99);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

   

    

   

  


}
