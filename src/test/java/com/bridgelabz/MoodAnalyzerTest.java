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

    //Test Case 1.2
    @Test
    public void givenMessage_Should_ReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
}

