package myfacebook;

import static org.junit.Assert.assertTrue;

import myfacebook.util.Hello;

public class TestHello {
	Hello he;
	public void testAdd_twoposintegers() {
		he = new Hello();
		int expected = 9;
		int actual = he.add(5, 4);
		assertTrue(expected == actual);
	}
}
