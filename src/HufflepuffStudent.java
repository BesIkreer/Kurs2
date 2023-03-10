public class HufflepuffStudent extends HogwartsStudent {
    private int industriousness;
    private int loyalty;
    private int honesty;
    private int allPoint;

    public HufflepuffStudent(String name,
         String lundName,
         int thePowerOfMagic,
         int transgressionDistance,
         int industriousness,
         int loyalty,
         int honesty) {
        super(name, lundName, thePowerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int getAllPoint() {
        allPoint = industriousness + loyalty + honesty;
        return allPoint;
    }
    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int allPoint1 = getAllPoint();
        int allPoint2 = hufflepuffStudent.getAllPoint();
        if (allPoint1 > allPoint2) {
            System.out.printf(
                    "Пуффендуйец %s %s лучше, чем пуффендуйец %s %s: %d VS %d%n",
                    getName(),
                    getLundName(),
                    hufflepuffStudent.getName(),
                    hufflepuffStudent.getLundName(),
                    getAllPoint(),
                    hufflepuffStudent.getAllPoint()
            );
        } else if (allPoint2 > allPoint1) {
            System.out.printf(
                    "Пуффендуйец %s %s лучше, чем пуффендуйец %s %s: %d VS %d%n",
                    hufflepuffStudent.getName(),
                    hufflepuffStudent.getLundName(),
                    getName(),
                    getLundName(),
                    hufflepuffStudent.getAllPoint(),
                    getAllPoint()
            );
        } else {
            System.out.printf(
                    "Пуффендуйец %s %s такой же, как и пуффендуйец %s %s: %d VS %d%n",
                    hufflepuffStudent.getName(),
                    hufflepuffStudent.getLundName(),
                    getName(),
                    getLundName(),
                    hufflepuffStudent.getAllPoint(),
                    getAllPoint()
            );
        }
    }
    @Override
    public String toString() {
        return  String.format("%s, трудолюбие %d, верность %d, чесность %d", super.toString(), industriousness, loyalty, honesty);
    }
}
