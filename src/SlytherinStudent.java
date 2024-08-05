public class SlytherinStudent extends HogwartsStudent{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
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

    @java.lang.Override
    public java.lang.String toString() {
        return "SlytherinStudent{" + "name=" + name +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int calculateAbilitiesSum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compare(SlytherinStudent student) {
        int sum1 = calculateAbilitiesSum();
        int sum2 = student.calculateAbilitiesSum();

        if (sum1 > sum2) {
            System.out.println(name + " лучший Слизеринец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(student.name + " лучший Слизеринец, чем " + name);
        } else {
            System.out.println(name + " одинаковые Слизеринцы с " + student.name);
        }
    }
}