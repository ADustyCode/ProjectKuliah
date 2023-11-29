/*
 * ModulusAnimation.java
 * 
 * Copyright 2023 Zeryuu Hz <Zeryuu Hz@LAPTOP-22SAIEV9>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		int repeats = 5;
		int steps_per_second = 10;

		for ( int i=0; i<repeats*11 ; i++ )
		{
			if ( i%11 == 0 )
				System.out.print(" < ------- \r");
			else if ( i%11 == 1 )
				System.out.print("  =------- \r");
			else if ( i%11 == 2 )
				System.out.print("  <------- \r");
			else if ( i%11 == 3 )
				System.out.print(" - =------ \r");
			else if ( i%11 == 4 )
				System.out.print(" - <------ \r");
			else if ( i%11 == 5 )
				System.out.print(" -- =----- \r");
			else if ( i%11 == 6 )
				System.out.print(" -- <----- \r");
			else if ( i%11 == 7 )
				System.out.print(" -- >----- \r");
			else if ( i%11 == 8 )
				System.out.print(" - >------ \r");
			else if ( i%11 == 9 )
				System.out.print("  >------- \r");
			else if ( i%11 == 10 )
				System.out.print(" > ------- \r");

			Thread.sleep(1000/steps_per_second);
		}
		
	}
}

