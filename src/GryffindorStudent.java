public class GryffindorStudent extends HogwartsStudent {

private int nobility;
private int honor;
private int bravery;
private int allPoint;

    public GryffindorStudent(String name,
        String lundName,
        int thePowerOfMagic,
        int transgressionDistance,
        int nobility,
        int honor,
        int bravery) {
       super(name, lundName, thePowerOfMagic, transgressionDistance);
       this.nobility = nobility;
       this.honor = honor;
       this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int getAllPoint() {
        allPoint = nobility + honor + bravery;
        return allPoint;
    }
    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        int allPoint1 = getAllPoint();
        int allPoint2 = gryffindorStudent.getAllPoint();
        if (allPoint1 > allPoint2) {
            System.out.printf(
                    "Гриффиндорец %s %s лучше, чем гриффиндорец %s %s: %d VS %d%n",
                    getName(),
                    getLundName(),
                    gryffindorStudent.getName(),
                    gryffindorStudent.getLundName(),
                    getAllPoint(),
                    gryffindorStudent.getAllPoint()
            );
        } else if (allPoint2 > allPoint1) {
            System.out.printf(
                    "Гриффиндорец %s %s лучше, чем гриффиндорец %s %s: %d VS %d%n",
                    gryffindorStudent.getName(),
                    gryffindorStudent.getLundName(),
                    getName(),
                    getLundName(),
                    gryffindorStudent.getAllPoint(),
                    getAllPoint()
            );
        } else {
            System.out.printf(
                    "Гриффиндорец %s %s такой же, как и гриффиндорец %s %s: %d VS %d%n",
                    gryffindorStudent.getName(),
                    gryffindorStudent.getLundName(),
                    getName(),
                    getLundName(),
                    gryffindorStudent.getAllPoint(),
                    getAllPoint()
            );
        }
    }

    @Override
    public String toString() {
        return  String.format("%s, благородство %d, честь %d, храбрость %d", super.toString(), nobility, honor, bravery);
    }


}
