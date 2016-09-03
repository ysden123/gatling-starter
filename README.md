# gatling-starter
Start variant of the Gatling project

## Project Initialization
The initial state is empty folder. To create empty Gatling project for IntelliJ follow these steps:
 - Initialize project using [Maven archetype for Gatling](http://gatling.io/docs/2.2.2/extensions/maven_archetype.html)
 - Reorganize folders
 - Import folder as project (mark Maven as external ...)
 - Check Scala's version in the pom.xml
 - Check project with script
```
mvn compile
```
At this point You have the empty Gatling project for IntelliJ

## Running Simulations

To execute simulations run maven command:
```
mvn gatling:execute -Dgatling.simulationClass=<package>.<XYZSimulation>
```
For example:
```
mvn gatling:execute -Dgatling.simulationClass=simulations.SimpleSimulation
```
or simply:
```
mvn gatling:execute
```