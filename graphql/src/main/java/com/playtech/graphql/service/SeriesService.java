package com.playtech.graphql.service;

import com.playtech.graphql.model.Series;

import java.util.List;

public interface SeriesService {
    Series registrarSeries(Series series);

    List<Series> getSeries();

    Series getSeriesId(Integer id);

}
