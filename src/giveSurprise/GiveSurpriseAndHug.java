package giveSurprise;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{

	public GiveSurpriseAndHug(String typeOfContainer, int time) {
		super(typeOfContainer, time);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
		System.out.println();
	}

}
