/**
 *  InvalidHourlyRateException.java
 *  Throws an exception if an invalid hourly rate is assigned
 *  2/15/2023
 *  @author Joshua Williams
 */

public class InvalidHourlyRateException extends Exception
{
    public InvalidHourlyRateException()
    {
        super("Invalid Hourly Rate. [0-25]");
    }
}
