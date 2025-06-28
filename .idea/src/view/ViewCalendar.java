package view;
import model.*;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Exemple d'utilització de la classe Menu.
 *
 */
public class ViewCalendar {
    private Calendar calendar;

    // Declarem les opcions per a referir-se a les opcions del menú.
    static private enum OpcionsMenuPrincipal {ADD_EMPLOYEE,
        MANAGE_SCHEDULE,
        CREATE_REPLACEMENT,
        SAVE_FILE,
        LOAD_FILE,
        EXIT};

    /*static enum OpcionsSubmenu1 {MENU_S1_OPCIO1,
        MENU_S1_OPCIO2,
        MENU_S1_SORTIR};

     */

    // Declarem descripcions personalitzades per a les opcions del menú principal
    static private String[] descMenuPrincipal={"Add employee",
            "Add holidays to employees",
            "Create replacement",
            "Save file",
            "Load file",
            "Exit"};

    // Declarem descripcions personalitzades per a les opcions del menú secundari
    //static private String[] descMenu2={""};

    public ViewCalendar() {
        this.calendar = new Calendar();
    }
    /**
     * Fitxer principal. Crea el menú principal i un menú secundari
     * @param args the command line arguments
     */

    /**
     * Menú principal del reproductor d'audio
     * @param sc Objecte de tipus Scanner que permet accedir al teclat
     */
    public void gestio(Scanner sc) {

        // Creem l'objecte per al menú. Li passem com a primer parà metre el nom del menú
        Menu<OpcionsMenuPrincipal> menu=new Menu<OpcionsMenuPrincipal>("Menu Principal",OpcionsMenuPrincipal.values());

        // Assignem la descripció de les opcions
        menu.setDescripcions(descMenuPrincipal);

        // Obtenim una opció des del menú i fem les accions pertinents
        OpcionsMenuPrincipal opcio = null;
        do {
            // Mostrem les opcions del menú
            menu.mostrarMenu();

            // Demanem una opcio
            opcio=menu.getOpcio(sc);

            switch(opcio) {
                case ADD_EMPLOYEE:

                    System.out.println("ADD_EMPLOYEE");
                    System.out.println("name,number of jutge");
                    calendar.addEmployee(sc.nextLine(),sc.nextInt(),0);
                    break;
                case MANAGE_SCHEDULE:
                    System.out.println("MANAGE_SCHEDULE");
                    calendar.showEmployes();
                    System.out.println("Especify the name of the employee the numb jutge and the day that is holiday for that person");
                    calendar.addHolidays(sc.nextLine(),sc.nextInt(),sc.nextInt());
                    break;
                case CREATE_REPLACEMENT:
                    System.out.println("CREATE_REPLACEMENT");
                    break;
                case SAVE_FILE:
                    System.out.println("SAVE_FILE");
                    try{
                        calendar.saveCalendar("Schedule.txt");
                    }catch(CalendarException e){
                        System.out.println(e);
                    }
                    break;
                case LOAD_FILE:
                    System.out.println("LOAD_FILE");
                    try {
                        calendar.loadCalendar("Schedule.txt");
                    }catch (CalendarException e){
                        System.out.println(e);
                    }
                    break;
                case EXIT:
                    System.out.println("EXIT");
                    break;
            }

        } while(opcio!=OpcionsMenuPrincipal.EXIT);
    }

    /**
     * Menú secundari
     * @param sc Objecte de tipus Scanner que permet accedir al teclat
     */
    /*
    private void gestioMenuSecundari(Scanner sc) {

        // Creem l'objecte per al menú. Li passem com a primer parÃ metre el nom del menú
        Menu<OpcionsSubmenu1> menu=new Menu<OpcionsSubmenu1>("Menu Secundari",OpcionsSubmenu1.values());

        // Assignem la descripció de les opcions
        menu.setDescripcions(descMenu2);

        // Obtenim una opció des del menú i fem les accions pertinents
        OpcionsSubmenu1 opcio = null;
        do {
            // Mostrem les opcions del menú
            menu.mostrarMenu();

            // Demanem una opcio
            opcio=menu.getOpcio(sc);

            // Fem les accions necessàries
            switch(opcio) {
                case MENU_S1_OPCIO1:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opciÃ³ 1");
                    break;
                case MENU_S1_OPCIO2:
                    // Mostrem un missatge indicant que s'ha triat aquesta opció
                    System.out.println("Has triat la opciÃ³ 2");
                    break;
                case MENU_S1_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while(opcio!=OpcionsSubmenu1.MENU_S1_SORTIR);
    }

     */

}
