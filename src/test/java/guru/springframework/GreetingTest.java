package guru.springframework;

import org.junit.jupiter.api.Test;

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld("John"));
    }
}