
package cliente.model;

public class PessoaFisica extends Cliente{

    private String celular;
    public PessoaFisica(int id, String nome, String cep, String cidade, String cpf,String celular) {
        super(id, nome, cep, cidade, cpf);

        this.celular = celular;


    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("celular: " + this.celular);
    }
}
