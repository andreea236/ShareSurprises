package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

	private static final ArrayList<String> minionToy = new ArrayList<>(
			Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));

	private String toy;
	private static int count = 0;

	public MinionToy(String toy) {
		this.toy = toy;
	}

	public String getMinionToy() {
		return toy;
	}

	public void setMinionToy(String toy) {
		this.toy = toy;
	}

	public static MinionToy generate() {
		if (count == minionToy.size()) {
			count = 0;
		}
		MinionToy minion = new MinionToy(minionToy.get(count));
		count++;
		return minion;
	}

	@Override
	public void enjoy() {
		System.out.println("Have fun with your new minion toy named " + this.toy);
	}

}
