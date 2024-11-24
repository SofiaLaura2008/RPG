package Ficha;
import cadastroFichas.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Ocultista> ocultistas = new ArrayList<>();
        
        ocultistas.add(new Ocultista("Indiana Jones", 35, 10, 8, 15, 12, 14, 5, 80, 2, 50, 6, 3, 25, 50, 10));
        ocultistas.add(new Ocultista("John B", 50, 9, 7, 18, 10, 13, 6, 75, 3, 55, 7, 4, 70, 56, 20));
        ocultistas.add(new Ocultista("Alison", 40, 8, 6, 17, 11, 15, 4, 70, 1, 45, 5, 3, 48, 42, 89));
        ocultistas.add(new Ocultista("JJ Morgan", 30, 7, 5, 10, 12, 14, 5, 80, 5, 40, 4, 7, 56, 10, 45));

        System.out.println("Ocultistas");
        for (Ocultista ocultista : ocultistas) {
            ocultista.habilidades();
        }


        ArrayList<Combatente> combatentes = new ArrayList<>();

        combatentes.add(new Combatente("Ryan", 40, 15, 12, 8, 14, 10, 3, 60, 2, 100, 10, 5, 67, 47));
        combatentes.add(new Combatente("Ruina", 35, 14, 11, 9, 13, 9, 4, 65, 3, 95, 9, 4, 23, 4));
        combatentes.add(new Combatente("Charlotte", 38, 13, 10, 8, 12, 11, 5, 70, 2, 90, 8, 3, 34, 76));
        combatentes.add(new Combatente("Madison", 20, 13, 7, 9, 20, 13, 5, 89, 6, 29, 9, 2, 45, 56));

        System.out.println("Combatentes");
        for (Combatente combatente : combatentes) {
            combatente.habilidades();
        }


        ArrayList<Especialista> especialistas = new ArrayList<>();
        
        especialistas.add(new Especialista("Lauren", 28, 8, 12, 14, 10, 13, 3, 85, 3, 60, 8, 4, 52, 67, 70));
        especialistas.add(new Especialista("Valerio", 34, 9, 11, 16, 12, 12, 5, 90, 2, 65, 7, 4, 23, 12, 45));
        especialistas.add(new Especialista("Vênus", 30, 10, 10, 15, 11, 11, 4, 80, 1, 55, 6, 3, 43, 23, 13));
        especialistas.add(new Especialista("Apollo", 18, 10, 12, 11, 15, 11, 6, 70, 4, 45, 7, 3, 23, 46, 65));

        System.out.println("Especialistas");
        for (Especialista especialista : especialistas) {
            especialista.habilidades();
        }

        ArrayList<Pericias> pericias = new ArrayList<>();
        
        pericias.add(new Pericias("Investigator", 25, 7, 9, 18, 10, 15, 2, 95, 4, 70, 6, 4, 24, 5, 65, 32, 54, 24, 54, 56, 76, 13, 54, 2, 3, 43, 35, 54, 65));
        pericias.add(new Pericias("Sabotador", 29, 9, 10, 16, 9, 14, 5, 75, 3, 60, 5, 3, 5,4,12, 54, 48, 48,10, 44, 54, 12, 48, 51, 65, 98, 45, 32,54));
        pericias.add(new Pericias("Conhecimento", 32, 6, 8, 17, 11, 12, 3, 85, 2, 65, 7, 3, 48,87,45, 54, 40, 59, 40, 78, 65, 23,12, 45, 65,78, 98,56, 48));
        pericias.add(new Pericias("Técnicas", 21, 7, 10, 19, 15, 12, 9, 88, 1, 89, 8, 2, 45, 12, 65, 5,56, 45, 21, 35, 78, 12, 15, 10, 4, 6, 13, 78, 45));

        System.out.println("Perícias");
        for (Pericias pericia : pericias) {
            pericia.habilidades();
        }
    }
}
