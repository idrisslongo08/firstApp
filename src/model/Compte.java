package model;

import java.util.Objects;

public class Compte {

    private int id;
    private  String Desc;
    private int numero;

    public Compte(int id, String desc, int numero) {
        this.id = id;
        Desc = desc;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", Desc='" + Desc + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compte compte)) return false;
        return id == compte.id && numero == compte.numero && Objects.equals(Desc, compte.Desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Desc, numero);
    }


}
