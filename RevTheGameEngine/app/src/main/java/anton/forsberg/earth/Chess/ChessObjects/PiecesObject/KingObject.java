package anton.forsberg.earth.Chess.ChessObjects.PiecesObject;

import android.content.Context;
import android.opengl.Matrix;

import anton.forsberg.earth.Chess.Enums.ColorP;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Pice;
import anton.forsberg.earth.R;
import anton.forsberg.earth.comMesh.FinalMesh;
import anton.forsberg.earth.comobject.LoadObjectAssets;
import anton.forsberg.earth.comobject.objectAssets.ObjectInterface.BasicObject;

/**
 * Created by Anton Forsberg on 2017-12-05.
 */

public class KingObject  extends PiceObject {


    public KingObject(Context context, Pice pice) {
        super(context,pice);
    }


    @Override
    public void loadAssets() {
        LoadObjectAssets load = new LoadObjectAssets(mActivityContext);
        mesh.setNormals(load.LoadFloatArrayAsset(R.raw.kingnor, 8550));
        mesh.setVertices(load.LoadFloatArrayAsset(R.raw.kingver, 8550));

        // mesh.setTextureCoordinates(load.LoadFloatArrayAsset( R.raw.earthtexcord, 4428));
        // mesh.loadtexture(load.LoadImageAsset(R.drawable.earthglobe));

        float col = 1;
        if (p.getColur().equals(ColorP.Black)) {
            col = 0.3f;
        }
        float[] colurs = new float[11400];
        int n = 0;
        for (int i = 0; i < colurs.length; i++) {
            if (n == 0) {
                colurs[i] = col;
                n++;
            } else if (n == 1) {
                colurs[i] = col;
                n++;
            } else if (n == 2) {
                colurs[i] = col;
                n++;
            } else if (n == 3) {
                colurs[i] = 1.0f;
                n = 0;
            }

        }

        mesh.setColor(colurs);
        mesh.setShader("NorCol", "NorCol");
    }
}
