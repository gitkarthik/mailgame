package com.apeaka.mailgame.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PlayerRoundDetail implements Serializable {

    private static final long serialVersionUID = -6309463765440528921L;

    @EmbeddedId
    private PlayerRoundDetailPK id;

    // bi-directional one-to-one association to Round
    @OneToOne
    @JoinColumn(insertable = false, updatable = false)
    private Round round;

    // bi-directional one-to-one association to Player
    @OneToOne
    @JoinColumn(insertable = false, updatable = false)
    private Player player;

    @Column(name = "SCORE")
    private int score;

    @Column(name = "CARD_1")
    private String card1;

    @Column(name = "CARD_2")
    private String card2;

    @Column(name = "CARD_3")
    private String card3;

    @Column(name = "CARD_4")
    private String card4;

    @Column(name = "CARD_5")
    private String card5;

    public PlayerRoundDetail() {

    }

    public PlayerRoundDetailPK getId() {
        return id;
    }

    public void setId(final PlayerRoundDetailPK id) {
        this.id = id;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(final Round round) {
        this.round = round;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(final Player player) {
        this.player = player;
    }

    public int getScore() {
        return score;
    }

    public void setScore(final int score) {
        this.score = score;
    }

    public String getCard1() {
        return card1;
    }

    public void setCard1(final String card1) {
        this.card1 = card1;
    }

    public String getCard2() {
        return card2;
    }

    public void setCard2(final String card2) {
        this.card2 = card2;
    }

    public String getCard3() {
        return card3;
    }

    public void setCard3(final String card3) {
        this.card3 = card3;
    }

    public String getCard4() {
        return card4;
    }

    public void setCard4(final String card4) {
        this.card4 = card4;
    }

    public String getCard5() {
        return card5;
    }

    public void setCard5(final String card5) {
        this.card5 = card5;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof PlayerRoundDetail)) {
            return false;
        }
        final PlayerRoundDetail other = (PlayerRoundDetail) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
