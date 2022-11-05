package cliente;

import cliente.model.Cliente;
import cliente.model.PessoaFisica;
import cliente.model.PessoaJuridica;
import funcionario.model.Gerente;
import funcionario.model.Vendedor;
import games.model.Console;
import games.model.Jogo;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(123,"Moises","04397230","Sao paulo","32456798734");
        Cliente c2 = new Cliente(321,"Daniel","04397239","Santos","12456798734");

        PessoaFisica pf1 = new PessoaFisica(2,"Claudia","04567239","Campinas","3434267892","982630309");
        PessoaFisica pf2 = new PessoaFisica(3,"Claudio","04567339","Rio","7834267892","9826309032");

        PessoaJuridica pj1 = new PessoaJuridica(8,"Bruna","09876230","São Roque","32451967846","99.192.049/0001-50");
        PessoaJuridica pj2 = new PessoaJuridica(8,"Vanessa","04379000","Santana de Parnaiba","32451967846","99.187.069/0001-50");

        Gerente g1 = new Gerente(22,"Karina","99873465","Guarulhos","43",321);
        Vendedor v1 = new Vendedor(55,"Vitor","987654567","Brasilia","9999","213");

        Console c3 = new Console("Super Mario","Pokemon Go","Call of Duty Warzone","Fifa World Cup 23","Minecraft Starter Collection","Controle do nintendo 64");
        Jogo j4 = new Jogo("Mario smash bros","pokemon scarlet","call of duty vanguard","fifa mobile","minecraft earth","Metal Slug");

        c1.visualizar();
        c2.visualizar();

        pf1.visualizar();
        pf2.visualizar();

        pj1.visualizar();
        pj2.visualizar();

        g1.visualizar();
        v1.visualizar();

        c3.visualizar();
        j4.visualizar();
    }
}
