import java.util.ArrayList;
import java.util.List;

public class Programa {
    private ProgramaEstado estado;
    private List<ProgramaEstado> memento = new ArrayList<ProgramaEstado>();
    private static final int LIMITE = 10;

    public ProgramaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ProgramaEstado estado) {
        if(LIMITE == this.memento.size()){
            this.memento.remove(0);
        }
        this.estado = estado;
        this.memento.add(this.estado);

    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ProgramaEstado> getEstados() {
        return this.memento;
    }
}
