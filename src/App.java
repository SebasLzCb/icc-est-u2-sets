import java.util.Set;

import controller.Sets;

public class App {
    public static void main(String[] args) {
        Sets sets = new Sets();
        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorInvertido(sets);
    }

    private static void runHashSet(Sets sets) {
        System.out.println("HashSet:");
        sets.construirHashSet();
        for (String palabra : sets.construirHashSet()) {
            System.out.println(palabra);
        }
    }

    private static void runLinkedHashSet(Sets sets) {
        System.out.println("LinkedHashSet:");
        sets.construirLinkedHashSet();
        for (String palabra : sets.construirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }

    private static void runTreeSet(Sets sets) {
        System.out.println("TreeSet:"); 
        sets.construirTreeSet();
        for (String palabra : sets.construirTreeSet()) {
            System.out.println(palabra);
        }
    }

    private static void runTreeSetConComparador(Sets sets) {
        System.out.println("TreeSet con Comparador:");
        sets.construirTreeSetConComparador();
        for (String palabra : sets.construirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }

    private static void runTreeSetConComparadorInvertido(Sets sets) {
        System.out.println("TreeSet con comparador invertido:");
        Set<String> palabras = sets.construirTreeSetConComparadorInvertidoSet();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
