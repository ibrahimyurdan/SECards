package com.example.secards.lib;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

public class DeckTest {

    @Test
    public void top() {
        var deck = new Deck(List.of(
                new Flashcard("A", "1"),
                new Flashcard("B", "2"),
                new Flashcard("C", "3")));
        var expected = new Flashcard("A", "1");
        var actual = deck.top();
        assertEquals(expected, actual);
    }

    @Test
    public void forward() {
        var deck = new Deck(List.of(
                new Flashcard("A", "1"),
                new Flashcard("B", "2"),
                new Flashcard("C", "3")
        ));

        deck.forward(); // Rotate forward
        var expected = new Flashcard("B", "2"); // After rotation, "B" should be on top
        assertEquals(expected, deck.top());
    }

    @Test
    public void backward() {
        var deck = new Deck(List.of(
                new Flashcard("A", "1"),
                new Flashcard("B", "2"),
                new Flashcard("C", "3")
        ));

        deck.backward(); // Rotate backward
        var expected = new Flashcard("C", "3"); // After rotation, "C" should be on top
        assertEquals(expected, deck.top());
    }

    @Test
    public void shuffle() {
    }
}