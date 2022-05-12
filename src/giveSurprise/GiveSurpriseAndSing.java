package giveSurprise;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	public GiveSurpriseAndSing(String typeOfContainer, int time) {
		super(typeOfContainer, time);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
		System.out.println();
	}

}
