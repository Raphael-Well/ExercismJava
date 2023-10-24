abstract class Fighter {

    boolean vulnerability = false;

    boolean isVulnerable() {
        return vulnerability;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }


}

class Wizard extends Fighter {

    boolean spellRead = false;

    @Override
    boolean isVulnerable() {
        if (!spellRead) {
            vulnerability = true;
        }
        return vulnerability;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return spellRead ? 12 : 3;
    }

    void prepareSpell() {
        spellRead = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
