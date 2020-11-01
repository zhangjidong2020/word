package com.bigdata.travels.service;

import com.bigdata.travels.entity.Place;

import java.util.List;

public interface PlaceService {


    List<Place> findByProvinceIdPage(Integer page, Integer rows, String provinceId);


    Integer findByProvinceIdCounts(String provinceId);


    void save(Place place);

    void delete(String id);

    Place findOne(String id);

    void update(Place place);
}
