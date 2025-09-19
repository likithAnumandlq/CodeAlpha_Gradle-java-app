# CodeAlpha_Gradle-java-app
This project demonstrates how to build and manage a simple Java application using Gradle, a powerful build automation tool. It showcases core DevOps principles like dependency management and automated builds.

How It Works
The project is configured using a build.gradle file, which acts as the control center for the build process.

1.Dependency Management: The build.gradle file declares external libraries (like Google's Guava) that the project needs. Gradle automatically downloads and manages these dependencies from the mavenCentral repository.

2.Automated Build: Gradle provides simple commands to compile the Java source code, run tests, and package the application into a runnable JAR file.

3.Application Entry Point: The mainClass property is set to tell Gradle which class to execute when the application is run.
Technologies Used-
Java
Gradle

How to Run
1.Prerequisites: You must have a Java Development Kit (JDK) and Gradle installed.

2.Clone the Repository: Clone this repository to your local machine.

3.Build the Project: Open a terminal in the project's root directory and run the build command:gradle build

4.Run the Application: Use the following command to execute the application:gradle run

You will see the output "Hello from the Gradle App!" printed to the console.
