package Models;

import java.util.ArrayList;

public class Activity {

    private String name;
    private String descricao;
    private double activity_value;
    private int state;
    private boolean obligatory;
    private ArrayList<Skill> skill_point_gain;

    public Activity(String name, String descricao, double activity_value, int state, boolean obligatory, ArrayList<Skill> skill_point_gain) {
        this.name = name;
        this.descricao = descricao;
        this.activity_value = activity_value;
        this.state = state;
        this.obligatory = obligatory;
        this.skill_point_gain = skill_point_gain;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getActivity_value() {
        return activity_value;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Skill> getSkill_point_gain() {
        return skill_point_gain;
    }

    public void setSkill_point_gain(ArrayList<Skill> skill_point_gain) {
        this.skill_point_gain = skill_point_gain;
    }

    public void setActivity_value(double activity_value) {
        this.activity_value = activity_value;
    }

    @Override
    public String toString() {
        String text =  (state == 1 ) ? " Buffe de XP: " + Double.toString(activity_value) + " X" : " " + Double.toString(activity_value) + "XP";

        return name + " -  O que vai ganhar: " + text;
    }

    public int getState() {
        return state;
    }

}
