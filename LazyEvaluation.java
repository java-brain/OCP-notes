import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LazyEvaluation {
	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("cat1");
		cats.add("cat2");
		Stream<String> stream = cats.stream(); // stream isn't actually created here
		cats.add("cat3");
		System.out.println(stream.count()); // the stream pipeline actually runs here
	}
}
