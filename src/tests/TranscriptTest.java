package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TranscriptTest {

    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        //TODO: write new values in testTranscript constructor

        // just to add the assertEquals framework
        assertEquals(5, 5);
    }

    @Test
    public void testTemplate(){
        //TODO: write tests for Transcript methods
    }
}
