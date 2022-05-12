package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {

	private static final ArrayList<String> candies = new ArrayList<>(
			Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));

	private static final Random randomGenerator = new Random();

	private String typeOfCandies;
	private int quantity;

	public Candies(String typeOfCandies, int quantity) {
		this.typeOfCandies = typeOfCandies;
		this.quantity = quantity;
	}

	public String getTypeOfCandies() {
		return typeOfCandies;
	}

	public void setTypeOfCandies(String typeOfCandies) {
		this.typeOfCandies = typeOfCandies;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static Candies generate() {
		return new Candies(candies.get(Candies.randomGenerator.nextInt(Candies.candies.size())),
				Candies.randomGenerator.nextInt(100));
	}

	@Override
	public void enjoy() {
		System.out.println("Enjoy your delicious " + this.typeOfCandies + ". " + this.quantity + " left.");
	}

}
