package giveSurprise;

import container.IBag;
import containerFactory.BagFactoryOptimizeAccess;
import surprise.ISurprise;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	static BagFactoryOptimizeAccess bagFactory = new BagFactoryOptimizeAccess();
	int waitTime;
	IBag bag;

	public AbstractGiveSurprises(String typeOfContainer, int time) {
		bag = bagFactory.makeBag(typeOfContainer);
		waitTime = time;
	}

	boolean isEmpty() {
		return this.bag.isEmpty();
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.put(surprises);
	}

	public void give() {
		if (this.bag.isEmpty()) {
			System.out.println("The bag is empty.");
			return;
		}
		ISurprise surprise = this.bag.takeOut();
		surprise.enjoy();
		this.giveWithPassion();
	}

	public void giveAll() {
		while (!bag.isEmpty()) {
			ISurprise surprise = this.bag.takeOut();
			surprise.enjoy();
			this.giveWithPassion();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	abstract void giveWithPassion();
}
