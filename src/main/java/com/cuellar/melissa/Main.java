package com.cuellar.melissa;

import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Ropero ropero = new Ropero();

        executeGame(ropero);


    }

    private static void executeGame(Ropero ropero) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- suscribir cliente\n" +
                "2- desuscribir cliente \n" +
                "3- publicar promo\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Subscribir cliente");
                System.out.println("Ingresa el nombre del cliente: ");
                String nameToBeAdded = sc2.nextLine();

                Cliente cliente = new Cliente(nameToBeAdded);
                ropero.addObserver(cliente);

                System.out.println("Cliente suscrito a el ropero de Meli");
                executeGame(ropero);
                break;

            case 2:
                ropero.getObservers().forEach(System.out::println);

                System.out.println("Desuscribir cliente");
                System.out.println("Ingresa el nombre del cliente: ");
                String nameToBeRemoved = sc2.nextLine();

                ropero.removeByName(nameToBeRemoved);
                System.out.println("Cliente desuscrito, te extrañaremos");
                executeGame(ropero);
                break;

            case 3:
                System.out.println("Publicar nueva promo");
                String link = sc2.nextLine();
                ropero.addPromo(link);
                executeGame(ropero);
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}
