package kata.FooBarQix.convertor;

public class convertor {
	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";
	private static final String THREE = "3";
	private static final String FIVE = "5";
	private static final String SEVEN = "7";
	private static final String EMPTY = "";

	public static String convert(Integer i) {
		String toprint = EMPTY;
		String counterString;
		toprint = EMPTY;
		counterString = i.toString();
		if (i % 3 == 0) {
			toprint = toprint + FOO;
		}
		if (i % 5 == 0) {
			toprint = toprint + BAR;
		}
		counterString = counterString.replaceAll(THREE, FOO);
		counterString = counterString.replaceAll(FIVE, BAR);
		counterString = counterString.replaceAll(SEVEN, QIX);
		if(! counterString.equals(i.toString())) {
			counterString = counterString.replaceAll("[0-9]+","");
			toprint = toprint + counterString;
		}
				
		if (toprint.isEmpty()) {
			toprint = counterString;
		}

		return toprint;
	}
}
