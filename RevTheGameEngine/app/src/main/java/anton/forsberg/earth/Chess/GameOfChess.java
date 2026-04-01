package anton.forsberg.earth.Chess;

import android.content.Context;

import anton.forsberg.earth.Chess.Game.Logic.GameLogic;
import anton.forsberg.earth.Chess.Ui.UserInterface;
import anton.forsberg.earth.Interfaces.DeltaTimeListener;
import anton.forsberg.earth.Interfaces.DrawebleOrtographic;
import anton.forsberg.earth.Interfaces.DraweblePerspectiv;
import anton.forsberg.earth.UserInput.UiPressListener;
import anton.forsberg.earth.comobject.RotQ;


public class GameOfChess implements DraweblePerspectiv,UiPressListener,DeltaTimeListener,DrawebleOrtographic {

    private GameLogic gameLogic;
    private UserInterface ui;
    private Context mActivityContext;
    private boolean newGame;


    public GameOfChess(Context mActivityContext){
     this.mActivityContext=mActivityContext;

    }

    private void newGame_TwoPlayers(){
        newGameLogic();
    }

    public void draw(float [] mMVPMatrix,float [] mProjectionMatrix,float [] mViewMatrix,float [] mModelMatrix){
        RotQ.translateM(mModelMatrix,0, 0, 0f, -2.42f);

        if(newGame){
            newGame_TwoPlayers();
            newGame=false;
        }

          if(gameLogic==null) {newGameLogic();}

            gameLogic.draw(mMVPMatrix, mProjectionMatrix, mViewMatrix, mModelMatrix);

    }

    private void newGameLogic(){
        gameLogic =new GameLogic(mActivityContext);
        ui=new UserInterface(gameLogic,this,mActivityContext);
    }


    @Override
    public void press(float x, float y) {
        if(!ui.ButtonpressEvent(x, y)) {
            gameLogic.ButtonpressEvent(x, y);
        }
    }


    @Override
    public void deltaTimeUpdate(double dt) {

    }

    @Override
    public void drawO(float[] mMVPMatrix, float[] mProjectionMatrix, float[] mViewMatrix, float[] mModelMatrix) {
        if(ui==null) { ui=new UserInterface(gameLogic,this,mActivityContext);}
            ui.draw(mMVPMatrix, mProjectionMatrix, mViewMatrix, mModelMatrix);

    }

    public void newGame(){
     //   newGame=true;
        gameLogic.restartGame();
    }
}
