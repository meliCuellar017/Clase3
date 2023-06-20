package com.cuellar.melissa;

public class Ropero extends Subject{

    private String promo;

    public void addPromo(String link){

        this.promo = link;

        System.out.println("Nueva promo agregada");

        this.notifiy();
    }
    public String getPromo() {
        return promo;
    }
    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.promo));
    }

    public void removeByName(String name){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof  Cliente && ((Cliente) observer).getName().equals(name))
                .findFirst()
                .get());
    }
}
