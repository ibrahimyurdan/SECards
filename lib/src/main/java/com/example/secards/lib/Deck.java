package com.example.secards.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Flashcard> flashcards;

    public Deck(List<Flashcard> flashcards) {
        // Create a mutable copy of the input list
        this.flashcards = new ArrayList<>(flashcards);
    }

    public Flashcard top() {
        return flashcards.get(0);
    }

    public void forward() {
        Collections.rotate(flashcards, -1); // Move the first card to the back
    }

    public void backward() {
        Collections.rotate(flashcards, 1); // Move the last card to the front
    }

    public void shuffle() {
        Collections.shuffle(flashcards); // Shuffle the flashcards
    }
}
