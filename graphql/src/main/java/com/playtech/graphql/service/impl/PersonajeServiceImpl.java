package com.playtech.graphql.service.impl;

import com.playtech.graphql.model.Personaje;
import com.playtech.graphql.repository.PersonajeRepository;
import com.playtech.graphql.service.PersonajeService;
import com.playtech.graphql.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class PersonajeServiceImpl implements PersonajeService {

    private final PersonajeRepository personajeRepository;
    private final SeriesService seriesService;

    @Autowired
    public PersonajeServiceImpl(PersonajeRepository personajeRepository, SeriesService seriesService) {
        this.personajeRepository = personajeRepository;
        this.seriesService = seriesService;
    }

    @Transactional
    @Override
    public Personaje registrarPersonaje(Personaje personaje, Integer serieId) {
        personaje.setSeries(seriesService.getSeriesId(serieId));
        return personajeRepository.save(personaje);
    }

    @Transactional
    @Override
    public List<Personaje> getPersonaje() {
        return personajeRepository.findAll();
    }

    @Transactional
    @Override
    public Personaje getPersonajeId(Integer id) {
        return personajeRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Pesonaje 'id' no encontrado!!!"));
    }


}
