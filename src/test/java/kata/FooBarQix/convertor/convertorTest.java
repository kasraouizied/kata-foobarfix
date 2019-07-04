package kata.FooBarQix.convertor;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class convertorTest
{

	@Test
	public void divisorFirst() {
		assertEquals("FooBar", convertor.convert(51));
	}

	@Test
	public void orderAppear() {
		assertEquals("BarFoo", convertor.convert(53));
		assertEquals("BarFooBar", convertor.convert(35));
		assertEquals("FooQix", convertor.convert(37));

	}
	
	@Test
	public void containNumber() {
		assertEquals("Foo", convertor.convert(13));
		assertEquals("Qix", convertor.convert(17));
	}
	
	@Test
	public void combineOperation() {
		assertEquals("FooBarBar", convertor.convert(15));
		assertEquals("FooBarQixBar", convertor.convert(75));
	}
	
	@Test
	public void combinethree() {
		assertEquals("FooFooFoo", convertor.convert(33));
		assertEquals("BarBarBar", convertor.convert(55));
		assertEquals("QixQix", convertor.convert(77));
	}
	
	@Test
	public void devideAndAppear() {
		assertEquals("FooQix", convertor.convert(27));
	}
}
