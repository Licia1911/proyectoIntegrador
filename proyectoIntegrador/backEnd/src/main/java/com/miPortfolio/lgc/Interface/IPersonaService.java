
package com.miPortfolio.lgc.Interface;

import com.miPortfolio.lgc.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer unalista de personas
    public List<Persona>getPersona();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un Usuario por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
    
}
