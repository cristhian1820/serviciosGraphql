package com.playtech.graphql.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.playtech.graphql.model.Series;
import com.playtech.graphql.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeriesQuery implements GraphQLQueryResolver {
    private final SeriesService seriesService;

    @Autowired
    public SeriesQuery(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    public List<Series> allSerie() {
        return seriesService.getSeries();
    }

    public Series serieId(Integer id) {
        return seriesService.getSeriesId(id);
    }
}
