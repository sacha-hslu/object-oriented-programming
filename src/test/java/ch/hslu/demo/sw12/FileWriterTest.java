package ch.hslu.demo.sw12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileWriterTest {

    private FileWriter testee;

    @BeforeEach
    void setUp() {
        testee = new FileWriter();
    }

    @Test
    void readWrittenInt() throws IOException {
        int expectedInt = 9;
        testee.writeFileInt("./src/test/resources/tmp.txt", expectedInt);
        int resultInt = testee.readFileInt("./src/test/resources/tmp.txt");
        assertEquals(expectedInt, resultInt);
    }

    @Test
    void readDifferentDatatypes() throws IOException {
        int expectedInt = 9;
        float expectedFloat = 3f;
        testee.writeFileIntFloat("./src/test/resources/tmp.txt", expectedInt, expectedFloat);
        float resultFloat = testee.readFileIntFloat("./src/test/resources/tmp.txt");
        assertEquals(expectedFloat, resultFloat);
    }
}