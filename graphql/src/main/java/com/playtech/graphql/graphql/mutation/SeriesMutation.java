package com.playtech.graphql.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.playtech.graphql.model.Series;
import com.playtech.graphql.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeriesMutation implements GraphQLMutationResolver {

    private final SeriesService seriesService;

    @Autowired
    public SeriesMutation(SeriesService service) {
        this.seriesService = service;
    }

    public Series registrarSeries(Series series){
        return seriesService.registrarSeries(series);
    }
}
