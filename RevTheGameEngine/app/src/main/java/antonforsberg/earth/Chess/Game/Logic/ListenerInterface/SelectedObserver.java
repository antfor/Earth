package anton.forsberg.earth.Chess.Game.Logic.ListenerInterface;

import anton.forsberg.earth.Chess.Buttons.SelectedButton;
import anton.forsberg.earth.Chess.Game.Logic.PiecesLogic.Pice;

/**
 * Created by Anton Forsberg on 2017-12-05.
 */

public interface SelectedObserver {
    void actOnSelectedButton(Pice p, SelectedButton selectedButton);
}
