// Name: Ryan Muniz
// Email: rmuniz15@student.cnm.edu
// Class: CSCI 2260: Section R01
// Assignment: Week 7: Human Resources Part 2
// Purpose: 
// FileName: "PersonImperialSet.java"
// Date: March 11, 2026

/*
PersonImperialSet class
Extends PersonSet
Overrides the add method so that height is converted
from centimeters to inches and weight is converted
from kilograms to pounds before the Person is added to the set.

It still prevents duplicates because it calls super.add(p) after the
conversion is complete.
*/

public class PersonImperialSet extends PersonSet {
    /*
    add method
    Converts the Person object's height and weight from
    metric to imperial units, then adds to the set by
    calling to the parent class add method.

    Conversion happens first so that duplicate checking happens
    with imperial values stored in the set.
    */
   @Override
   public void add(Person p) {
    // Convert the height from centimeters to inches
    double imperialHeight = convertHeight(p.getHeight());

    // Convert the weight from kilograms to pounds
    double imperialWeight = convertWeight(p.getWeight());

    // Update the Person object so it now stores imperial values.
    p.setHeight(imperialHeight);
    p.setWeight(imperialWeight);

    // Call the parent class add method after conversion
    // to check for duplicates
    super.add(p);
   }
   /*
   convertHeight method
   Converts a height value from centimeters to inches.
   Using inches = centimeters / 2.54
   */
  public double convertHeight(double height) {
    return height / 2.54;
  }
  /*
  convertWeight method
  Converts a weight value from kilograms to pounds.
  Using pounds = kilograms * 2.20462
  */
 public double convertWeight(double weight) {
    return weight * 2.20462;
 }
}
