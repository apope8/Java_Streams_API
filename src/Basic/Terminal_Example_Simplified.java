package Basic;

import java.util.ArrayList;
import java.util.List;

public class Terminal_Example_Simplified {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Terming Example Simplified");
		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");

		// all calls made in one stream - method chaining

		//simplified
//		list.stream()
//				.map((String element) -> element.toLowerCase())
//				.map((String element) -> element.toUpperCase())
//				.forEach((String element) -> System.out.println(element));

		//simplified more - String type is inferred from the stream
//		list.stream()
//				.map(element -> element.toLowerCase())
//				.map(element -> element.toUpperCase())
//				.forEach(element -> System.out.println(element));

		//simplified even more! Method references
		list.stream()
				.map(String::toLowerCase)
				.map(String::toUpperCase)
				.forEach(System.out::println);

	}
}
