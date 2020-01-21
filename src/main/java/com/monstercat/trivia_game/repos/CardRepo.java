package com.monstercat.trivia_game.repos;

import com.monstercat.trivia_game.model.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CardRepo extends CrudRepository<Card, Integer> {
    Set<Card> findAllByCategory_CategoryName(String categoryName);
}
