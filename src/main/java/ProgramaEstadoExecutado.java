public class ProgramaEstadoExecutado implements ProgramaEstado {
    private ProgramaEstadoExecutado() {};
    private static ProgramaEstadoExecutado instance = new ProgramaEstadoExecutado();
    public static ProgramaEstadoExecutado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Testagem";
    }
}
