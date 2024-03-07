package sk.wio.army;

import sk.wio.*;
import sk.wio.commands.*;

import java.util.*;

public class Army implements Attacking, Defending, Healthcare, DestructionOfInfrastructure {
    private final List<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }

    @Override
    public void attack() {
        System.out.println("\n\n--------- ATTACK ----------");
        for (Soldier soldier : soldiers) {
            if (soldier.getType().equals(SoldierType.OFFENSIVE)) {
                System.out.println(soldier + " deals " + soldier.getDamage() + " damage");
            }
        }
    }

    @Override
    public void devastatingAttack() {
        System.out.println("\n\n--- DEVASTATING ATTACK ----");
        for (Soldier soldier : soldiers) {
            if (soldier.getType().equals(SoldierType.OFFENSIVE) || soldier.getType().equals(SoldierType.ADAPTABLE)) {
                System.out.println(soldier + " deals " + soldier.getDamage() + " damage");
            }
        }
    }

    @Override
    public void defend() {
        System.out.println("\n\n--------- DEFEND ----------");
        for (Soldier soldier : soldiers) {
            if (soldier.getType().equals(SoldierType.DEFENSIVE) || soldier.getType().equals(SoldierType.ADAPTABLE)) {
                System.out.println(soldier + " deals " + soldier.getDamage() + " damage");
            }
        }
    }

    @Override
    public void recoverHealth() {
        System.out.println("\n\n---------- HEALTHCARE -----------");

        for (Soldier soldier : soldiers) {
            if (soldier.getType().equals(SoldierType.MEDIC)) {
                System.out.println(soldier + " provide health care");
            }
        }
    }

    @Override
    public void destroyInfrastructure() {
        System.out.println("\n\n------- DESTRUCTION OF INFRASTRUCTURE ------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof SpecialForce) {
                System.out.println(soldier + " deals " + soldier.getDamage() + " damage");
            }
        }
    }

    public void report() {
        System.out.println("------------ REPORT ------------");
        for (Soldier soldier : soldiers) {
            System.out.println("Soldier " + soldier.getName() + " here. Type " + soldier.getType());
        }
    }
}
