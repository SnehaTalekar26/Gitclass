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
    @Override
    public int hashCode(){
        return 64;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Emoji){
            Emoji emoji1=this;
            Emoji emoji2=(Emoji) obj;
            if(emoji1.symbol==emoji1.symbol && emoji2.meaning==emoji2.meaning){
                return true;
            }
        }
        return false;
    }
}
