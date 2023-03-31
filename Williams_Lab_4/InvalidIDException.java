/**
 *  InvalidIDException.java
 *  Throws an exception if an invalid ID number is assigned
 *  2/15/2023
 *  @author Joshua Williams
 */

public class InvalidIDException extends Exception
{
    public InvalidIDException()
    {
        super("Invalid ID. (>=0)");
    }
}
