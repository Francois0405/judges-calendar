package view;

import java.util.Scanner;

public class InitializerCalendary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ViewCalendar menu = new ViewCalendar();
        menu.gestio(sc);
    }
}
