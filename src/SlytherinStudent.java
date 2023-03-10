public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private int allPoint;


    public SlytherinStudent(String name,
         String lundName,
         int thePowerOfMagic,
         int transgressionDistance,
         int cunning,
         int determination,
         int ambition,
         int resourcefulness,
         int lustForPower) {
        super(name, lundName, thePowerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int getAllPoint() {
        allPoint = cunning + determination + ambition + resourcefulness + lustForPower;
        return allPoint;
    }
    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int allPoint1 = getAllPoint();
        int allPoint2 = slytherinStudent.getAllPoint();
        if (allPoint1 > allPoint2) {
            System.out.printf(
                    "Слизеринец %s %s лучше, чем слизеринец %s %s: %d VS %d%n",
                    getName(),
                    getLundName(),
                    slytherinStudent.getName(),
                    slytherinStudent.getLundName(),
                    getAllPoint(),
                    slytherinStudent.getAllPoint()
            );
        } else if (allPoint2 > allPoint1) {
            System.out.printf(
                    "Слизеринец %s %s лучше, чем слизеринец %s %s: %d VS %d%n",
                    slytherinStudent.getName(),
                    slytherinStudent.getLundName(),
                    getName(),
                    getLundName(),
                    slytherinStudent.getAllPoint(),
                    getAllPoint()
            );
        } else {
            System.out.printf(
                    "Слизеринец %s %s такой же, как и слизеринец %s %s: %d VS %d%n",
                    slytherinStudent.getName(),
                    slytherinStudent.getLundName(),
                    getName(),
                    getLundName(),
                    slytherinStudent.getAllPoint(),
                    getAllPoint()
            );
        }
    }
    @Override
    public String toString() {
        return  String.format("%s, хитрость %d, решимость %d, амбициозность %d, находчивость %d, жажда власти %d", super.toString(), cunning, determination, ambition, resourcefulness, lustForPower);
    }
}
