package controller;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet() {

        Set<String> palabras = new HashSet<>();
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop"); 
        palabras.add("celular");

        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop"); 
        palabras.add("celular");

        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop"); 
        palabras.add("celular");

        return palabras;
    }

public Set<String> construirTreeSetConComparador() {

    Comparator<String> comparador = new Comparator<>() {
        @Override
        public int compare(String s1, String s2) {
            int result = Integer.compare(s1.length(), s2.length());
            // si son iguales en tamaño, comparar alfabéticamente
            if (result == 0) {
                result = s1.compareTo(s2);
            }
            return result;
        }
    };
    
    Set<String> miTreeSetComparator = new TreeSet<>(comparador);

    miTreeSetComparator.add("Laptop");
    miTreeSetComparator.add("Manzana");
    miTreeSetComparator.add("Pera");
    miTreeSetComparator.add("Celular");
    miTreeSetComparator.add("Laptop");  
    miTreeSetComparator.add("celular"); 
    miTreeSetComparator.add("Celulas");

    return miTreeSetComparator;
    }

public Set<String> construirTreeSetConComparadorInvertidoSet() {

    Comparator<String> comparadorInvertido = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            int result = Integer.compare(s2.length(), s1.length());
            if (result == 0) {
                result = s2.compareTo(s1);
            }
            return result;
        }
    };

    Set<String> miTreeSetComparatorInvertido = new TreeSet<>(comparadorInvertido);

    miTreeSetComparatorInvertido.add("Laptop");
    miTreeSetComparatorInvertido.add("Manzana");
    miTreeSetComparatorInvertido.add("Pera");
    miTreeSetComparatorInvertido.add("Celular");
    miTreeSetComparatorInvertido.add("Laptop");
    miTreeSetComparatorInvertido.add("Celular");
    miTreeSetComparatorInvertido.add("Celulas");

        return miTreeSetComparatorInvertido;
    }

}
