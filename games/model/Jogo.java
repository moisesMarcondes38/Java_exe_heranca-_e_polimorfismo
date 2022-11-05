package games.model;

public class Jogo extends Games{

    private String jogoArcade;

    public Jogo(String mario, String pokemon, String callofDuty, String fifa, String minecraft, String jogoArcade) {
        super(mario, pokemon, callofDuty, fifa, minecraft);

        this.jogoArcade = jogoArcade;
    }

    public String getJogoArcade() {
        return jogoArcade;
    }

    public void setJogoArcade(String jogoArcade) {
        this.jogoArcade = jogoArcade;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("jogo de arcade: " + this.jogoArcade);


    }
}
