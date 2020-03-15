package com.avaloq.api.service.impl;

//@Service("diceService")
public class DiceServiceImpl {

//	@Autowired
//	private CombinationDAO diceDAO;
//
//	@Autowired
//	SimulationDAO simulationDAO;
//
//	private Random random = new Random();
//
//	@Override
//	public Simulation simulate(int noOfDice, int noOfSide, int noOfRolls) {
//
//		List<Integer> listOfSums = new ArrayList<>();
//		for (int i = 1; i <= noOfRolls; i++) {
//			int sum = rollASet(noOfDice, noOfSide);
//			listOfSums.add(sum);
//		}
//
//		Simulation sim = saveSimulation(new Simulation(noOfDice, noOfSide, noOfRolls, getCounOfEachTotal(listOfSums)));
//		List<Combination> testList = getCombinations();
//		System.out.println("---------- yeah --------");
//		System.out.println("size:" + testList.size());
//		for (Combination map : testList) {
//			System.out.println(map.getNoOfDice());
//			System.out.println(map.getNoOfSide());
//			System.out.println();
//			for (Distribution dist : map.getDistributions()) {
//				System.out.println("percentage:" + dist.getPercentage());
//			}
//		}
//		return sim;
//
//	}
//
//	private List<Result> getCounOfEachTotal(List<Integer> listOfTotals) {
//		List<Result> getCounOfEachTotal = new ArrayList<Result>();
//
//		listOfTotals.stream().distinct().forEach(aTotal -> {
//
//			long count = listOfTotals.stream().filter(aSum -> aSum == aTotal).count();
//
//			getCounOfEachTotal.add(new Result(aTotal, Integer.valueOf(Long.valueOf(count).toString())));
//
//		});
//
//		return getCounOfEachTotal;
//	}
//
//	private int rollASet(int noOfDice, int noOfSide) {
//		System.out.println("there are " + noOfDice + " for this set");
//
//		int sum = 0;
//		for (int i = 1; i <= noOfDice; i++) {
//			int rollResult = rollADice(noOfSide);
//			System.out.println("dice result:" + rollResult);
//			sum = sum + rollResult;
//		}
//		System.out.println("sum:" + sum);
//
//		return sum;
//
//	}
//
//	private int rollADice(int noOfSide) {
//		return random.nextInt(noOfSide) + 1;
//	}
//
//	@Override
//	public Simulation saveSimulation(Simulation simulation) {
//		return simulationDAO.save(simulation);
//	}
//
//	@Override
//	public List<Simulation> findAllSimulation() {
//		return (List<Simulation>) simulationDAO.findAll();
//	}
//
//	@Override
//	public List<Combination> getCombinations() {
//		return diceDAO.getCombinations();
//	}

}
