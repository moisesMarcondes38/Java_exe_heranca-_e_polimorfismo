package funcionario;

import funcionario.model.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(123,"Joao","88899997777","Santos","34567");
        Funcionario f2 = new Funcionario(1324,"Maria","39997777","Sao paulo","32267");

        f1.visualizar();
        f2.visualizar();

    }
}
