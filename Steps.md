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


## 2

beforeAll 
beforeEach


## 3

exceptions