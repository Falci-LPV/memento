public class ProgramaEstadoEmEspera implements ProgramaEstado {
    private ProgramaEstadoEmEspera() {};
    private static ProgramaEstadoEmEspera instance = new ProgramaEstadoEmEspera();
    public static ProgramaEstadoEmEspera getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Fabricacao";
    }

}
