package Moves.Swadloon;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class GrassWhistle extends StatusMove {
    public  GrassWhistle() {
        super(Type.GRASS, 0.0, 55.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "использует GrassWhistle";
    }
}
