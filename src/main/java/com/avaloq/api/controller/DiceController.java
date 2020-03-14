package com.avaloq.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avaloq.api.model.Result;

@RestController
@Validated
public class DiceController {
	
	private Random random = new Random();
	
	@GetMapping("/roll")
	public List<Result> roll(
			@RequestParam @Min(value=1, message = "The number of dice must be at least 1.") Integer noOfDice,
			@RequestParam @Min(value=4, message = "The sides of a dice must be at least 4.") Integer noOfSide,
			@RequestParam @Min(value=1, message = "The number of rolls must be at least 1.") Integer noOfRolls) {
		
			System.out.println("rolling with params noOfDice:"+noOfDice+",noOfSide:"+noOfSide+",noOfRolls:"+noOfRolls);
		
		return rollThem(noOfDice,noOfSide,noOfRolls);
		
		
	}
	
	private List<Result> rollThem(int noOfDice, int noOfSide, int noOfRolls) {
		
		List<Integer> listOfSums = new ArrayList<>();
		for(int i=1 ; i<=noOfRolls ; i++) {
			int sum = rollASet(noOfDice, noOfSide);
			//save or concat
			listOfSums.add(sum);
		}		
		
		return getCounOfEachTotal(listOfSums);
		
	}
	
	private List<Result> getCounOfEachTotal(List<Integer> listOfTotals){
		List<Result> getCounOfEachTotal = new ArrayList<Result>();
		
		listOfTotals.stream().distinct().forEach(aTotal -> {
			
			long count = listOfTotals.stream().filter(aSum -> aSum == aTotal).count();
			
			getCounOfEachTotal.add(new Result(aTotal, Integer.valueOf(Long.valueOf(count).toString())));
			
		});
		
		return getCounOfEachTotal;
	}
	
	
	private int rollASet(int noOfDice, int noOfSide) {
		System.out.println("there are "+noOfDice+" for this set");
		
		int sum = 0;
		for(int i=1 ; i<=noOfDice ; i++) {
			int rollResult = rollADice(noOfSide);
			System.out.println("dice result:"+rollResult);
			sum = sum + rollResult;
    	}
		System.out.println("sum:"+sum);
		
		return sum;
		
	}
	
	private int rollADice(int noOfSide) {
		return random.nextInt(noOfSide) +1;
	}

}
