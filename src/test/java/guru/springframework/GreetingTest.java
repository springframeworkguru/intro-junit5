package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called Once!!!");
    }

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

    @Test
    void helloWorld2() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each........");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After!!! ***** - I am only called Once!!!");
    }
}