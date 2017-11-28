# POM_Shop_Test
Test suite for Presta-Shop- based web shop using Java with Selenium and Page Object Model style

Scripts were designed for Automation Practice Page (http://automationpractice.com) which is web shop based on Presta-Shop platform. 

All scripts were created using Page Object Model pattern in Java with Selenium Bindings

Project structure:

- Execute/
       -/Main - Class to fire up test scenarios
       -/Setup - Class to setup Target Site, Quantity, Desired Product or Comment to add.  Also it contains standard setUp and tearDown 
       methods, as well as helper methods for adding timestamps and creating log file
- Page/ - Pages described in POM pattern
- Tests/ - Tests for pages, mostly for asserting Page Tittle
- Test Scenarios/ - Each class is separate test scenario.


Features:
- Every step is logged into console or file with timestamp
- Log files names are created based on time of execute and Test Scenario Name
