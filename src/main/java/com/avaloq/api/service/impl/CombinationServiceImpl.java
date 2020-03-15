package com.avaloq.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaloq.api.dao.CombinationDAO;
import com.avaloq.api.model.Combination;
import com.avaloq.api.service.CombinationService;

@Service("combinationService")
public class CombinationServiceImpl implements  CombinationService{
	
	@Autowired
	private CombinationDAO combinationDAO;
	
	
	
	@Override
	public List<Combination> getCombinations() {
		return combinationDAO.getCombinations();
	}
}
