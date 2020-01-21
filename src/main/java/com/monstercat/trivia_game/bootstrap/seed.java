package com.monstercat.trivia_game.bootstrap;

import com.monstercat.trivia_game.model.Card;
import com.monstercat.trivia_game.model.Category;
import com.monstercat.trivia_game.services.CardService;
import com.monstercat.trivia_game.services.CategoryService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class seed implements ApplicationRunner {

    CardService cardService;
    CategoryService categoryService;

    public seed(CardService cardService, CategoryService categoryService) {
        this.cardService = cardService;
        this.categoryService = categoryService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Category c1 = new Category("Spring");
        Category c2 = new Category("Java");
        Category c3 = new Category("Testing");
        Category c4 = new Category("Rest");
        Category c5 = new Category("Design Patterns");
        Category c6 = new Category("Mental Compilation");

        categoryService.save(c1);
        categoryService.save(c2);
        categoryService.save(c3);
        categoryService.save(c4);
        categoryService.save(c5);
        categoryService.save(c6);

        Card card1 = new Card("?", "Answer", 100, c1);
        Card card2 = new Card("?", "Answer", 100, c2);
        Card card3 = new Card("?", "Answer", 100, c3);
        Card card4 = new Card("?", "Answer", 100, c4);
        Card card5 = new Card("?", "Answer", 100, c5);
        Card card6 = new Card("?", "Answer", 100, c6);
        Card card7 = new Card("?", "Answer", 100, c1);
        Card card8 = new Card("?", "Answer", 100, c2);
        Card card9 = new Card("?", "Answer", 100, c3);
        Card card10 = new Card("?", "Answer", 100, c4);
        Card card11 = new Card("?", "Answer", 100, c5);
        Card card12 = new Card("?", "Answer", 100, c6);

        cardService.save(card1);
        cardService.save(card2);
        cardService.save(card3);
        cardService.save(card4);
        cardService.save(card5);
        cardService.save(card6);
        cardService.save(card7);
        cardService.save(card8);
        cardService.save(card9);
        cardService.save(card10);
        cardService.save(card11);
        cardService.save(card12);
    }
}
