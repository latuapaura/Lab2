package Moves.Aerodactyl;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WingAttack extends PhysicalMove {

    public WingAttack(double pow, double acc) {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 0);
    }


    @Override
    protected String describe() {
        return "использует WingAttack";
    }
}
