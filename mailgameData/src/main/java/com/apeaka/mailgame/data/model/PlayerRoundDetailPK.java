package com.apeaka.mailgame.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlayerRoundDetailPK implements Serializable {

    private static final long serialVersionUID = -1616975066320552654L;

    @Column(name = "PLAYER_ID")
    private Long playerId;

    @Column(name = "ROUND_ID")
    private Long roundId;

    public PlayerRoundDetailPK() {

    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(final Long playerId) {
        this.playerId = playerId;
    }

    public Long getRoundId() {
        return roundId;
    }

    public void setRoundId(final Long roundId) {
        this.roundId = roundId;
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerRoundDetailPK)) {
            return false;
        }

        final PlayerRoundDetailPK castOther = (PlayerRoundDetailPK) other;

        return (this.playerId.equals(castOther.playerId)) && (this.roundId.equals(castOther.roundId));
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int hash = 17;

        hash = (hash * prime) + ((int) (this.playerId.longValue() ^ (this.playerId.longValue() >>> 32)));
        hash = (hash * prime) + ((int) (this.roundId.longValue() ^ (this.roundId.longValue() >>> 32)));

        return hash;
    }

}
