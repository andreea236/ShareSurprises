package container;

import java.util.ArrayList;

import surprise.ISurprise;

public class FIFOBag implements IBag {

	private ArrayList<ISurprise> surprises;

	public FIFOBag() {
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
		ISurprise surprise = surprises.get(0);
		surprises.remove(0);
		return surprise;
	}
}
