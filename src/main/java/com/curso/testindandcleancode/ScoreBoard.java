package com.curso.testindandcleancode;

public class ScoreBoard {

    private Integer tie;
    private Integer wins;
    private Integer losses;

    public ScoreBoard() {
        this.tie = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public Integer getTie() {
        return tie;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void incrementsTie(){
        tie ++;
    }

    public void incrementsWins(){
        wins ++;
    }

    public void incrementsLosses(){
        losses ++;
    }

}
