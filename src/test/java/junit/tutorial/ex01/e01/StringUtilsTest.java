package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testToSnakeCase1() {
		String result=StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",result,"toSnakeCase1(aaa)失敗");
	}

}
