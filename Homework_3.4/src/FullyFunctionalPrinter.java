public class FullyFunctionalPrinter implements MultifunctionalPrinter {
    @Override
    public void fax() {
        System.out.println("Sending fax...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }
}