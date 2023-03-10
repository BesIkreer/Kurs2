public class RavenclawStudent extends HogwartsStudent {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    private int allPoint;

    public RavenclawStudent(String name,
         String lundName,
         int thePowerOfMagic,
         int transgressionDistance,
         int mind,
         int wisdom,
         int wit,
         int creation) {
        super(name, lundName, thePowerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    private int getAllPoint() {
        allPoint = mind + wisdom + wit + creation;
        return allPoint;
    }

    public void compareRavenclaw(RavenclawStudent ravenclawStudent) {
        int allPoint1 = getAllPoint();
        int allPoint2 = ravenclawStudent.getAllPoint();
        if (allPoint1 > allPoint2) {
            System.out.printf(
                    "Когтевранец %s %s лучше, чем когтевранец %s %s: %d VS %d%n",
                    getName(),
                    getLundName(),
                    ravenclawStudent.getName(),
                    ravenclawStudent.getLundName(),
                    getAllPoint(),
                    ravenclawStudent.getAllPoint()
            );
        } else if (allPoint2 > allPoint1) {
            System.out.printf(
                    "Когтевранец %s %s лучше, чем когтевранец %s %s: %d VS %d%n",
                    ravenclawStudent.getName(),
                    ravenclawStudent.getLundName(),
                    getName(),
                    getLundName(),
                    ravenclawStudent.getAllPoint(),
                    getAllPoint()
            );
        } else {
            System.out.printf(
                    "Когтевранец %s %s такой же, как и когтевранец %s %s: %d VS %d%n",
                    ravenclawStudent.getName(),
                    ravenclawStudent.getLundName(),
                    getName(),
                    getLundName(),
                    ravenclawStudent.getAllPoint(),
                    getAllPoint()
            );
        }
    }
    @Override
        public String toString() {
            return  String.format("%s, ум %d, мудрость %d, остроумие %d, творчество %d", super.toString(), mind, wisdom, wit, creation);
        }
}
