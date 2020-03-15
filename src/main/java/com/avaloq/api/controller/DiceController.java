package com.avaloq.api.controller;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avaloq.api.model.Simulation;
import com.avaloq.api.service.DiceService;

@RestController
@Validated
public class DiceController {

	@Autowired
	private DiceService diceService;

	@GetMapping("/roll")
	public Simulation roll(
			@RequestParam @Min(value = 1, message = "The number of dice must be at least 1.") Integer noOfDice,
			@RequestParam @Min(value = 4, message = "The sides of a dice must be at least 4.") Integer noOfSide,
			@RequestParam @Min(value = 1, message = "The number of rolls must be at least 1.") Integer noOfRolls) {

		System.out.println("rolling with params noOfDice:" + noOfDice + ",noOfSide:" + noOfSide + ",noOfRolls:" + noOfRolls);

		return diceService.saveSimulation(
				new Simulation(noOfDice, noOfSide, noOfRolls, diceService.rollThem(noOfDice, noOfSide, noOfRolls)));
	}

}
