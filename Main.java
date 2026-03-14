// Name: Ryan Muniz
// Email: rmuniz15@student.cnm.edu
// Class: CSCI 2260: Section R01
// Assignment: Week 7: Human Resources Part 2
// Purpose: Runs the program by reading HR data from a txt file then
// creates sets, removes duplicates, and displays results to the console.
// FileName: "Main.java"
// Date: March 11, 2026


/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

Answer: Composition

Q2: Color and Red are related
by which, Inheritance or Composition?

Answer: Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

Answer: Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

Answer: Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

Answer: Composition

*/

// Import necessary utilities
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Main class
Driver of the Human Resources assignment

For part 2 of the assignment this will:
1. Creates a PersonOrderedSet object
2. Creates a PersonImperialSet object
3. Reads human resources data from hr.txt
4. Creates Person objects from each line of file data
5. Adds one copy of each Person to the ordered set
6. Adds another copy of each Person to the imperial set
7. Writes both sets to seperate output files
8. Prints both sets to the console
*/
public class Main 
{
    /*
main method
Opens hr.txt, skips the header row, reads the data,
and uses it to populate both a PersonOrderedSet and a 
PersonImperialSet. Lastly, it writes each set to its
own output file and prints both sets to the console.
*/
	public static void main(String[] args) 
	{
        // Create the ordered set object
        PersonOrderedSet orderedPeople = new PersonOrderedSet();
        // Create the imperial set object
        PersonImperialSet imperialPeople = new PersonImperialSet();
        try
        {
            // Create a File object representing hr.txt
            File file = new File("hr.txt");

            // Create a Scanner to read data from the file
            Scanner fileReader = new Scanner(file);

            // Skip the first line because it contains column headers
            fileReader.nextLine();

            // Continue reading rows until there is no more data
            while(fileReader.hasNext()) {
                // Read one full row of person data
                String name = fileReader.next();
                double height = fileReader.nextDouble();
                double weight = fileReader.nextDouble();

                // Create two seperate Person objects
                Person orderedPerson = new Person(name, height, weight);
                Person imperialPerson = new Person(name, height, weight);

                // Add the Person to the ordered set
                orderedPeople.add(orderedPerson);
                // Add the seperate Person object to the imperial set
                imperialPeople.add(imperialPerson);
            }
            // Close Scanner after finishing
            fileReader.close();
            // Create a FileWriter for the ordered output file
            FileWriter orderedWriter = new FileWriter("hr_ordered_set_output.txt");
            // Write the ordered set data to the ordered output file
            orderedWriter.write(orderedPeople.toString());
            // Close the FileWrite to save
            orderedWriter.close();
            // Create a FileWriter for the imperial output file
            FileWriter imperialWriter = new FileWriter("hr_imperial_set_output.txt");
            // Write the imperial set data to the imperial output file
            imperialWriter.write(imperialPeople.toString());
            // Close the FileWriter to save
            imperialWriter.close();
        }
        catch(IOException e) {
            // Print error message if the file cannot be read
            System.out.println("Error reading from hr.txt file or writing to a file.");
            e.printStackTrace();
            System.exit(1);
        }

        // Print the ordered set to the console
        System.out.println("Ordered Set Output: ");
        System.out.println(orderedPeople);
        // Print the imperial set to the console
        System.out.println("Imperial Set Output: ");
        System.out.println(imperialPeople);
	}
}
