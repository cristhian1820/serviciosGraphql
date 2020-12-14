package com.playtech.graphql.service;

import com.playtech.graphql.model.Personaje;

import java.util.List;

public interface PersonajeService {

    Personaje registrarPersonaje(Personaje personaje,Integer serieId);

    List<Personaje> getPersonaje();

    Personaje getPersonajeId(Integer id);
}
