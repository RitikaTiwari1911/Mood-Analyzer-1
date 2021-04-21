package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    //Test Case 1.1
    @Test
    public void givenMessage_Should_ReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in a sad mood");
        Assert.assertEquals("SAD", mood);
    }
}

