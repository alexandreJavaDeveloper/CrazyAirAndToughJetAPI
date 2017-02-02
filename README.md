# CrazyAirAndToughJetAPI Application

## Goal of this application
- Is receiving HTTP requests and produce JSON response through the services created, by two suppliers: CrazyAir and ToughJet.

## Creation of a Web Application API using the following technologies:
- Spring Boot
- AspectJ
- Maven

## Why these technologies?
- Spring Boot is a faster creation of application web with several supports of pre-configuration.
- AspectJ is a part of Spring Boot that was used in this project to log the request and response from each of the suppliers for debugging purposes.
- Maven is used to build and execute all tests (via jUnit) of project. Allow with a simple configuration to use several libraries in the project without much effort.

## How to execute all tests AND run the BusyFlights Application ( Execute via shell the following steps ):
- git clone https://github.com/alexandreJavaDeveloper/CrazyAirAndToughJetAPI.git
- cd CrazyAirAndToughJetAPI/
- mvn clean package
- java -jar target/suppliers-0.0.1-SNAPSHOT.jar