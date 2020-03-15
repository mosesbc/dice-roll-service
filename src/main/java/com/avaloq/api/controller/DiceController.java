package com.avaloq.api.controller;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avaloq.api.model.Combination;
import com.avaloq.api.model.Distribution;
import com.avaloq.api.model.Simulation;
import com.avaloq.api.service.CombinationService;
import com.avaloq.api.service.SimulationService;

@RestController
@Validated
public class DiceController {

	@Autowired
	private CombinationService combinationService;
	
	@Autowired
	private SimulationService simulationService;

	@GetMapping("/simulate")
	public Simulation simulate(
			@RequestParam @Min(value = 1, message = "The number of dice must be at least 1.") Integer noOfDice,
			@RequestParam @Min(value = 4, message = "The sides of a dice must be at least 4.") Integer noOfSide,
			@RequestParam @Min(value = 1, message = "The number of rolls must be at least 1.") Integer noOfRolls) {

		System.out.println("rolling with params noOfDice:" + noOfDice + ",noOfSide:" + noOfSide + ",noOfRolls:" + noOfRolls);

		return simulationService.simulate(noOfDice, noOfSide, noOfRolls);
	}
	
	@GetMapping("/getCombinations")
	public List<Combination> getCombinations() {
		List<Combination> combinations = combinationService.getCombinations();
				System.out.println("---------- yeah --------");
				System.out.println("size:" + combinations.size());
				for (Combination map : combinations) {
					System.out.println(map.getNoOfDice());
					System.out.println(map.getNoOfSide());
					System.out.println();
					for (Distribution dist : map.getDistributions()) {
						System.out.println("percentage:" + dist.getPercentage());
					}
				}
				
		return combinationService.getCombinations();
	}

}
