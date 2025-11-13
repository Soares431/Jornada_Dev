package Models;

public class Activity {

    private String name;
    private int network;
    private double activity_value;
    private int state;
    private int obligatory;
    private String descricao;

    public Activity(String name, String descricao, double activity_value, int state, int obligatory) {
        this.name = name;
        this.descricao = descricao;
        this.activity_value = activity_value;
        this.state = state;
        this.obligatory = obligatory;
    }

    public Activity(String name, String descricao, double activity_value, int state,int obligatory ,int network) {
        this.name = name;
        this.network = network;
        this.activity_value = activity_value;
        this.state = state;
        this.descricao = descricao;
        this.obligatory = obligatory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetwork() {
        return network;
    }

    public void setNetwork(int network) {
        this.network = network;
    }

    public double getActivity_value() {
        return activity_value;
    }

    public void setActivity_value(double activity_value) {
        this.activity_value = activity_value;
    }

    @Override
    public String toString() {
        String text =  (state == 1 ) ? " Buffe de XP: " + Double.toString(activity_value) + " X" : " " + Double.toString(activity_value) + "XP";

        return name + text;
    }
}
