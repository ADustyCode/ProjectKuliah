public class WeekdayLib {
    public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here
        yy = (yyyy - 1900);
        if (is_leap(yyyy) == true && mm == 1 || mm == 2) total = yy/4 + yy + dd + month_offset(mm)-1;
        else total = yy/4 + yy + dd + month_offset(mm);
        date = weekday_name(total%7) + ", " + month_name(mm) + " " + dd + ", " + yyyy;
		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here

    public static String weekday_name( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 || weekday == 0)
		{
			result = "Saturday";
		}
		else {
			result = "error";
		}
		
		return result;
	}

	public static String month_name( int month )
	{
		String result;
		// Your code goes in here.
		switch (month){
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "error";
                break;
        }
		return result;
	}

    public static int month_offset( int month )
	{
		int result;
		// Your code goes in here.
		switch (month){
            case 1:
                result = 1;
                break;
            case 2:
                result = 4;
                break;
            case 3:
                result = 4;
                break;
            case 4:
                result = 0;
                break;
            case 5:
                result = 2;
                break;
            case 6:
                result = 5;
                break;
            case 7:
                result = 0;
                break;
            case 8:
                result = 3;
                break;
            case 9:
                result = 6;
                break;
            case 10:
                result = 1;
                break;
            case 11:
                result = 4;
                break;
            case 12:
                result = 6;
                break;
            default:
                result = -1;
                break;
        }
		return result;
	}
    
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
