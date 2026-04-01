package anton.forsberg.earth.Chess.Ui;

import android.content.Context;

import anton.forsberg.earth.GUI.Buttons.Button2D;
import anton.forsberg.earth.Interfaces.Desplay;

/**
 * Created by Anton Forsberg on 2017-12-19.
 */

public class optionback extends Button2D implements Desplay {

    private boolean displaying;

    public optionback(Context mActivityContext) {
        super(mActivityContext);
        loadAssets();
        viewUpdate();
    }

    private void loadAssets(){
        setButtonColor(0.2f,0.2f,0.2f,0.8f,colurs);
        mesh.setColor(colurs);
        mesh.setShader("button","opace");
    }

    @Override
    public void viewUpdate() {
        button2dPrecentage(0,0,0,0,1,1,5);
    }

    @Override
    public void function() {

    }
}
