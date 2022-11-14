package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

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

	@ParameterizedTest
	@CsvSource({ "GlassFish, Oracle, true", "GlassFish, DB2, true", "GlassFish, PostgreSQL, true",
			"GlassFish, MySQL, true", "JBoss, Oracle, false", "JBoss, DB2, true", "JBoss, PostgreSQL, true",
			"JBoss, MySQL, false", "Tomcat, Oracle, false", "Tomcat, DB2, false", "Tomcat, PostgreSQL, false",
			"Tomcat, MySQL, true" })

	void test(ApplicationServer appServer, Database db, boolean answer) {
		assertEquals(answer, Frameworks.isSupport(appServer, db));
	}

}
