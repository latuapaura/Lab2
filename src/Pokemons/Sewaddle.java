package Pokemons;

import Moves.Sewaddle.Confide;
import Moves.Sewaddle.StringShot;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sewaddle extends Pokemon {

    public Sewaddle(String name, int level) {

        super(name, level);

        super.setType(Type.BUG, Type.GRASS);
        super.setStats(45, 53, 70, 40, 60, 42);

        StringShot stringShot = new StringShot(0, 0);
        Confide confide = new Confide(0, 0);

        super.setMove(stringShot, confide);
    }
}
