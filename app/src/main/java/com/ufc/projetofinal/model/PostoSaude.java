package com.ufc.projetofinal.model;

public class PostoSaude {
    private String name;
    private int id;
    private String coord;

    public PostoSaude(String name, int id, String coord) {
        this.name = name;
        this.id = id;
        this.coord = coord;
    }

    public PostoSaude(String name, String coord) {
        this.name = name;
        this.coord = coord;
    }

    public PostoSaude() {
    }

    @Override
    public String toString() {
        return "PostoSaude{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", coord='" + coord + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoord() {
        return coord;
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }
}
