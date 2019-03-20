package com.example.recyclerview.animals;

public class Elephant extends GeneralAnimals {
    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    @Override
    String voice() {
        setVoice("FFFFFFFFFFFfffffff");
        return voice;
    }
}
