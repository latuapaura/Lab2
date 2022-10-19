package Moves.Excadrill;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SmartStrike extends PhysicalMove {

    public SmartStrike() {
        super(Type.STEEL, 70, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }



    @Override
    protected String describe() {
        return "использует SmartStrike";
    }
}
