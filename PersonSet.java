// Name: Ryan Muniz
// Email: rmuniz15@student.cnm.edu
// Class: CSCI 2260: Section R01
// Assignment: Week 6: Human Resources Part 1
// Purpose: Helper class to Main.java that stores many
// Person objects and prevents duplicates.
// FileName: "PersonSet.java"
// Date: March 11, 2026

// Import necessary utilities
import java.util.ArrayList;

/* 
PersonSet class
Implements the PersonList interface and stores
Person objects in an ArrayList.
Does not allow duplicate Person objects to be added.
*/
public class PersonSet implements PersonList {
    // Protected so future classes can access it (Part 2)
    protected ArrayList<Person> people = new ArrayList<Person>();
    /*
    add method
    Adds a Person object to the collection only if it is not already present.
    */
   @Override
   public void add(Person p) {
    // Only add person if they are not already in the list
    if(!people.contains(p)) {
        people.add(p);
    }
   }
   /*
   get method
   Returns the Person object stored at the specified index.
   */
  @Override
  public Person get(int index) {
    return people.get(index);
  }
  /*
  toString method
  Builds and returns one String containing every Person object in the
  collection, each on its own line.
  */
 @Override
 public String toString() {
    String result = "";
    // Loop through every Person in the ArrayList
    for(Person p : people) {
        result += p.toString() + "\n";
    }
    return result;
 }
}
