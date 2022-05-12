package container;

import java.util.ArrayList;

import surprise.ISurprise;

public class LIFOBag implements IBag {

	private ArrayList<ISurprise> surprises;

	public LIFOBag() {
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
		int lastSurprise = this.size() - 1;
		ISurprise surprise = surprises.get(lastSurprise);
		surprises.remove(lastSurprise);
		return surprise;
	}

}