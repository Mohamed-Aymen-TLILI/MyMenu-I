package com.aymen;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix de Menu");
        System.out.println("1 - Poulet");
        System.out.println("2 - Beouf");
        System.out.println("3 - Végan");
        System.out.println("1 - Que souhaitez-vous comme menu ?");

    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        System.out.println("Vous avez choisi le menu " + nbMenu);

    }
}