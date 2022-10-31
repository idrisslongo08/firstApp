package model;

public class Requisition {
    private String name;
    private int code;
    private  int valMonnaie;
    private  int taux;

    private Compte compte;


    public Requisition(){
        this.name="idriss";
        this.code=560;
        this.taux=45;
        this.valMonnaie=45000;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getValMonnaie() {
        return valMonnaie;
    }

    public int getTaux() {
        return taux;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setValMonnaie(int valMonnaie) {
        this.valMonnaie = valMonnaie;
    }

    public void setTaux(int taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Requisition{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", valMonnaie=" + valMonnaie +
                ", taux=" + taux +
                '}';
    }
}
