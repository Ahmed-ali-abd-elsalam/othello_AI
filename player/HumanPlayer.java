package player;

import game.GamePlayer;

import java.awt.*;

public class HumanPlayer extends GamePlayer {
    private static int count=1;
    private int id;
    public HumanPlayer(int mark) {
        super(mark);
        this.id = count;
        count++;
    }

    @Override
    public boolean isUserPlayer() {
        return true;
    }

    @Override
    public String playerName() {
        return "User"+this.id ;
    }

    @Override
    public Point play(int[][] board) {
        return null;
    }

}
