package com.cuellar.melissa;

public class Cliente implements Observer{

    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    @Override
    public void update(String param) {
        System.out.println(name + ": en el ropero de Meli tenemos una nueva promoción" +
                " que te puede interesar, te esperamos aquí: " + param);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                '}';
    }
}
