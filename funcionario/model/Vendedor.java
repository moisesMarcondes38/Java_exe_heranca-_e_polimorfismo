package funcionario.model;

public class Vendedor extends Funcionario{

    private String codigoComissao;

    public Vendedor(int id, String nome, String celular, String cidade, String registro, String codigocomissao) {
        super(id, nome, celular, cidade, registro);

        this.codigoComissao = codigoComissao;
    }

    public String getCodigoComissao() {
        return codigoComissao;
    }

    public void setCodigoComissao(String codigoComissao) {
        this.codigoComissao = codigoComissao;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Codigo de Comissão: " + this.codigoComissao);

    }
}
