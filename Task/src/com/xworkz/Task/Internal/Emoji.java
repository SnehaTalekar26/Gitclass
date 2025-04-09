package com.xworkz.Task.Internal;

public class Emoji {
    private String symbol;
    private String meaning;
    private boolean isAnimated;

    public Emoji(String symbol, String meaning, boolean isAnimated){
        this.symbol = symbol;
        this.meaning = meaning;
        this.isAnimated = isAnimated;
    }

    @Override
    public String toString(){
        return " Emoji: " + this.symbol + " ,Meaning: " + this.meaning + " ,Animated: " + this.isAnimated;
    }
}
