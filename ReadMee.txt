***************Read Me updated on Feature Branch************************************
*********************************Objective****************************************************************
1. To create a function which returns true/false depending on the password logic as per the requirement.
2. Create Junit Test Cases for various condition to validate the logic.
3. Create MOCK function to get system Password.
4. Upgrade this code as a RESTful service & deploy on AWS Tomcat --> This will submitted as part of different git repo.

**************************SETUP INSTRUCTION & Project File Details****************************************
- Setup: Java- Jdk 1.8 and Junit5 libraries.
- Levenshtein Algo Jar: Download Jars from https://jar-download.com/artifacts/info.debatty/java-string-similarity/1.0.1/source-code 
- Please note most of the logic has been written on the basis of regex/pattern matching.

- Package name: passChange contains:
		 - Logic Class: ChangePasswords.java
		 
- Package Name: systemUtils Contains: 
         - Levenshtien Distance Logic: LavenshteinDistAlgo.java
		 - Mock Function to get SystemPass: SystemPassMock.java
		 
Package name: unitTests contains:
		 - Junit Unit Test Cases Class: ChangePassword_UnitTests.java
		 
Package name:unittest_RunResults contains: Xml results of run.
		 
- Git clone <uri>, the project in Eclipse.
- Run ChangePassword_UnitTests.java as Junit Tests.
- Results for all the test cases will be displayed in Eclipse.

- Levenstein Distance is taken as 8 , which means how many manipulation does it take to convert oldPassword
  to new Password. If it takes less than 8 passes to manipulate then the passwords are similar.If it takes
  more than 8 passes then we can allow the password.

****************************Test Cases Details************************************************************
- Code Unit Testing Coverage: Please note there can be 100's of test cases created for this requirement , but due to time crunch could only handpick important one's.
- Please find description of all the test cases in Junit file.
- Attaching test results under package:unittest_RunResults
- More code coverage if we add more unit tests.





