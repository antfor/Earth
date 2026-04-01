package anton.forsberg.earth. Chess.Player;

import android.content.Context;

import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Bishop;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.King;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Knight;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Pawns;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Queen;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Rook;
import anton.forsberg.earth.Chess.Enums.ColorP;


public class White extends Player{


    public White(Context context){
        super(ColorP.White);
        ColorP color=ColorP.White;
        pices.add(new Pawns(context,1,0, color));
        pices.add(new Pawns(context,1,1, color));
        pices.add(new Pawns(context,1,2, color));
        pices.add(new Pawns(context,1,3, color));
        pices.add(new Pawns(context,1,4, color));
        pices.add(new Pawns(context,1,5, color));
        pices.add(new Pawns(context,1,6, color));
        pices.add(new Pawns(context,1,7, color));

  /*
        pices.add(new Pawns(context,0,0, color));
        pices.add(new Pawns(context,0,1, color));
        pices.add(new Pawns(context,0,2, color));
        pices.add(new Pawns(context,0,4, color));
        pices.add(new Pawns(context,0,3, color));
        pices.add(new Pawns(context,0,5, color));
        pices.add(new Pawns(context,0,6, color));
        pices.add(new Pawns(context,0,7, color));
        */

        pices.add(new Rook(context,0,0, color));
        pices.add(new Knight(context,0,1, color));
        pices.add(new Bishop(context,0,2, color));
        pices.add(new King(context,0,4, color));
        pices.add(new Queen(context,0,3, color));
        pices.add(new Bishop(context,0,5, color));
        pices.add(new Knight(context,0,6, color));
        pices.add(new Rook(context,0,7, color));

    }




}
