# Gradle Project Initialization

This guide outlines the steps to initialize a new Gradle project using the `gradle init` command.

## Steps to Initialize a Gradle Project

1. **Create a Directory for the New Project:**
    - Create a directory where you want to initialize the Gradle project.
    - You can do this using the `mkdir` command in the terminal:
        ```bash
        mkdir java-gradle-project
        ```

2. **Change to the Project Directory:**
    - Navigate to the newly created directory:
        ```bash
        cd java-gradle-project
        ```

3. **Run the Gradle Init Command:**
    - Use the `gradle init` command to initialize a new Gradle project:
        ```bash
        gradle init
        ```

4. **Select the Project Type:**
    - The `gradle init` command will prompt you to select the type of project you want to generate.
    - There are four command-line options available:
        - basic
        - application
        - library
        - Gradle plugin
    - Type `2` and press Enter to create an application. The default selection is basic.

5. **Select the Implementation Language:**
    - Choose the implementation language for your project.
    - There are five options available:
        - C++
        - Groovy
        - Java
        - Kotlin
        - Swift
    - Type `3` and press Enter for Java. The default selection is Java.

6. **Select the Default Build Script Language:**
    - Choose the default build script language for the project.
    - There are two options available:
        - Groovy
        - Kotlin
    - Type `1` and press Enter for Groovy. The default selection is Groovy.

7. **Select the Test Framework:**
    - Choose one of the available options for the testing framework.
    - There are four options available:
        - JUnit 4
        - TestNG
        - Spock
        - JUnit Jupiter
    - Enter your choice. The default selection is JUnit 4.

8. **Enter the Project Name:**
    - Provide a name for your project.
    - By default, it will take the directory name as the project name.

9. **Enter the Source Package:**
    - Provide the source package for your project.
    - By default, it will take the directory name as a source package.

10. **Enter the Target Java Version Type:**
    - Specify the target Java version type for your project.

## Invoking Gradle

Once your Gradle project is initialized, you can use Gradle commands to build, test, and run your application.

- To build the project:
    ```bash
    gradle build
    ```

- To clean the project:
    ```bash
    gradle clean
    ```

- To run tests:
    ```bash
    gradle test
    ```

## IDE Integration

Gradle is integrated into popular IDEs like Android Studio, IntelliJ IDEA, Visual Studio Code, Eclipse, and NetBeans, enabling automatic invocation for building, cleaning, and running applications. Referencing the IDE manual is recommended for further understanding and configuring Gradle usage.

## Project Structure

A typical Gradle project structure includes essential files like `build.gradle` and `settings.gradle` located in the root directory. These files define the project configuration and settings.

