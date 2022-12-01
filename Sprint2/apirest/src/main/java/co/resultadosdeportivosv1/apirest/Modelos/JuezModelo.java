package co.resultadosdeportivosv1.apirest.Modelos;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("juez")
@AllArgsConstructor //son de la dependencia lombuk
@NoArgsConstructor
@Getter             //con esto no tengo que crear setters 
@Setter             //y getters manualmente

public class JuezModelo {
    
    @Id
    private Long documento; 
    private String nombre;
    private String apellido;
    private LocalDate fnacimiento; //1990-11-02
    private String telefono;
    private String correo;


}
