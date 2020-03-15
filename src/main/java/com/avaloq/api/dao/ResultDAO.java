package com.avaloq.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avaloq.api.model.Result;

@Repository("resultDAO")
public interface ResultDAO extends CrudRepository<Result, Integer>{

}
