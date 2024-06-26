# automation-tasks-on-carina
This repository contains automation tasks implemented using Carina framework

### Getting started
* Install and configure JDK 21
* Download and start the latest [Selenium standalone server](http://www.seleniumhq.org/download/)
* Download the latest version of [Intellij](https://www.jetbrains.com/idea/)
* [Read Carina documentation](https://zebrunner.github.io/carina/)


### Run
* Clone this repository to your local machine using Git
* Start the Selenium server using the following command: 
```
java -jar selenium-server-4.20.0.jar hub
```
* Create node for Selenium using the following command: 
```
java -Dwebdriver.chrome.driver=*path to your chromedriver.exe* -jar selenium-server-4.20.0.jar node --port 5555 --detect-drivers true --hub http://localhost:4444
```
* Execute the tests by running the testng.xml file


