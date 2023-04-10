public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Carie", 16, 90, 80, 40, 50);
        Fighter f2 = new Fighter("Ellen", 18, 70, 85, 30, 50);
        Match match = new Match(f1, f2, 80, 110);
        match.run();
    }
}