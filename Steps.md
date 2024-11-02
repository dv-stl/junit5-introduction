# Junit5 introduction 



## Pom file 

https://junit.org/junit5/

```xml
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.junit</groupId>
				<artifactId>junit-bom</artifactId>
				<version>5.10.2</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
```


## 1 

Run maven compile test  
Surefire plugin is detected automatically   
Display name works  

Purpose:
 - show how to run tests in intelij and maven
 - display nice names

## 2

beforeAll 
beforeEach

Purpose:
- explain what these annotations are and when to use these 

## 3
How to test exceptions?

## 4
AssertAll - when to use 
What does the message say?

1. Comment out the @Disabled annotation
2. Run test - no output from the second assertion 

Purpose:
- better visibility of assertion
- how to write proper error message 

## 5 

Tests can have timeouts.  
Useful to verify code execution time if SLA is in place.

## 6

https://assertj.github.io/doc/  
Uncomment test and pom.xml  
It is possible to use external assert libraries.

## 7

Uncomment test and pom.xml  
Parameterized tests
Click on CsvSource to jump to the file and show all possible providers from the inside of the package

## 8
JVM knows nothing about tests, these are just classes with Test at the end.
Maven is able to compile tests and run these
Surefire plugin is needed
It comes as default from maven bindings
https://maven.apache.org/ref/3.6.3/maven-core/default-bindings.html

What about integration tests?
Surefire plugin does not care, will run everything until told to exclude something https://maven.apache.org/surefire/maven-surefire-plugin/.
There is another plugin https://maven.apache.org/surefire/maven-failsafe-plugin/ that kicks in during mvn verify phase 
There is an image with maven phases in the resource dir.
Show Effective POM - no special config for surefire
