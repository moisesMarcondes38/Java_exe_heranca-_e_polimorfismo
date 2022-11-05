package games.model;

public class Games {

    private String Mario;
    private  String Pokemon;
    private  String CallofDuty;
    private  String Fifa;
    private  String Minecraft;

    public Games(String mario, String pokemon, String callofDuty, String fifa, String minecraft) {
        Mario = mario;
        Pokemon = pokemon;
        CallofDuty = callofDuty;
        Fifa = fifa;
        Minecraft = minecraft;
    }

    public String getMario() {
        return Mario;
    }

    public void setMario(String mario) {
        Mario = mario;
    }

    public String getPokemon() {
        return Pokemon;
    }

    public void setPokemon(String pokemon) {
        Pokemon = pokemon;
    }

    public String getCallofDuty() {
        return CallofDuty;
    }

    public void setCallofDuty(String callofDuty) {
        CallofDuty = callofDuty;
    }

    public String getFifa() {
        return Fifa;
    }

    public void setFifa(String fifa) {
        Fifa = fifa;
    }

    public String getMinecraft() {
        return Minecraft;
    }

    public void setMinecraft(String minecraft) {
        Minecraft = minecraft;
    }

    public void visualizar(){
        System.out.println("*************************");

        System.out.println("O seu ID " + this.Mario);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.Pokemon);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.CallofDuty);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.Fifa);

        System.out.println("*************************");

        System.out.println("O seu ID " + this.Minecraft);

    }
}
