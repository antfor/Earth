package anton.forsberg.earth.Chess.Game.Logic.ListenerInterface;

import anton.forsberg.earth.Chess.Enums.ColorP;

/**
 * Created by Anton Forsberg on 2017-12-20.
 */

public interface LogicObserver {
    void gameVictory(ColorP colorP);
    void pawnUpgrade(ColorP colorP);

}
