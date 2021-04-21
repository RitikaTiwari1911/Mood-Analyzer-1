package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a sad message");
        Assert.assertEquals("HAPPY",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood= moodAnalyzer.analyzeMood("This is a Happy message");
        Assert.assertEquals("HAPPY",mood);
    }



}
