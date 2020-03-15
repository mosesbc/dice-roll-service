package com.avaloq.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avaloq.api.model.RollRequest;

@Repository("rollRequestDAO")
public interface RollRequestDAO extends CrudRepository<RollRequest, Integer>{

}
