
/**
 * Title
 *
 * Program Summary
 * 
 * Summary of Important (KEY) Programming Elements Used
 */
public class Formatting // Beginning of Program || primary class "Formatting"
{
    // Global & Instance variables - Global variables can be accessed anywhere in the program, Instance variables belong to the class only 
    int a = 100;   // Global Variable
    private int x; // Instance, Used in class only

    /**
     * Constructor for objects of class Formatting
     * Summarize the Class Constructor "Formatting"
     */
    public Formatting() //Beginning of Constructor Formatting || Used to create objects
    {
        // initialise instance variables - These are local variables that can be only accesed by methods of the class constructor
        x = 15; // This value is determined from a textbook
    } // End of Constructor Formatting

    /**
     * A method - is a function that can only be accessed through a class. It cannot be accessed anywhere or anytime on its own. A method does a specific job that helps out the main objective of the program
     * 
     * To use this method requires the call (invoke): Formatting.sampleMethod(6);
     *
     * y:      is a parameter that is passed in to the method
     * return: tells the method what to give back after it has done its job and for this method it has to be of type int
     */
    public int sampleMethod(int y) // Beginning of sampleMethod || Methods can only be called (invoked) by an object of the class
    {
        // put your code here
        
        return (x + y); // This is the primary calculation of the method
    } // End of sampleMethod
    
    /**
     * An example of a main method - this is the main part of the program that has the bulk of the code
     *
     * Any comment put here will be added to the user interface when it program is run
     */
    public static void main(String[] args) // Beginning of Main
    {
        // put your code here
        
        // Variable Declarations
        int z; 
        
        
        
        Formatting myObject = new Formatting(); // Here I am creating an Object of class Formatting
        z = (myObject.sampleMethod(21)); // Here I am setting the result of the method (function call) to a variable
        
        
        
        // User interface
        System.out.println("Hello World");
        System.out.println("The Magic number is: " + z); //Thisis the primary output of this program 
        
    } // End of Main 
} // End of program || primary class "Formatting"


/*
 * 
 * Any notes you want to add to a program go below the End of Program TAG
 * 
 */
