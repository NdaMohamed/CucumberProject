# Sauce Demo Project
This project designed using framework: selenium  and tool: cucumber that supports Behavior Driven Development (BDD) - POM.

## Installation
clone the project from the git url "https://github.com/NdaMohamed/CucumberProject.git" to install the project.

## Roadmap
This project contains the following sources:
- src/main/java --> that contains 3 packages
  * Factory package --> DriverFactory class--> contains methods
    1) initiate list of browsers with ability to select specific browser from config.properties file.
    2) Get driver

  * Pages package --> 2 classes for (login and Create Order features) web page, every class contains locators and methods that handle these locators.
   
  *   Utilities package --> contains Reader classes
      1) Configuration Reader
      2) Excel Reader

- src/test/java --> that contains 2 packages
      1) myTestRunner --> this class contains method which run test cases individually.
      2) parallel --> this class contains:
          - "parallel" class which run test cases parallel.
          - "ApplicationHooks" class contains project setup  like OpenURL, launchBrowser, close browser with annotation (before & after).
          - "CreateOrderPageSteps" class contains steps of create order feature.
          - "LoginPageSteps" class contains steps of login feature.

  - src/test/resources --> contains 2 folders:
      1) Features folders included (login & create order) feature.
      2) Config folder included properties values like (selected browser - url)
  

  
                  
## Select specific browser 
- click on src/test/resources --> config package --> open config.properties file --> you can change browser name (chrome & firefox)

## Store url value in configuration file
- click on src/test/resources --> config package --> open config.properties file

## Run project (individually - parallel)  
- To run the tests individually please follow these steps:
  - open src/test/java --> "myTestRunner" package --> open "Testrunner" class --> run as junit

- To run the project individual please follow these steps:
  - open src/test/java --> "parallel" package --> open "parallelRunner" class --> run as TestNG

 ## Read Data from file ( excel sheet)
   - project contains excel sheet with 4 invalid data for login feature
    
## Run Reports
Report 1)  After running tests --> open cosonel and copy the cucumber report link --> open it in a browser
Report 2) After running tests --> open test-output --> click on "index.html".


## think of other useful features
- we can add search input to make seaching on specific product easily.
- Add categorize feature that allows user to filter data by category.
- Add many photos to single product.
  
