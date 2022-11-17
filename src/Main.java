public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("M.Ali", 10, 100, 85, 50);
        Fighter f2 = new Fighter("M.Tyson", 20, 100, 95, 25);

        Match m1 = new Match(f1, f2, 85, 100);
        m1.run();

    }
}