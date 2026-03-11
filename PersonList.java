// Name: Ryan Muniz
// Email: rmuniz15@student.cnm.edu
// Class: CSCI 2260: Section R01
// Assignment: Week 6: Human Resources Part 1
// Purpose:  
// FileName: "PersonList.java"
// Date: March 11, 2026

/*
PersonList interface
Defines the required behaviors for a class that stores Person objects.
Any class implementing this interface must provide:
1. a method to add a Person
2. a method to get a Person at a given index
*/
public interface PersonList {
    // add method
    // Adds a Person object to the collection
    public void add(Person p);

    /*
    get method
    Returns the Person object at the given index.
    */
   public Person get(int index);
}
