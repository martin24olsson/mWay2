import grammar.MwayBaseListener;

public class MwayCompiler extends MwayBaseListener {

    private StringBuilder out = new StringBuilder();

<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> parent of ecea7fb (update)
=======
>>>>>>> parent of ecea7fb (update)
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
