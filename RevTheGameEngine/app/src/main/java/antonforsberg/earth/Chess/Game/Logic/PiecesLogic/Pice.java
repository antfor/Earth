package anton.forsberg.earth.Chess.Game.Logic.PiecesLogic;

import android.content.Context;
import android.graphics.Point;

import anton.forsberg.earth.Animations.IMatrixInterpolation;
import anton.forsberg.earth.Chess.ChessObjects.PiecesObject.PiceObject;
import anton.forsberg.earth.Chess.Enums.ColorP;
import anton.forsberg.earth.Chess.Enums.DeadorAlive;
import anton.forsberg.earth.Chess.Game.Logic.GameLogic;
import anton.forsberg.earth.GUI.Buttons.Button3D;
import anton.forsberg.earth.comobject.objectAssets.ObjectInterface.BasicObject;

import java.util.List;

public abstract class Pice implements IMatrixInterpolation{
    protected Point pos;
    private Point oldPos;
    final protected ColorP col;
    protected PiceObject model;
    protected Context context;


    public Pice(Context context,Point p, ColorP c) {
        col = c;
        pos = p;
        oldPos=new Point(pos);
        this.context=context;
        setModel();

    }

    public ColorP getColur() {
        return col;
    }


    public Point getPos() {
        return new Point(pos);
    }
    public Point getOldPos(){return new Point(oldPos);}

    public void Move(Point p) {
        model.startAnimating();
        oldPos=new Point(pos);
        pos = new Point(p);
    }



    public void draw(float[] mMVPMatrix, float[] mProjectionMatrix, float[] mViewMatrix, float[] mModelMatrix) {

        model.draw(mMVPMatrix, mProjectionMatrix, mViewMatrix, mModelMatrix);

    }

    public abstract List<Point> getPossibleMoves(Pice[][] board);

    protected abstract void setModel();

    public boolean interpoltate(){
       return model.interpoltate();
    }

}
