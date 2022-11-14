package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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
	void test() {
		String obj1 = "2012/1/31";
		String obj2 = "2012/1/30";
		String obj3 = "2012/2/1";
		if (LocalDate.now().equals(obj1)) {
			assertEquals(0, "error");
		} else if (LocalDate.now().equals(obj2)) {
			assertEquals(1, "error");
		} else if (LocalDate.now().equals(obj3)) {
			assertEquals(28, "error");
		}

	}

}
