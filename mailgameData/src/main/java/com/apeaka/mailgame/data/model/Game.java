package com.apeaka.mailgame.data.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Game implements Serializable {

    private static final long serialVersionUID = -6258459281399646954L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "DECK_COUNT")
    private int deckCount;

    @Column(name = "MAXIMUM_POINT")
    private int maximumPoint;

    @OneToMany(mappedBy = "game")
    private List<Player> players = new ArrayList<Player>();

    @OneToMany(mappedBy = "game")
    private List<Round> rounds = new ArrayList<Round>();

    public Game() {
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getDeckCount() {
        return deckCount;
    }

    public void setDeckCount(final int deckCount) {
        this.deckCount = deckCount;
    }

    public int getMaximumPoint() {
        return maximumPoint;
    }

    public void setMaximumPoint(final int maximumPoint) {
        this.maximumPoint = maximumPoint;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(final List<Player> players) {
        this.players = players;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(final List<Round> rounds) {
        this.rounds = rounds;
    }

    @Override
    public String toString() {
        return "[Game: " + this.id + "]" + " - [name: " + this.name + "]" + " - [deckCount: " + this.deckCount + "]"
                + " - [maxPoint: " + this.maximumPoint + "]";

    }

}
