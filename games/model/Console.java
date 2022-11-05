package games.model;

public class Console extends Games{

    private String joystick;

    public Console(String mario, String pokemon, String callofDuty, String fifa, String minecraft,String joystick) {
        super(mario, pokemon, callofDuty, fifa, minecraft);

        this.joystick = joystick;
    }

    public String getJoystick() {
        return joystick;
    }

    public void setJoystick(String joystick) {
        this.joystick = joystick;
    }

    public void visualizar() {
        super.visualizar();

        System.out.println("joystick: " + this.joystick);
    }
}
