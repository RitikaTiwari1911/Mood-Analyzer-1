package com.bridgelabz;

public class MoodAnalyzer {

    private String message;
    // Refactor the code to take the mood message in the constructor
    public MoodAnalyzer(){
            this.message=message;
    }

    public MoodAnalyzer(String message){
        this.message=message;

    }

    public String analyzeMood(String message) throws MoodAnalyzerException {

        return analyzeMood();
    }

        public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e){
            throw new MoodAnalyzerException("Enter the correct value");

        }
    }
}
