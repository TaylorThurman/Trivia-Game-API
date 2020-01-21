package com.monstercat.trivia_game.rest;

import com.monstercat.trivia_game.model.Card;
import com.monstercat.trivia_game.services.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/cards")
@RestController
public class CardRestController {

    CardService cardService;

    public CardRestController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/")
    public ResponseEntity<Set<Card>> getAllCardsByCategory(@RequestParam String categoryName) {
        Set<Card> cardsByCategory = cardService.findAllByCategory(categoryName);
        return ResponseEntity.ok(cardsByCategory);
    }
}
