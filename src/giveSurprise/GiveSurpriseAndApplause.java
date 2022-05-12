package giveSurprise;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

	public GiveSurpriseAndApplause(String typeOfContainer, int time) {
		super(typeOfContainer, time);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
		System.out.println();
	}

}
