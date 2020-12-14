package com.playtech.graphql.resolve;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.playtech.graphql.model.Personaje;
import com.playtech.graphql.model.Series;
import com.playtech.graphql.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Resolver implements GraphQLResolver<Personaje> {

    private final SeriesService seriesService;

    @Autowired
    public Resolver(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    public Series getSeries(Personaje personaje){
        return seriesService.getSeriesId(personaje.getSeries().getId());
    }
}
