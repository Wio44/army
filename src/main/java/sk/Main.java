package sk;

import sk.wio.army.*;

public class Main {
    public static void main(String[] args) {
        Medic medic1 = new Medic("Medic 1", 1);
        Medic medic2 = new Medic("Medic 2", 1);

        Infantry infantry1 = new Infantry("Infantry 1", 3);
        Infantry infantry2 = new Infantry("Infantry 2", 3);
        Infantry infantry3 = new Infantry("Infantry 3", 3);

        Artillery artillery1 = new Artillery("Artillery 1", 4);
        Artillery artillery2 = new Artillery("Artillery 2", 4);

        Commando commando1 = new Commando("Commando 1", 5);
        Commando commando2 = new Commando("Commando 2", 5);
        Commando commando3 = new Commando("Commando 3", 5);

        SpecialForce specialForce1 = new SpecialForce("Special Force 1", 6);
        SpecialForce specialForce2 = new SpecialForce("Special Force 2", 6);
        SpecialForce specialForce3 = new SpecialForce("Special Force 3", 6);

        printReport(medic1, medic2, infantry1, infantry2, infantry3, artillery1, artillery2, commando1, commando2,
                commando3, specialForce1, specialForce2, specialForce3);


        System.out.println("\n--- DESTRUCTION OF INFRASTRUCTURE ---");
        specialForce1.attack();
        specialForce2.attack();
        specialForce3.attack();

        System.out.println("\n-------------- ATTACK --------------");
        artillery1.attack();
        artillery2.attack();

        commando1.attack();
        commando2.attack();
        commando3.attack();

        System.out.println("\n----------- HEALTHCARE -----------");
        medic1.recoverHealth();
        medic2.recoverHealth();

        System.out.println("\n------------- DEFEND --------------");
        artillery1.defend();
        artillery2.defend();
        infantry1.defend();
        infantry2.defend();
        infantry3.defend();

        System.out.println("\n-------- DEVASTATING ATTACK --------");
        artillery1.attack();
        artillery2.attack();

        commando1.attack();
        commando2.attack();
        commando3.attack();

        specialForce1.attack();
        specialForce2.attack();
        specialForce3.attack();
    }

    private static void printReport(Medic medic1, Medic medic2, Infantry infantry1, Infantry infantry2, Infantry infantry3,
                                    Artillery artillery1, Artillery artillery2, Commando commando1, Commando commando2,
                                    Commando commando3, SpecialForce specialForce1, SpecialForce specialForce2,
                                    SpecialForce specialForce3) {
        System.out.println("--------------- REPORT ---------------");
        medic1.report();
        medic2.report();

        infantry1.report();
        infantry2.report();
        infantry3.report();

        artillery1.report();
        artillery2.report();

        commando1.report();
        commando2.report();
        commando3.report();

        specialForce1.report();
        specialForce2.report();
        specialForce3.report();
    }
}