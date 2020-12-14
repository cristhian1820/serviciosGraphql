package com.playtech.graphql.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.playtech.graphql.model.Personaje;
import com.playtech.graphql.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonajeMutation implements GraphQLMutationResolver {
    private final PersonajeService personajeService;

    @Autowired
    public PersonajeMutation(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    public Personaje registrarPersonaje(Personaje personaje, Integer serie) {
        return personajeService.registrarPersonaje(personaje, serie);
    }
}
