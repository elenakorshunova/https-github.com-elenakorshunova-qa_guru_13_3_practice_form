package docs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("======Something before all tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("======Something before each test");
    }

    @Test
    void firstTest() {
        System.out.println("======Started first test");
    }

    @Test
    void secondTest() {
        System.out.println("======Started second test");
        assertEquals(2, 3);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("======Something after all tests");
    }
}