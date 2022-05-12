package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	// private static final Saying[] sayings = { new Saying("message0", "author0")};
	private static final ArrayList<Saying> sayings = new ArrayList<Saying>(
			Arrays.asList(new Saying("\"Nothing is so much to be feared as fear.\"", "Henry David Thoreau "),
					new Saying("\"Nothing is impossible to a willing heart.\"", "John Heywood"),
					new Saying("\"All things are difficult before they are easy.\"", "Thomas Fuller"),
					new Saying("\"Worrying is like paying a debt you don't owe.\"", "Mark Twain"),
					new Saying("\"It always seems impossible until it's done.\"", "Nelson Mandela"),
					new Saying("\"Start where you are. Use what you have. Do what you can.\"", "Arthur Ashe"),
					new Saying("\"With the new day comes new strength and new thoughts.\"", "Eleanor Roosevelt"),
					new Saying("\"If you can dream it, you can do it.\"", "Walt Disney"),
					new Saying("\"Set your goals high, and don't stop till you get there.\"", "Bo Jackson"),
					new Saying("\"You will never win if you never begin.\"", "Helen Rowland"),
					new Saying("\"If you fell down yesterday, stand up today.\"", "H. G. Wells"),
					new Saying("\"I can, therefore I am.\"", "Simone Weil"),
					new Saying("\"I know not age, nor weariness nor defeat.\"", "Rose Kennedy"),
					new Saying("\"Never complain and never explain.\"", "Benjamin Disraeli"),
					new Saying("\"Every exit is an entry somewhere else.\"", "Tom Stoppard"),
					new Saying("\"Either I will find a way, or I will make one.\"", "Philip Sidney"),
					new Saying("\"You just can't beat the person who never gives up.\"", "Babe Ruth"),
					new Saying("\"Quality is not an act, it is a habit.\"", "Aristotle"),
					new Saying("\"Without hard work, nothing grows but weeds.\"", "Gordon B. Hinckley"),
					new Saying("\"Expect problems and eat them for breakfast.\"", "Alfred A. Montapert"),
					new Saying("\"Act as if what you do makes a difference. It does.\"", "William James")));

	private static final Random randomGenerator = new Random();

	private String text;
	private String author;

	private FortuneCookie(String text, String author) {
		this.text = text;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static FortuneCookie generate() {
		int randomIdx = FortuneCookie.randomGenerator.nextInt(FortuneCookie.sayings.size());
		Saying randomSaying = FortuneCookie.sayings.get(randomIdx);
		return new FortuneCookie(randomSaying.getText(), randomSaying.getAuthor());
	}

	@Override
	public void enjoy() {
		System.out.println("Enjoy your fortune cookie! Text: " + this.text + " - " + this.author);
	}
}
