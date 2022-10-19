package Moves.Aerodactyl;

import Additional.AddCustom;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class IronHead extends PhysicalMove {

    public IronHead(double pow, double acc) {
        super(Type.STEEL, 80, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (AddCustom.chance(0.3)) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует WingAttack";
    }
}
