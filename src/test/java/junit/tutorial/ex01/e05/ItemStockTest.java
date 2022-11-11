package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock itemStock = new ItemStock();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		Item book = new Item("book", 1000);
		int result = itemStock.getNum(book);
		assertEquals(0, result, "test1 error");
	}

	@Test
	void test2() {
		Item book = new Item("book", 1000);
		itemStock.add(book);
		int result = itemStock.getNum(book);
		assertEquals(1, result, "test2 error");
	}

//	@Test
//	void test3() {
//		Item book = new Item("book", 1000);
//		itemStock.add(book);
//		int result = itemStock.getNum(book);
//		assertEquals(1, result, "test3 error");
//	}

	@Test
	void test4() {
		Item book = new Item("book", 1000);
		itemStock.add(book);
		itemStock.add(book);
		int result = itemStock.getNum(book);
		assertEquals(2, result, "test4 error");
	}

	@Test
	void test5() {
		Item book = new Item("book", 1000);
		itemStock.add(book);
		Item CD = new Item("CD", 1500);
		itemStock.add(CD);
		int result = itemStock.getNum(CD);
		assertEquals(1, result, "test5 error");
	}

}
