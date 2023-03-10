import java.util.Random;

public class Main {
    public static int generateNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private static GryffindorStudent harry = new GryffindorStudent("Гарри", "Поттер", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static GryffindorStudent germiona = new GryffindorStudent("Гермиона", "Грейнджер", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static GryffindorStudent ron = new GryffindorStudent("Рон", "Уизли", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static HufflepuffStudent zahariya = new HufflepuffStudent("Захария", "Смит", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static HufflepuffStudent sedric = new HufflepuffStudent("Седрик", "Диггори", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static HufflepuffStudent jastin = new HufflepuffStudent("Джастин", "Финч-Флетчли", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static RavenclawStudent chjou = new RavenclawStudent("Чжоу", "Чанг", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static RavenclawStudent padma = new RavenclawStudent("Падма", "Патил", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static RavenclawStudent markus = new RavenclawStudent("Маркус", "Белби", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static SlytherinStudent drago = new SlytherinStudent("Драго", "Малфой", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static SlytherinStudent grehem = new SlytherinStudent("Грэхэм", "Монтегю", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());
    private static SlytherinStudent gregory = new SlytherinStudent("Грегори", "Гойл", generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber(), generateNumber());

    public static void main(String[] args) {
    harry.compareHogwarts(drago);
    ron.compareGryffindor(germiona);
    padma.print();
    grehem.compareSlytherin(gregory);
    }
}
