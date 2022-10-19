package Moves.Sewaddle;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class StringShot extends StatusMove {

    public StringShot(double pow, double acc) {
        super(Type.BUG, pow, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -2);
    }


    @Override
    protected String describe() {
        return "использует StringShot";
    }
}
