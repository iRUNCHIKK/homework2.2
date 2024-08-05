public class HufflepuffStudent extends HogwartsStudent{

    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String name, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "HufflepuffStudent{" + "name=" + name +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int calculateAbilitiesSum() {
        return hardworking + loyal + honest;
    }

    public void compare(HufflepuffStudent student) {
        int sum1 = calculateAbilitiesSum();
        int sum2 = student.calculateAbilitiesSum();

        if (sum1 > sum2) {
            System.out.println(name + " лучший Пуффендуец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(student.name + " лучший Пуффендуец, чем " + name);
        } else {
            System.out.println(name + " одинаковые Пуффендуйцы с " + student.name);
        }
    }
}
