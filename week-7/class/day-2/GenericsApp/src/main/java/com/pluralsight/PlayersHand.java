package com.pluralsight;

import java.util.List;

public class PlayersHand<C extends Card> {
    private List<C> cards;

    public PlayersHand(List<C> initialCards) {
        this.cards = initialCards;
    }

    public List<C> getCards() {
        return cards;
    }

    public C getCard(int index) {
        return this.cards.get(index);
    }
}
