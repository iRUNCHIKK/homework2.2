public class Main {
    public static void main(String[] args) {

        GryffindorStudent harryPotter = new GryffindorStudent("Harry Potter", 95, 89, 100, 100, 100);
        System.out.println(harryPotter);

        GryffindorStudent hermioneGranger = new GryffindorStudent("Hermione Granger", 9, 7, 5, 5, 6);
        System.out.println(hermioneGranger);

        harryPotter.compare(hermioneGranger);

        GryffindorStudent ronWeasley = new GryffindorStudent("Ron Weasley", 11, 3, 3, 6, 5);
        System.out.println(ronWeasley);

        RavenclawStudent marcusBelby = new RavenclawStudent("Marcus Belby", 12, 8, 70, 25, 29, 40);
        System.out.println(marcusBelby);

        marcusBelby.baseCompare(ronWeasley);
    }
}