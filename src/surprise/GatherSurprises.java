package surprise;

import java.util.Random;

public final class GatherSurprises {

	private GatherSurprises() {
	}

	public static ISurprise[] gather(int n) {
		ISurprise[] surprises = new ISurprise[n];
		for (int i = 0; i < n; i++) {
			surprises[i] = GatherSurprises.gather();
		}
		return surprises;
	}

	public static ISurprise gather() {
		Random randomGenerator = new Random();
		switch (randomGenerator.nextInt(3)) {
		case 0:
			return Candies.generate();
		case 1:
			return FortuneCookie.generate();
		case 2:
			return MinionToy.generate();
		default:
			return null;
		}
	}

}
