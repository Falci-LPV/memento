public class ProgramaEstadoEmExecucao implements ProgramaEstado {
    private ProgramaEstadoEmExecucao() {};
    private static ProgramaEstadoEmExecucao instance = new ProgramaEstadoEmExecucao();
    public static ProgramaEstadoEmExecucao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Estoque";
    }
}
