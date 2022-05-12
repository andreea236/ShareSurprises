package container;

import java.util.ArrayList;
import java.util.Random;
import surprise.ISurprise;

public class RandomBag implements IBag {
	private static final Random randomGenerator = new Random();

	private ArrayList<ISurprise> surprises;

	public RandomBag() {
		this.surprises = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise); // LIFO?

	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			ISurprise nextSurprise = bagOfSurprises.takeOut();
			this.put(nextSurprise);
		}
	}

	@Override
	public boolean isEmpty() {
		return surprises.isEmpty();
	}

	@Override
	public int size() {
		return surprises.size();
	}

	@Override
	public ISurprise takeOut() {
		if(this.isEmpty())
			return null;
		int randomIdx = randomGenerator.nextInt(surprises.size());
		ISurprise surprise = this.isEmpty() ? null : surprises.get(randomIdx);
		surprises.remove(randomIdx);
		return surprise;
	}

}
