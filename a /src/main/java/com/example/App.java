package com.example;

// This import is possible because of the dependency added in build.gradle
import com.google.common.base.Joiner;

public class App {
    public String getGreeting() {
        return "Hello from the Gradle App!";
    }

    public static void main(String[] args) {
        // We use the external Guava library to demonstrate dependency management
        Joiner joiner = Joiner.on(" ").skipNulls();
        String greeting = joiner.join("Hello", "from", "the", "Gradle", "App!");

        System.out.println(greeting);
    }
}
