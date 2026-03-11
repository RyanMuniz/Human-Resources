/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

Q2: Color and Red are related
by which, Inheritance or Composition?

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

*/

// Import necessary utilities
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Cannot test this code until the other programs are written.
// Logic looks good though
public class Main 
{
    /*
Main method
Method creates a test Person and a test PersonSet.
It then opens hr.txt, skips the header row, reads the data
for each person, creates Person objects from that data, and
adds them to the PersonSet while automatically preventing duplicates.
Lastly, it prints the contents of the PersonSet.
*/
	public static void main(String[] args) 
	{
        // Create one Person object as a simple test of constructor
        // Using Yoshi! :)
		Person testPerson = new Person("Yoshi", 140, 50);

        // Print the test Person so we can verify the object was created correctly
		System.out.println("Single Person Test: ");
        System.out.println(testPerson);
        System.out.println();

        // Create a PersonSet object as a test
        PersonSet people = new PersonSet();

        // Add the test Person to verify the set works
        people.add(testPerson);

        System.out.println("PersonSet Test after adding one person: ");
        System.out.println(people);

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

                // Create a Person object from the row's data
                Person person = new Person(name, height, weight);

                // Add the Person to the PersonSet
                // Duplicate rows will be ignored!
                people.add(person);
            }
            // Close Scanner after finishing
            fileReader.close();
        }
        catch(IOException e) {
            // Print error message if the file cannot be read
            System.out.println("Error reading from hr.txt file.");
            e.printStackTrace();
            System.exit(1);
        }

        // Print the final set of unique Person objects
        System.out.println("Final PersonSet with duplicates removed: ");
        System.out.println(people);
	}
}
