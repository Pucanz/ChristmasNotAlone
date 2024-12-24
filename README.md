# **ChristmasNotAlone - Social Impact Project** 🎄❤️  

## **Project Overview**  
**ChristmasNotAlone** is a web platform designed to connect individuals spending Christmas alone with families willing to share their holiday celebrations. The goal is to foster a sense of belonging, create meaningful connections, and ensure no one spends the festive season in isolation.  

Families can sign up to host, and individuals can register to join a family for a heartwarming Christmas celebration.  

---

## **Features**  
- **Family Registration**: Families can create a profile and apply to host individuals for Christmas.  
- **Individual Registration**: Individuals can sign up to find families willing to host them.  
- **Matching System**: Facilitates the pairing of families and individuals based on preferences and availability.  
- **Dynamic Web Interface**: User-friendly platform for registration, matching, and communication.  
- **Social Impact**: Promotes inclusion and strengthens community bonds during the holiday season.  

---

## **Technologies Used**  

### **Backend**  
- **Java**: Backend logic and implementation.  
- **Spring Framework**:  
  - **Spring MVC**: Implements MVC design pattern and RESTful services.  
  - **Apache Tomcat**: Used as the servlet container and web server for deploying the application.
  - **REST API**: Facilitates communication between frontend and backend.  
- **MySQL**: Database for storing user profiles, applications, and match details.  

### **Frontend**  
- **JavaScript**: Interactive client-side functionality.  
- **AJAX**: For asynchronous requests to the backend. 
- **HTML/CSS**: Building the structure and styling the user interface.  

---

## **Setup Instructions**  

### **1. Clone the Repository**  
```bash
git@github.com:TiagoElvas/ChristmasNotAlone.git
cd christmas-together
```

### **2. Configure the Backend**  
Set up the MySQL Database:
- Create a database named family_table;
- The schema and tables will be created automatically when the application starts (if configured correctly).

### **4. Deploy the Backend Server**
Package your application as a WAR file and deploy it to the Apache Tomcat server:

```bash
# Package the application as a WAR file
mvn clean package
```
Start the Tomcat server
```bash
./bin/startup.sh  # For Linux/Mac
.bin\startup.bat   # For Windows
```
Deploy the application using the command (this requires that Maven Tomcat plugin is properly configured in pom.xml)
```bash
mvn tomcat7:deploy
```

### **5. Configure the Frontend**
Open the frontend/ directory.
Edit the JavaScript files to ensure AJAX requests point to the correct backend API endpoint (e.g., http://localhost:8080).

### **6. Run the Frontend**
Open the index.html file in a web browser.
Use the platform to register as a family or an individual and explore the features.

### **Contributors**
This was a final project of a fullstack bootcamp @ CodeForAll developed in three days by Paulo Silva, João Almeida, Daniel Fernandes and me where we were responsible for develop a website with social impact as a theme. 


