package com.monstercat.trivia_game.repos;

import com.monstercat.trivia_game.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
    Set<Category> findAll();
}
