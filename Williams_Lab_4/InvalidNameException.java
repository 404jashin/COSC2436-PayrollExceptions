/**
 *  InvalidNameException.java
 *  Throws an exception if an invalid name is assigned
 *  2/15/2023
 *  @author Joshua Williams
 */

public class InvalidNameException extends Exception
{
    public InvalidNameException()
    {
        super("Invalid Name.");
    }
}
