/*
What do you think else if and else are doing? Answer in a comment.
* if untuk menjalankan kode dalam bracket jika statement nya benar/true, jika salah/False maka akan lompat ke else.
* 
Remove the else part at the beginning of one of the else if statements. What difference does that make? Why? Answer in a comment.
* if kedua akan dijalankan setelah if pertama, karena if kedua tidak masuk kedalam if pertama.
 */

public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}

