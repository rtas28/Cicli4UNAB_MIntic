package co.resultadosdeportivosv1.apirest.Controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.resultadosdeportivosv1.apirest.Modelos.JuezModelo;
import co.resultadosdeportivosv1.apirest.Servicios.JuezServicio;

@RestController
@RequestMapping("/juez")
@CrossOrigin("*") //ojo esto es importante para que corra desde front
public class JuezControlador {
    // http://localhost:8080/juez

    @Autowired
    JuezServicio serviciosdejuez;

    @PostMapping("/guardar")
    public JuezModelo GuardarJuez(@RequestBody JuezModelo juez){
        return serviciosdejuez.guardarJuez(juez);
    }
    //http://localhost:8080/juez/guardar

    @DeleteMapping("/borrar/{documento}")
    public boolean borrar(@PathVariable Long documento){
        return serviciosdejuez.borrarJuez(documento);
    }
    //http://localhost:8080/juez/borrar/XXXXX

    @GetMapping("/listar")
    public ArrayList<JuezModelo> ListarJueces(){
        return serviciosdejuez.listadoJuez(); 
    }
    //http://localhost:8080/juez/listar

}
