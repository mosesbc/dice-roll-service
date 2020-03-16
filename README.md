Divided the projects into two applications 
Service:
	github:
	https://github.com/mosesbc/dice-roll-service
  
  boot:
  mvn clean install
  java -jar target/dice-roll-service-1.0-SNAPSHOT.jar

	sample request:
 
	http://localhost:8080/simulate?noOfDice=1&noOfSide=4&noOfRolls=100
	http://localhost:8080/getCombinations

UI:
	github:
	https://github.com/mosesbc/dice-roll-ui
	
  boot:
  npm install
  npm start
  
	access:
	http://localhost:4200/
	
Decisions made on service app:
Use the basic layering Controller, Service, DAO -> to reduce codeblocks and separation of concerns
Use of the H2 ebeded DB -> because its just a lightweight project
Creating a Combination class sublcass of Simulation -> most of fields are reusable; just added a few
Created a custom query for combination/distribution details -> to avoid looping queries

Decisions made on UI app :
Use the basic layering Controller, Service, Backend -> to reduce codeblocks and separation of concerns
Divided the page into 3 sections -> to reduce codeblocks and separation of concerns
Did not use the model -> since there are only few data types if ever
Put the observable on service -> so that other comnponents can subscribe
