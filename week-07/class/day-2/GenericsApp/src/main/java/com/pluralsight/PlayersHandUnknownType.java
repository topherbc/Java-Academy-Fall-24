package com.pluralsight;

import java.util.List;

public class PlayersHandUnknownType {
    private List<? extends Card> cards;

    public PlayersHandUnknownType(List<? extends Card> initialCards) {
        this.cards = initialCards;
    }

    public List<? extends Card> getCards() {
        return cards;
    }

    public Card getCard(int index) {
        return this.cards.get(index);
    }
}
