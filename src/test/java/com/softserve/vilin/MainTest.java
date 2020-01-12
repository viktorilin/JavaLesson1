package com.softserve.vilin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MainTest {

    private final Envelope firstEnvelope;
    private final Envelope secondEnvelope;
    private final boolean expected;

    public MainTest(Envelope firstEnvelope, Envelope secondEnvelope, boolean expected) {
        this.firstEnvelope = firstEnvelope;
        this.secondEnvelope = secondEnvelope;
        this.expected = expected;
    }

    @Test
    public void canIncludeOneEnvelopeInTheOtherTest() {
        Assert.assertEquals(Main.canIncludeOneEnvelopeInTheOther(firstEnvelope, secondEnvelope), expected);
    }

    @Parameterized.Parameters(name = "{index}: Test with first envelope={0}, second envelope={1}, result is: {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Envelope(5.5, 6.5), new Envelope(6.5, 7.5), true},
                {new Envelope(5.5, 6.5), new Envelope(4.5, 7.5), false},
                {new Envelope(5.5, 6.5), new Envelope(4.5, 5.5), true},
                {new Envelope(7.5, 8.5), new Envelope(9.5, 5.5), false},
        });
    }
}