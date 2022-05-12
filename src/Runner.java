import java.util.Scanner;

import giveSurprise.AbstractGiveSurprises;
import giveSurprise.GiveSurpriseAndApplause;
import giveSurprise.GiveSurpriseAndHug;
import giveSurprise.GiveSurpriseAndSing;
import surprise.GatherSurprises;
import surprise.ISurprise;

public class Runner {

	public static ISurprise[] generateSurprises(int noSurprises) {
		return GatherSurprises.gather(noSurprises);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a type of bag: FIFO, LIFO, RANDOM");
		String typeOfBag = sc.nextLine();

		System.out.println("Choose number of surprises:");
		int noSurprises = sc.nextInt();

		System.out.println("Choose waiting time:");
		int time = sc.nextInt();

		sc.nextLine();

		System.out.println("Choose to give one or all surprises:");
		String oneAllSurprises = sc.nextLine();

		System.out.println("Choose give type: applause, hug, sing");
		String giveType = sc.nextLine();

		AbstractGiveSurprises surpriseGiver = null;
		ISurprise[] surprises = generateSurprises(noSurprises);
		
		sc.close();

		switch (giveType) {
		case "applause":
			surpriseGiver = new GiveSurpriseAndApplause(typeOfBag, time);
			for (int i = 0; i <= noSurprises - 1; i++) {
				surpriseGiver.put(surprises[i]);
			}
		case "hug":
			surpriseGiver = new GiveSurpriseAndHug(typeOfBag, time);
			for (int i = 0; i <= noSurprises - 1; i++) {
				surpriseGiver.put(surprises[i]);
			}
		case "sing":
			surpriseGiver = new GiveSurpriseAndSing(typeOfBag, time);
			for (int i = 0; i <= noSurprises - 1; i++) {
				surpriseGiver.put(surprises[i]);
			}
		}

		if (oneAllSurprises.equals("one")) {
			surpriseGiver.give();
		} else {
			surpriseGiver.giveAll();
		}
	}
}
