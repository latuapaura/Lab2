package Pokemons;

import Moves.Aerodactyl.DragonBreath;
import Moves.Aerodactyl.IronHead;
import Moves.Aerodactyl.TakeDown;
import Moves.Aerodactyl.WingAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Aerodactyl extends Pokemon {

    public  Aerodactyl(String name, int level) {

        super(name, level);

        super.setType(Type.ROCK, Type.FLYING);
        super.setStats(80, 105, 65, 60, 75, 130);

        TakeDown takeDown = new TakeDown(90,85);
        WingAttack wingAttack = new WingAttack(60, 100);
        DragonBreath dragonBreath = new DragonBreath(60, 100);
        IronHead ironHead = new IronHead(80, 100);

        super.setMove(takeDown, wingAttack, dragonBreath, ironHead);



    }

}
