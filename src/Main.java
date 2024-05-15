import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] lista ={8 , -20 , 15 , 19};
        System.out.println("Suma numerelor este: " + sumaNumere(lista));
        System.out.println("Numarul de elemente impare este: " + numereImpare(lista));
        int[] rezultat = numereMaiMari(lista, 9);
        System.out.print("Numerele mai mari sunt: ");
        for (int numar : rezultat) {
            System.out.print(numar + ", ");
        }
        targetDonatii(2000);
        targetDonatori(20);
        String text ="Ana are mere. Merele sunt bune";
        scriePropozitiile(text);

    }
    public static int sumaNumere(int[] numere){
        int suma = 0;
        for (int index : numere) {
            suma = suma + index;
        }
        return suma;
    }
    public static int numereImpare(int[] numere){
        int numarElemente = 0;
        for (int index : numere) {
            if (index % 2 == 1) {
                numarElemente++;
            }
        }
        return numarElemente;
    }
    public static int[] numereMaiMari(int[] numere, int numarComparatie){
        int[] listaNumereMaiMari = new int[numere.length];
        int count = 0;
        for (int index : numere) {
            if (index > numarComparatie) {
                listaNumereMaiMari[count] = index;
                count++;
            }
        }
        int[] rezultatFinal = new int[count];
        System.arraycopy(listaNumereMaiMari, 0, rezultatFinal, 0, count);

        return rezultatFinal;
    }
    public static void targetDonatii(int sumaDorita){
        Random random = new Random();
        int sumaColectata = 0;
        while (sumaColectata < sumaDorita){
            int donatie = random.nextInt(100) + 1;
            sumaColectata = sumaColectata + donatie;
            System.out.println("Donatia primita este de: " + donatie + " Ron. Am strans pana acum suma de: " + sumaColectata + " Ron");
        }
        System.out.println("Felicitari am atins targetul de: " + sumaDorita + "Ron");

    }
    public static void targetDonatori(int numarDonatori){
        Random random = new Random();
        int sumaColectata = 0;
        int numarDonatii = 1;
        while (numarDonatii <= numarDonatori){
            int donatie = random.nextInt(100) + 1;
            sumaColectata = sumaColectata + donatie;
            System.out.println("Donatia primita este de: " + donatie + " Ron. De la donatorul cu nr.: " + numarDonatii );
            numarDonatii++;
        }
        System.out.println("Felicitari am atins targetul de: " + numarDonatii + "donatori si am strans suma de: " + sumaColectata + "Ron");
    }
    public static void scriePropozitiile(String fraza) {
        String[] propozitii = fraza.split("\\.");

        for (String propozitie : propozitii) {
            propozitie = propozitie.trim();

            System.out.println(propozitie);

        }
    }
}
