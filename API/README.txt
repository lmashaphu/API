#DOG BREED API AUTOMATION

#Prerequisite

- To be able to execute this api automation project you need the following:

~ Download and install Java : https://java.com/en/download/

~ Once done downloading Java (java version 1.8.0_161) - You need to set system variable and set it to Java path (Where Java will be installed)

~ Download and install Apache-maven on your machine : https://maven.apache.org/download.cgi

~ Once done downloading Apache Maven (apache-maven-3.6.0) - You need to set system variable and set it to maven path (where Maven will be installed)

~ Download and install Eclipse IDE (Eclipse Java EE IDE for Web Developers - version 2018-09 : 4.9.0)


# Executing the project

- The project is a Maven (contains pom.xml) project and devoloped in Java, and uses Cucumber framework for scenario/testcase generation, with RestAssured libraries to test API's.

- The folder structure is as follows:

~ src/test/java - Here resides the packages for Feature files (feature), Steps Definitions (stepsDefinition) and TestRunner class (cucumber.Options).

> feature package - This package consist of Feature file with Dog breed api scenarios

> stepsDefinition - This package consist of Steps definitons for the feature file steps

> cucumber.Options - This package consists of a TestRunner class used to execute the tests by right clicking on the class file and "Run As" TestNG Test (if TestNG is not shown, you will need to configure by select "Run Configurations.." then select Project and Run Class then run.) 







