package com.monstercat.trivia_game.model;

import javax.persistence.*;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    private String answer;
    private int points;
    @ManyToOne
    private Category category;

    public Card() {}

    public Card(String question, String answer, int points, Category category) {
        this.question = question;
        this.answer = answer;
        this.points = points;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", points=" + points +
                ", category=" + category +
                '}';
    }
}
