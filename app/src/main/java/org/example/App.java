package org.example;

import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
    	// Initialize Gson
        Gson gson = new Gson();

        // Parse JSON
        String json = "{\"name\":\"John\", \"age\":30}";
        Person person = gson.fromJson(json, Person.class);

        // Print parsed JSON
        System.out.println("Parsed JSON: " + person);

        System.out.println(new App().getGreeting());
    }

    public String getGreeting() {
        return "Hello World!";
    }

    // Inner class representing a Person
    static class Person {
        String name;
        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}