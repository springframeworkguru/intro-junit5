package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");

        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld("John"));
    }
}