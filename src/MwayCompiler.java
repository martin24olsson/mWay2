import grammar.MwayBaseListener;

public class MwayCompiler extends MwayBaseListener {

    private StringBuilder out = new StringBuilder();

    // Skriv endast över de metoder som du verkligen behöver här

    /**
     * Hämtar den kompilerade stackmaskinkoden.
     *
     * @return Kompilerad kod.
     */
    public String getCompiledCode() {
        return out.toString();
    }
}