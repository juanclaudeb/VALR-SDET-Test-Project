# SDET Test Project for VALR

1. SDET Postman Tests
2. SDETTestProject (Java Selenium BDD)
3. Test Pack for Buy and Sell feature

![Alt Text](https://github.com/juanclaudeb/VALR-SDET-Test-Project/main/ProjectStructureAnimated.gif)

---
		
# SECTION 1: SDET Postman Tests

# ENVIRONMENT PRE-REQUISITES:

	* Postman should be installed
	
# Config Settings:

	* SSL should be disabled

# Instructions:

	1. A VALR account should be created with 2FA enabled
	2. The customer requires an API Key and secret to execute endpoint from the https://docs.valr.com/#3d713155-67aa-4cda-94f7-308ecb224952 site
	
# TEST DESIGN APPROACH:

API tests are created from requests	and is validated post endpoint execution.
API tests are created with positive and negative flow examples in mind. 
	
# Test Run instructions:

	1. Import both VALR API COLLECTION.postman_collection.json and VALR DEV Environment.postman_environment.json files into postman.
		1.1 From the collection options, click the "Run collection" option
		1.2 Click the "Run VALR API COLLECTION" button
		1.3 View the test run iteration

Alternatively, the collection can be run using the newman test runner tool: https://github.com/postmanlabs/newman 

---
# SECTION 2: SDETTestProject (Java Selenium BDD)

# ENVIRONMENT PRE-REQUISITES:

	* IDE: IntelliJ IDE community edition
	* SDK version: Java Development Kit (JDK) 17
	* Build tools: Apache Maven
	* Latest version of JAVA JRE
    * Latest instance of Chrome
    * Latest instance of Firefox

# PLUGIN PRE-REQUISITES:

	* Cucumber for JAVA
	* Gherkin
	* JUnit generatorV2
	* Maven Runner
	* Maven
	* JUnit
    * TestNG

# DEPENDENCIES USED:

        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.6</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.6</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.3.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/net.masterthought/maven-cucumber-reporting -->
        <dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>maven-cucumber-reporting</artifactId>
            <version>5.7.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>7.5.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.2.2</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.6.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>1.2.6</version>
        </dependency>

# TEST DESIGN APPROACH:

The test design approach mainly encompasses the use of Behaviour Driven Development (BDD) using the Java, Selenium and Cucumber / Gherkin tech stack as the primary tech used.
This automated test approach bridges the gap of communication between business users and developers to effortlessly analyze the goal of test scenarios and features reporting services / frameworks which requires minimal maintenance. The design principles used in its most granular form enables us to run the test framework cross environments such as Linux, iOS and Windows for most supported versions as well as different automation build software currently available such as Jenkins, Azure DevOps, AWS, Travis CI etc.

	1. BDD Test Methodology:
	
	Test scenarios are initially created with natural language using Gherkin to define a "Feature --> Scenario Outline --> Given, And, When, Then" test structure which makes use of dynamic "Example" tables in order to inject test data into a scenario outline which is then used to enable parameterization of test steps.

    2. Selenium POM (Page Object Model):

	The use of "WebEmelents" and "Page Actions" are impleted using page classes per web page in test. This design patern is used to increase ease of use and simplicity when creating selenium actions in the respective "Page definition class".
	
	3. Test Runner:
	
	The test runner class is used as a test runner to execute cucumber BDD test features which acts as the wrapper class to bind the "Glue" classes ( Features, Steps, Hooks ). In addition the test runner class is responsible for generating report results in HTML, JSON and XML data formats for the consumption of automation build software like Jenkins or Azure DevOps etc.
	
	4. Hooks
	
	A "hook" class is created which is responsible for the @Before and @After methods for cucumber test suite runs. This involves initiaiting a browser driver instance as well as configuring the browser options and then at teardown, closes all running browser instances (for chrome and firefox).

# TEST RUN INSTRUCTIONS:

Assuming all environment dependencies have been installed on the host OS, the instructions to run tests via command line are as follow:

CMD:

	1. Navigate to the project folder:
		
		CD ./SDETTestProject (or where ever your project is located)
		
	2. To run all tests and generate the report to view, run the following command:
	
		mvn clean test verify
		
		note- this will run the entire test suite and generate the report to view
		
	3. Open the report using your browser of choice:
	
		3.1 Report is located in the following directry from the project:
			./SDETTestProject/target/htmlReports
			
		3.2 Open any of the HTML files and navigate to the sections you would like to view your overall test results
			3.2.2 Report is generated in the following location:
			SDETTestProject/target/htmlReports

---
# Section 3: Test Pack for Buy and Sell feature

The "VALR BuySell TestPack.xlsx" is divided into 2 sections / sheets: 

* Login Setup BuySell Flow
  * Contains a pre setup flow of tests which a customer would typically use to access the buy sell page.
* BuySell Function Test
  * Contains the test suite for the Buy Sell page scenarios.
