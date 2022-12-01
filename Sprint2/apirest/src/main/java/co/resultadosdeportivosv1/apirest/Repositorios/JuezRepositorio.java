package co.resultadosdeportivosv1.apirest.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.resultadosdeportivosv1.apirest.Modelos.JuezModelo;

@Repository
public interface JuezRepositorio extends MongoRepository<JuezModelo,Long> {
    
}
