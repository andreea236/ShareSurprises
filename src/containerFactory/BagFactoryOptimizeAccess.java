package containerFactory;

import container.FIFOBag;
import container.IBag;
import container.LIFOBag;
import container.RandomBag;

public class BagFactoryOptimizeAccess implements IBagFactory {

	@Override
	public IBag makeBag(String type) {
		switch(type) {
		case "RANDOM":
			return new RandomBag();
		case "FIFO":
			return new FIFOBag();
		case "LIFO":
			return new LIFOBag();
		default:
			return null;
		}
	}

}
