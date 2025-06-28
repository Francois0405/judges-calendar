package view;

import java.util.Scanner;

public class InitializerCalendary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExampleMenu menu = new ExampleMenu();
        menu.gestio(sc);
    }
}
