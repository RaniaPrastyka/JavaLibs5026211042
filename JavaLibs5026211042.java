import java.util.Scanner;

public class JavaLibs5026211042{
	
	public static void main (String[] args){
		String name, couple1, couple2, food, place;
		name="rania";
		couple1="haifa";
		couple2="meli";
		food="snack";
		place="school";
		double weight, beban, beban2;
		weight= 50.8;
		beban= 40.5;
		beban2=90.5;
		int price, harga, harga2;
		price=5000;
		harga=4000;
		harga2=7000;
		
		
		System.out.println("This is our story, i am " +name+ " with my friend " +couple1);
		System.out.println("Today, we go to "+place+ " together. on the way, "+couple1+ " meet her friend, she is " +couple2);
		System.out.println("we go to " +place+ " together, after arrived at " +place+ " we were hungry and came to the canteen to buy some " +food);
		System.out.println("i found a "+food+ " that weighs " +weight+ " g, and then i bought it");
		System.out.println("the price of my " +food+ " is " +price+ " ,that's so cheap");
		System.out.println(couple1+ " bought a " +food+ " with a weight of " +beban+ " gr and the price was " +harga);
		System.out.println("then, " +couple2+ " bought a snack with a weight bigger than mine and " + couple1+ "'s.");
		System.out.println(couple2+ " bought a " +food+ " with a weight of " +beban2+ " gr and the price was " +harga2);

		Scanner jajan = new Scanner(System.in);
		int a;
		Scanner duit = new Scanner(System.in);
		double b;
		System.out.println("how much did they spend in total?");
		a = jajan.nextInt();
		System.out.print(" they spend " + a + " ribu. The result is obtained from " +price+ "+" +harga+ "+" +harga2+ "=" +a+ " ribu. ");
		System.out.println("what is the total weight of the " +food+ " they bought?");
		b = duit.nextDouble(); 
		System.out.print(" the total is " + b + " gram. The result is obtained from " +weight+ "+" +beban+ "+" +beban2+ "=" +b+ " gram");
	}
}
