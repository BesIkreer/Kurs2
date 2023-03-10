import java.util.Random;

public abstract class HogwartsStudent {
    private String name;
    private String lundName;
    private int thePowerOfMagic;
    private int transgressionDistance;
    private int spellPower;

    public HogwartsStudent(String name, String lundName, int thePowerOfMagic, int transgressionDistance) {
        this.name = name;
        this.lundName = lundName;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }

    public String getLundName() {
        return lundName;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLundName(String lundName) {
        this.lundName = lundName;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int getSpellPower() {
        spellPower = thePowerOfMagic + transgressionDistance;
        return spellPower;
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int spellPower1 = getSpellPower();
        int spellPower2 = hogwartsStudent.getSpellPower();
        if (spellPower1 > spellPower2) {
            System.out.printf(
                    "Студент %s%s лучше, чем студент %s%s: %d VS %d%n",
                    getName(),
                    getLundName(),
                    hogwartsStudent.getName(),
                    hogwartsStudent.getLundName(),
                    getSpellPower(),
                    hogwartsStudent.getSpellPower()
            );
        } else if (spellPower2 > spellPower1) {
            System.out.printf(
                    "Студент %s%s лучше, чем студент %s%s: %d VS %d%n",
                    hogwartsStudent.getName(),
                    hogwartsStudent.getLundName(),
                    getName(),
                    getLundName(),
                    hogwartsStudent.getSpellPower(),
                    getSpellPower()
            );
        } else {
            System.out.printf(
                    "Студент %s%s такой же, как и студент %s%s: %d VS %d%n",
                    hogwartsStudent.getName(),
                    hogwartsStudent.getLundName(),
                    getName(),
                    getLundName(),
                    hogwartsStudent.getSpellPower(),
                    getSpellPower()
            );
        }
    }

    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return String.format("Студент %s %s, сила магии %d, расстояние трансгрессии %d",name, lundName, thePowerOfMagic, transgressionDistance ) ;
    }
}
