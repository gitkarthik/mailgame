package com.apeaka.mailgame.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Round implements Serializable {

    private static final long serialVersionUID = -9127814065908572057L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @ManyToOne
    private Game game;

    @Column(name = "ROUND_NUMBER")
    private int roundNumber;

    @Column(name = "DEALER_SEAT_NUMBER")
    private int dealerSeatNumber;

    @Column(name = "PLAY_STARTER_SEAT_NUMBER")
    private int playStarterSeatNumber;

    public Round() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(final Game game) {
        this.game = game;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(final int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getDealerSeatNumber() {
        return dealerSeatNumber;
    }

    public void setDealerSeatNumber(final int dealerSeatNumber) {
        this.dealerSeatNumber = dealerSeatNumber;
    }

    public int getPlayStarterSeatNumber() {
        return playStarterSeatNumber;
    }

    public void setPlayStarterSeatNumber(final int playStarterSeatNumber) {
        this.playStarterSeatNumber = playStarterSeatNumber;
    }

}
