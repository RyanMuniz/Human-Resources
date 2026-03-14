// Name: Ryan Muniz
// Email: rmuniz15@student.cnm.edu
// Class: CSCI 2260: Section R01
// Assignment: Week 7: Human Resources Part 2
// Purpose: Extends PersonSet to store Person objects in
// alphabetical order by name.
// FileName: "PersonOrderedSet.java"
// Date: March 11, 2026

// Import necessary utilities
import java.util.Collections;

/*
PersonOrderedSet class
Extends PersonSet
It overrides the add method so that:
1. Duplicate Person objects are still prevented
2. The list is kept in alphabetical order by name
*/
public class PersonOrderedSet extends PersonSet {
    /*
    add method
    Adds a Person object using the parent class add method.
    After they are added, the list is sorted in alphabetical
    order by name.
    Parent add method already handles duplicate cases so this
    child class reuses that logic.
    */
   @Override
   public void add (Person p) {
    //Call the parent class add method
    // Prevents duplicates from being added
    super.add(p);

    // Sort list alphabetically by name
    Collections.sort(people);
   }
}
