package Class87;

public class PrimeMinister {
    private static PrimeMinister pm;

    private PrimeMinister() {

    }

    public static PrimeMinister getObject() {
        if (pm != null) {
            return pm;
        }
        pm = new PrimeMinister();
        return pm;
    }
}
