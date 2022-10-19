package Moves.Aerodactyl;

import Additional.AddCustom;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonBreath extends SpecialMove {

    public DragonBreath(double pow, double acc) {
        super(Type.DRAGON, 60, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (AddCustom.chance(0.3)) {
            Effect.paralyze(p);
        }
    }



    @Override
    protected String describe() {
        return "использует WingAttack";
    }

}
