package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    //Test Case 1.1
    //Message is being taken in parameter
    //Throwing exception
    @Test
    public void givenMessage_Should_ReturnSad() throws MoodAnalyzerException {
       MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in a sad mood");
       String mood = moodAnalyzer.analyzeMood();
       Assert.assertEquals("SAD", mood);
    }

    //Test Case 1.1
    //Message is being taken in parameter
    @Test
    public void givenMessage_Should_ReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in a happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    //Given invalid message should return exception
    @Test
    public void invalidMood_Should_ReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            moodAnalyzer.analyzeMood();
        }catch(MoodAnalyzerException e){
            Assert.assertEquals("HAPPY",e.getMessage());
        }
    }
}

