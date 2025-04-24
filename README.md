# Spring Boot Calculator

A simple Spring Boot web application that performs basic arithmetic operations (Add, Subtract, Multiply, Divide) via a REST API and an HTML frontend.

---

## Features

-  Four operations: Add, Subtract, Multiply, Divide
-  REST API endpoint using Spring Boot
-  Simple user interface built with HTML/CSS
-  Input validation (e.g., divide-by-zero check)
-  Lightweight and fast – no database required

---

## Tech Stack

- Java 21 
- Spring Boot 3.4.4
- Maven
- HTML/CSS

---

## Project Structure


calculator/

├── src/

│      └── main/

│          ├── java/

│          │   └── com/example/calculator/

│          │       ├── CalculatorApplication.java

│          │       └── controller/CalculatorController.java

│          └── resources/

│              ├── static/index.html

│              └── application.properties

├── pom.xml""



## How to Run the Application

### On Windows

1. **Clone the Repository**
   
     git clone https://github.com/NaveenReddyMatta/Calculator.git
   
     cd Calculator
   
3. **Install Java 21 and Maven**

     Download Java JDK 21

     Download Maven

     Add both to your system PATH

5. **Run the Application**
   
     mvn spring-boot:run
  
7. **Access the App Open your browser and visit:**
   
     http://localhost:8081

  ### On CentOS
1. **Clone the Repository**
   
     git clone https://github.com/NaveenReddyMatta/Calculator.git
   
     cd Calculator
   
3. **Install Java 21**
   
     sudo yum install java-21-openjdk
   
5. **Install Maven**
   
    sudo yum install maven    # For CentOS 7
   
     OR
   
    sudo dnf install maven    # For CentOS 8+
   
7. **Run the Application**
   
   mvn spring-boot:run

9. **Access the App**
    
   On the same system:
   
   http://localhost:8081
   
   From another machine (replace with server IP):

       http://<your-server-ip>:8081

  ## Optional: Open firewall port
 
   sudo firewall-cmd --add-port=8081/tcp --permanent

   sudo firewall-cmd --reload

 ## API Endpoint

Method- GET

URL- /api/calculate   

Description-   Performs arithmetic operation

## Query Parameters

| Name      | Type   | Description                              |
|-----------|--------|------------------------------------------|
| `num1`    | double | First number                             |
| `num2`    | double | Second number                            |
| `operation` | string | Select One of this `add`, `subtract`, `multiply`, `divide` |


## UI Preview

Visit in browser:

http://localhost:8081

## The HTML form lets users:

   Enter two numbers
   
   Choose an operation
   
   Submit to see the result
   
## Build JAR File

  To package the app:
  
  mvn clean package
