package funcionario.model;

public class Gerente extends Funcionario{

    private int numeroSubordinados;

    public Gerente(int id, String nome, String celular, String cidade, String registro,int numeroSubordinados) {
        super(id, nome, celular, cidade, registro);

        this.numeroSubordinados = numeroSubordinados;
    }

    public int getNumeroSubordinados() {
        return numeroSubordinados;
    }

    public void setNumeroSubordinados(int numeroSubordinados) {
        this.numeroSubordinados = numeroSubordinados;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("numero de Subordinados: " + this.numeroSubordinados);

    }
}
