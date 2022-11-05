package funcionario.model;

public class Funcionario {


    private int id;
    private  String nome ;
    private  String celular ;
    private  String cidade ;
    private  String registro ;

    public Funcionario(int id, String nome, String celular, String cidade, String registro) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.cidade = cidade;
        this.registro = registro;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void visualizar(){
        System.out.println("*************************");

        System.out.println("O seu ID " + this.id);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.nome);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.celular);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.cidade);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.registro);

    }
}
