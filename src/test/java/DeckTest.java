import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canPopulateDeckWithCards() {
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

}
