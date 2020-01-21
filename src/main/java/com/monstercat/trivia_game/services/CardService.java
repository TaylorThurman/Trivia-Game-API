package com.monstercat.trivia_game.services;

import com.monstercat.trivia_game.model.Card;
import com.monstercat.trivia_game.model.Category;
import com.monstercat.trivia_game.repos.CardRepo;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CardService {

    CardRepo cardRepo;

    public CardService(CardRepo cardRepo) {
        this.cardRepo = cardRepo;
    }

    public Set<Card> findAllByCategory(String categoryName) {
        return cardRepo.findAllByCategory_CategoryName(categoryName);
    }

    public Card save(Card card) {
        return cardRepo.save(card);
    }
}
