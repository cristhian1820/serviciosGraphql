package com.playtech.graphql.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.playtech.graphql.model.Personaje;
import com.playtech.graphql.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PersonajeQuery implements GraphQLQueryResolver {

    private final PersonajeService personajeService;

    @Autowired
    public PersonajeQuery(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    public List<Personaje> allPersonajes(){
        return personajeService.getPersonaje();
    }

    public Personaje personajeId(Integer id){
        return personajeService.getPersonajeId(id);
    }
}
