import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProgramaTest {
    @Test
    void deveArmazenarEstados() {
        Programa programa = new Programa();
        programa.setEstado(ProgramaEstadoEmExecucao.getInstance());
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoEmEspera.getInstance());
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoEmEspera.getInstance());
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoEmEspera.getInstance());
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoEmEspera.getInstance());
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoExecutado.getInstance());

        assertEquals(10, programa.getEstados().size());
    }
    @Test
    void deveRetornarEstadoInicial() {
        Programa programa = new Programa();
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoEmEspera.getInstance());
        programa.setEstado(ProgramaEstadoEmExecucao.getInstance());
        programa.restauraEstado(0);
        assertEquals(ProgramaEstadoExecutado.getInstance(), programa.getEstado());
    }


    @Test
    void deveRetornarEstadoAnterior() {
        Programa programa = new Programa();
        programa.setEstado(ProgramaEstadoExecutado.getInstance());
        programa.setEstado(ProgramaEstadoEmEspera.getInstance());
        programa.setEstado(ProgramaEstadoEmExecucao.getInstance());
        programa.restauraEstado(2);
        assertEquals(ProgramaEstadoEmExecucao.getInstance(), programa.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Programa programa = new Programa();
            programa.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}