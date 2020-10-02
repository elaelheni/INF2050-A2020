public class FizzBuzz{
	public static void main (String args[]){

			//commentaire pas utile
		int max = (args.length > 0) ? Integer.parseInt(args[0]) : 200;


		for (int i=1; i<=max; ++i){
			if (i%15 == 0) System.out.println("FizzBuzz");
			else if (i%3 == 0) System.out.println("Fizz");
			else if (i%5 == 0) System.out.println("Buzz");
			else System.out.println(i);

			System.out.println(", ");


		}

	}
}
