// Name: Ryan Muniz
// Email: rmuniz15@student.cnm.edu
// Class: CSCI 2260: Section R01
// Assignment: Week 6: Human Resources Part 1
// Purpose:  
// FileName: "Person.java"
// Date: March 11, 2026

/*
Person class stores the basic HR information for one person.
Each Personn object contains a name, height, and weight.
It also provides getter and setter methods,
a toString() method for clean printing, and an equals() method
so duplicate Person objects can be detected.
*/
public class Person {
    // Private instance variables for storing one person's data
    private String name;
    private double height;
    private double weight;

    /*
    Person Constructor method
    Creates a new Person object and initizalizes the person's 
    name, height, and weight
    */
    public Person(String name, double height, double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
   }
    /*
    getName method
    Returns the name stored in the Person object
    */
    public String getName() {
    return name;
  }
    /*
    getHeight method
    Returns the height stored in the Person object 
    */
    public double getHeight() {
    return height;
 }
    /*
    getWeight method
    Returns the weight stored in the Person object
    */
    public double getWeight() {
        return weight;
    }
    /*
    setHeight method
    Updates the height value for the Person object
    */
   public void setHeight(double height) {
    this.height = height;
   }
   /*
   setWeight method
   Updates the weight value for the Person object
   */
  public void setWeight(double weight) {
    this.weight = weight;
    }
    /*
     toString method
    Returns the Person object's data as a single formatted String.
     Makes it easier to print in readable form.
     */
    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
    /*
    equals Boolean method
    Checks whether another object is equal to this Person object.
    Two Person objects are considered equal if they have the same
    name, height, and weight values. This method is necessary so
    that PersonSet can prevent duplicates!
    */
    @Override
    public boolean equals(Object o) {
        // If the other object is null, objects are not equal
        if(o == null) {
            return false;
        }
        // If both references point to the same object, they are equal
        if(o == this) {
            return true;
        }
        // If the object is not a Person, they can't be equal
        if(!(o instanceof Person)) {
            return false;
        }
        // Cast the Object reference into a Person reference
        Person p = (Person)o;
        // Compare all three instance variables
        return name.equals(p.name) && height == p.height && weight == p.weight;
    }
}