public class GryffindorStudent extends HogwartsStudent{

    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudent(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GryffindorStudent{" + "name=" + name +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int calculateAbilitiesSum() {
        return nobility + honor + courage;
    }

    public void compare(GryffindorStudent student) {
        int sum1 = calculateAbilitiesSum();
        int sum2 = student.calculateAbilitiesSum();

        if (sum1 > sum2) {
            System.out.println(name + " лучший Гриффиндорец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(student.name + " лучший Гриффиндорец, чем " + name);
        } else {
            System.out.println(name + " одинаковые Гриффиндорцы с " + student.name);
        }
    }
}
