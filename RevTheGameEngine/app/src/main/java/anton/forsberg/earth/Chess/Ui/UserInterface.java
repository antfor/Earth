package anton.forsberg.earth.Chess.Ui;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import anton.forsberg.earth.Chess.Enums.ColorP;
import anton.forsberg.earth.Chess.Game.Logic.GameLogic;
import anton.forsberg.earth.Chess.Game.Logic.ListenerInterface.LogicObserver;
import anton.forsberg.earth.Chess.GameOfChess;
import anton.forsberg.earth.GUI.Buttons.Button3D;

/**
 * Created by Anton Forsberg on 2017-12-19.
 */

public class UserInterface implements LogicObserver{

    private Context mActivityContext;
    private List<Button3D> buttons= new ArrayList<>(5);
    private  OptionButton optionButton;

    public UserInterface(GameLogic logic, GameOfChess gameOfChess, Context  context){
        mActivityContext=context;
        logic.setLogicObserver(this);
         optionButton=new OptionButton(context);
        optionButton.addButton(new replayButton(gameOfChess,context));
        addButton(optionButton);

    }

    private void addButton(Button3D b){
        buttons.add(b);
    }

    public void draw(float[] mMVPMatrix, float[] mProjectionMatrix, float[] mViewMatrix, float[] mModelMatrix) {
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).draw(mMVPMatrix, mProjectionMatrix, mViewMatrix, mModelMatrix);
        }
    }

    public boolean ButtonpressEvent(float x,float y){
        for (int i = 0; i <buttons.size() ; i++) {
            if(buttons.get(i).isPressed(x,y)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void gameVictory(ColorP colorP) {
        optionButton.setVictory();
    }

    @Override
    public void pawnUpgrade(ColorP colorP) {

    }
}
