package guru.springframework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    private Greating greeting;
    @BeforeAll
    public static void beforeClass(){
        System.out.println("before class");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before each");
        greeting=new Greating();
    }

    @Test
    void helloWorld() {
        System.out.println("test 1");
    }

    @Test
    void testHelloWorld() {
        System.out.println("test 2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @BeforeAll
    public static void beforeClass(){
        System.out.println("before class");
    }

}