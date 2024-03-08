package sk.wio;

import sk.wio.army.*;
import sk.wio.army.adaptable.*;
import sk.wio.army.defensive.*;
import sk.wio.army.medic.*;
import sk.wio.army.offensive.*;

public class Main {
    public static void main(String[] args) {
        Medic medic1 = new Medic("Medic 1", 1, SoldierType.MEDIC);
        Medic medic2 = new Medic("Medic 2", 1, SoldierType.MEDIC);

        Infantry infantry1 = new Infantry("Infantry 1", 3, SoldierType.ADAPTABLE);
        Infantry infantry2 = new Infantry("Infantry 2", 3, SoldierType.ADAPTABLE);
        Infantry infantry3 = new Infantry("Infantry 3", 3, SoldierType.ADAPTABLE);

        Artillery artillery1 = new Artillery("Artillery 1", 4, SoldierType.DEFENSIVE);
        Artillery artillery2 = new Artillery("Artillery 2", 4, SoldierType.DEFENSIVE);

        Commando commando1 = new Commando("Commando 1", 5, SoldierType.OFFENSIVE);
        Commando commando2 = new Commando("Commando 2", 5, SoldierType.OFFENSIVE);
        Commando commando3 = new Commando("Commando 3", 5, SoldierType.OFFENSIVE);

        SpecialForce specialForce1 = new SpecialForce("Special Force 1", 6, SoldierType.OFFENSIVE);
        SpecialForce specialForce2 = new SpecialForce("Special Force 2", 6, SoldierType.OFFENSIVE);
        SpecialForce specialForce3 = new SpecialForce("Special Force 3", 6, SoldierType.OFFENSIVE);

        Army army = new Army();
        army.addSoldier(medic1);
        army.addSoldier(medic2);
        army.addSoldier(infantry1);
        army.addSoldier(infantry2);
        army.addSoldier(infantry3);
        army.addSoldier(artillery1);
        army.addSoldier(artillery2);
        army.addSoldier(commando1);
        army.addSoldier(commando2);
        army.addSoldier(commando3);
        army.addSoldier(specialForce1);
        army.addSoldier(specialForce2);
        army.addSoldier(specialForce3);

        army.report();

        army.destroyInfrastructure();

        army.attack();

        army.recoverHealth();

        army.defend();

        army.devastatingAttack();
    }
}