package com.apeaka.mailgame.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player implements Serializable {

    private static final long serialVersionUID = 6196210038321542768L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    private Game game;

    @Column(name = "SEATING_ORDER")
    private int seatingOrder;

    @Column(name = "SCORE")
    private int score;

    @Column(name = "ACTIVE")
    private Character active = 'Y';

    public Player() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(final Game game) {
        this.game = game;
    }

    public int getSeatingOrder() {
        return seatingOrder;
    }

    public void setSeatingOrder(final int seatingOrder) {
        this.seatingOrder = seatingOrder;
    }

    public int getScore() {
        return score;
    }

    public void setScore(final int score) {
        this.score = score;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(final Character active) {
        this.active = active;
    }

}
