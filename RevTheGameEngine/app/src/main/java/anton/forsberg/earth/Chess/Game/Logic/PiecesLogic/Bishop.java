package anton.forsberg.earth.Chess.Game.Logic.PiecesLogic;

import android.content.Context;
import android.graphics.Point;

import anton.forsberg.earth.Chess.ChessObjects.PiecesObject.BishopObject;
import anton.forsberg.earth.Chess.ChessObjects.PiecesObject.PawnObject;
import anton.forsberg.earth.Chess.Enums.ColorP;
import anton.forsberg.earth.Chess.Game.Logic.GameLogic;


import java.util.ArrayList;
import java.util.List;

public class Bishop extends Pice {

    public Bishop(Context context, int x, int y, ColorP c) {
        super(context, new Point(x, y), c);
    }

    @Override
    public List<Point> getPossibleMoves(Pice[][] board) {
        List<Point> moves = new ArrayList<>(15);
        int i = 1;
        int len = board.length;
        int x = pos.x;
        int y = pos.y;
        while (x + i < len && y + i < len) {
            if (board[x+i][y+i]==null) {
                moves.add(new Point(x + i, y + i));
            } else if (!board[x+i][y+i].getColur().equals(col)) {
                moves.add(new Point(x + i, y + i));
                break;
            } else {
                break;
            }
            i++;
        }
        i=1;
        while (x - i > -1 && y - i > -1) {
            if (board[x-i][y-i]==null) {
                moves.add(new Point(x - i, y - i));
            } else if (!board[x-i][y-i].getColur().equals(col)) {
                moves.add(new Point(x - i, y - i));
                break;
            } else {
                break;
            }
            i++;
        }

        i=1;
        while (x + i < len && y - i > -1) {
            if (board[x+i][y-i]==null) {
                moves.add(new Point(x + i, y - i));
            } else if (!board[x+i][y-i].getColur().equals(col)) {
                moves.add(new Point(x + i, y - i));
                break;
            } else {
                break;
            }
            i++;
        }

        i=1;
        while (x - i > -1 && y + i < len) {
            if (board[x-i][y+i]==null) {
                moves.add(new Point(x - i, y + i));
            } else if (!board[x-i][y+i].getColur().equals(col)) {
                moves.add(new Point(x - i, y + i));
                break;
            } else {
                break;
            }
            i++;
        }

        return moves;
    }

    @Override
    protected void setModel() {
        model=new BishopObject(context,this);
    }
}
