package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testToSnakeCase1() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result, "toSnakeCase1(\"aaa\")失敗");
	}

	@Test
	void testToSnakeCase2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result, "toSnakeCase2(HelloWorld)失敗");
	}

	@Test
	void testToSnakeCase3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result, "toSnakeCase3(practiceJunit)失敗");
	}

}
