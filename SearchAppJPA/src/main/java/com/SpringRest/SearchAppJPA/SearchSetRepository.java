package com.SpringRest.SearchAppJPA;

import org.springframework.data.repository.CrudRepository;

import com.SpringRest.SearchAppJPA.entity.SearchSet;

public interface SearchSetRepository extends CrudRepository<SearchSet,Long> {

}
