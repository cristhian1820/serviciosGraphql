package com.playtech.graphql.repository;

import com.playtech.graphql.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Integer> {
}
