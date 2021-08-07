*********************************Objective****************************************************************
1. To create a function which returns true/false depending on the password logic as per the requirement.
2. Create Junit Test Cases for various condition to validate the logic.
3. Create MOCK function to get system Password.
4. Upgrade this code as a RESTful service & deploy on AWS Tomcat --> This will submitted as part of different git repo.

**************************SETUP INSTRUCTION & Project File Details****************************************
- Setup: Java- Jdk 1.8 and Junit5 libraries
- Levenshtein Algo Jar: Download Jars from https://jar-download.com/artifacts/info.debatty/java-string-similarity/1.0.1/source-code 
- Package name: passChange contains:
		 - Logic Class: ChangePasswords.java
- Package Name: systemUtils Contains: 
         - Levenshtien Distance Logic: LavenshteinDistAlgo.java
		 - Mock Function to get SystemPass: SystemPassMock.java
Package name: unitTests contains:
		 - Junit Unit Test Cases Class: ChangePassword_UnitTests.java
		 
- Git clone <uri>, the project in Eclipse.

- Run ChangePassword_UnitTests.java as Junit Tests.
- Results for all the test cases will be displayed in Eclipse.

****************************Test Cases Details************************************************************
