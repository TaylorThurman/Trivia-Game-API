package com.monstercat.trivia_game.services;

import com.monstercat.trivia_game.model.Category;
import com.monstercat.trivia_game.repos.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategoryService {

    CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    public Set<Category> listAllCategories() {
        return categoryRepo.findAll();
    }
}
