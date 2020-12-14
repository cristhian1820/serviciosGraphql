package com.playtech.graphql.service.impl;

import com.playtech.graphql.model.Series;
import com.playtech.graphql.repository.SeriesRepository;
import com.playtech.graphql.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SeriesServiceImpl implements SeriesService {

    private final SeriesRepository seriesRepository;

    @Autowired
    public SeriesServiceImpl(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    @Transactional
    @Override
    public Series registrarSeries(Series series) {
        return seriesRepository.save(series);
    }

    @Transactional
    @Override
    public List<Series> getSeries() {
        return seriesRepository.findAll();
    }

    @Transactional
    @Override
    public Series getSeriesId(Integer id) {
        return seriesRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("No se encontro serie con ese 'id'!!!"));
    }

}
