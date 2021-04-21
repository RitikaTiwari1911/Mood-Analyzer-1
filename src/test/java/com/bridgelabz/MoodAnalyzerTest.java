package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    //Test Case 1.1
    //Message is being taken in parameter
    @Test
    public void givenMessage_Should_ReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in a sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    //Test Case 1.2
    @Test
    public void givenMessage_Should_ReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }
}

