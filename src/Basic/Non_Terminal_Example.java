package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Non_Terminal_Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Non Terming Example");
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");

		// Streams are carried on from the results of the previous stream

		Stream<String> stream = list.stream();

		Stream<String> lowercaseStream = stream.map((String element) -> {
			return element.toLowerCase();
		});

		Stream<String> uppercaseStream = lowercaseStream.map((String element) -> {
			return element.toUpperCase();
		});

		uppercaseStream.forEach((String element) -> {
			System.out.println(element);
		});
	}
}
