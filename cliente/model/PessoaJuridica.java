package cliente.model;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(int id, String nome, String cep, String cidade, String cpf, String cnpj) {
        super(id, nome, cep, cidade, cpf);

        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar(){
        super.visualizar();
            System.out.println("cnpj: " + this.cnpj);
    }
}
