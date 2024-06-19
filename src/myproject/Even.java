package myproject;

public class Even {

	public static void main(String[] args) {


		int i=1;

		while(i<=100)
		{
			if(i % 2 ==1 && i != 99)
				System.out.print(i+", ");
			if(i == 99)
				System.out.print(99);
			    
			i++;//101
		}

	}

}
