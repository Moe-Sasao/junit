package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	Range range;

	@Nested
	class test1 {

		@BeforeEach
		void setUp() throws Exception {
			range = new Range(0d, 10.5);
		}

		@Nested
		class test1_1 {

			@ParameterizedTest
			@ValueSource(doubles = { 0.0, 10.5 })
			void test1_1_1(double d) {
				assertTrue(range.contains(d));
			}

		}

		@Nested
		class test1_2 {

			@ParameterizedTest
			@ValueSource(doubles = { -0.1, 10.6 })
			void test1_2_1(double d) {
				assertFalse(range.contains(d));
			}

		}

	}

	@Nested
	class test2 {

		@BeforeEach
		void setUp() throws Exception {
			range = new Range(-5.1, 5.1);
		}

		@Nested
		class test2_1 {
			@ParameterizedTest
			@ValueSource(doubles = { -5.1, 5.1 })
			void test2_1_1(double d) {
				assertTrue(range.contains(d));
			}
		}

		@Nested
		class test2_2 {
			@ParameterizedTest
			@ValueSource(doubles = { -5.2, 5.2 })
			void test2_2_1(double d) {
				assertFalse(range.contains(d));
			}
		}
	}

}
