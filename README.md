# gatling-starter
Start variant of the Gatling project


### Run

All tests:
```
sbt "gatling:test"
```

Single test:
```
sbt "gatling:testOnly simulations.PreInitSimulation"
sbt "gatling:testOnly simulations.SimpleSimulation"
sbt "gatling:testOnly simulations.UsingCsvFeeder"
```

Report:
```
sbt "gatling:lastReport"
```
