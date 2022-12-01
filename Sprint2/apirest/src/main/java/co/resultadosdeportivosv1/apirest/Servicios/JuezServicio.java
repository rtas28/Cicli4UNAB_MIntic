package co.resultadosdeportivosv1.apirest.Servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.resultadosdeportivosv1.apirest.Modelos.JuezModelo;
import co.resultadosdeportivosv1.apirest.Repositorios.JuezRepositorio;

@Service
public class JuezServicio {
    
    @Autowired              //hace que no sea necesario codigo cuando requiero crear objetos. objeto obx = new objeto etc...
    JuezRepositorio repositorio;   //creo objeto tipo repositorio que hereda de mongo


    //------ Servicio para guardar
    public JuezModelo guardarJuez(JuezModelo juez) {
        return repositorio.save(juez);
    }

    //------ Servicio para mostrar listado jueces
    public ArrayList <JuezModelo> listadoJuez() {
        return (ArrayList<JuezModelo>) repositorio.findAll();
    }

     //------ Servicio para eliminar jueces
     public boolean borrarJuez(Long documento) {
        if(repositorio.existsById(documento)){
            repositorio.deleteById(documento);
            System.out.println("Eliminado Juez " + documento);
            return true; 
        }else{
            System.out.println ("No existe el juez " + documento);
            return false;
        }
    }


}
