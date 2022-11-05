package cliente.model;

public class Cliente {

    private int id;
    private  String nome ;
    private  String cep ;
    private  String cidade ;
    private  String cpf ;

    public Cliente(int id, String nome, String cep, String cidade, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.cpf = cpf;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar(){

        String id = "";

        switch (this.id){
            case 1:
                id = "Pessoa Fisica";
                break;
            case 2:
                id = "Pessoa Juridica";
                break;
        }

        System.out.println("*************************");

        System.out.println("O seu ID " + this.id);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.nome);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.cep);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.cidade);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.cpf);

    }
}


