# OOP Web Automation Assignment

This repository hosts a web automation project employing Object-Oriented Programming (OOP) principles, TestNG framework, Maven, and Selenium automation tool. The project's aim is to conduct automated tests on the [MakeMyTrip](https://www.makemytrip.com/) website to extract the top price information.

## Overview

### Purpose
The primary aim of this project is to showcase automated testing capabilities utilizing Selenium, TestNG, and Maven. Specifically, it targets the extraction of the top price from the [MakeMyTrip](https://www.makemytrip.com/) website.

### Tools Utilized
- [**TestNG**](https://testng.org/doc/): Testing framework providing functionalities for various test types.
- [**Maven**](https://maven.apache.org/): Build automation tool managing dependencies and project configuration.
- [**Selenium**](https://www.selenium.dev/): Powerful web browser automation tool.

## Setup and Execution

### Prerequisites
Ensure the following are installed:
- JDK
- Maven
- TestNG framework
- Chrome or Firefox browser

### Dependency Configuration
Add the following to your `pom.xml`
```xml
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
  </properties>

  <dependencies>
    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>6.14.3</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.11.0</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-chrome-driver</artifactId>
      <version>4.11.0</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.4.1</version>
    </dependency>
  </dependencies>

  <profiles>
    <profile>
      <id>selenium</id> <!--Feel free to name it what you want, the following id to run later in the console-->
      <build>
        <pluginManagement>
          <plugins>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-surefire-plugin</artifactId>
              <version>3.1.2</version>
              <configuration>
                <suiteXmlFiles>
                  <suiteXmlFile>testNG.xml</suiteXmlFile>
                </suiteXmlFiles>
              </configuration>
            </plugin>
          </plugins>
        </pluginManagement>
      </build>
    </profile>
  </profiles>

```
## Directory Structure
- `page`: Directory for classes representing different function
- `FlightPageTest.java`: Contains actual test cases related to the functionalities, also executing tests.

```
java
├── page
│   ├── BasePage.java
│   ├── FlightPage.java
│   └── HomePage.java
└── test
    ├── BaseWebTest.java
    └── FlightPageTest.java
```

## How to Use
Run the `FlightPageTest.java` file directly from the IDE, I'm using [IntelliJ IDEA](https://www.jetbrains.com/idea/) or run using the terminal using this command
```bash
mvn test -Pselenium
```

## Report
Navigate to the `surefire-report` directory, and you will see `emailable-report.html` and `index.html` that have been created, for example:
```
target
└── surefire-reports
    ├── emailable-report.html
    ├── index.html
```
![Screenshot_2](https://github.com/dannyhdyt/Web-Automation-Assignment/assets/153344198/6c8a2975-322a-47ee-9f21-16412a63409f)
![Screenshot_1](https://github.com/dannyhdyt/Web-Automation-Assignment/assets/153344198/e3f959a7-5d76-4b9f-b433-75e4bed232a7)
