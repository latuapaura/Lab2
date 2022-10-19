package Pokemons;

import Moves.Drilbur.RockTomb;
import Moves.Drilbur.SwordsDance;
import Moves.Drilbur.X_Scissor;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Drilbur extends Pokemon {

    public Drilbur(String name, int level) {

        super(name, level);

        super.setType(Type.GROUND);
        super.setStats(60, 85, 40, 30, 45, 68);
        RockTomb rockTomb = new RockTomb(60, 95);
        X_Scissor x_scissor = new X_Scissor(80, 100);
        SwordsDance swordsDance = new SwordsDance(0, 0);

        super.setMove(rockTomb, x_scissor, swordsDance);
    }
}