/**
 *  InvalidHoursException.java
 *  Throws an exception if an invalid number of hours worked is assigned
 *  2/15/2023
 *  @author Joshua Williams
 */

public class InvalidHoursException extends Exception
{
    public InvalidHoursException()
    {
        super("Invalid Hours. [0-84]");
    }
}
