package at.dcv.w04;

public class W04Tag4AuswertenLukasAufgabe2 {
    /* --- Aufgabenstellung
1. Tabellarische Darstellung (jede Spalte ist 15 Charaktere breit)
        Längere Texte werden abgeschnitten.
        Zwischen den Spalten müssen "" kommen.
2. Tabellarische Darstellung (Dynamische Spaltenbreite)
3. Analyse
        a. Wie viel Wert wurde verkauft? (Komplettumsatz)
        b. Wie viel Stücke wurden verkauft?
        c. Wer hat am meisten Geld ausgegeben?
        d. Wer hat am meisten Stücke gekauft?
        e. An welchem Tag wurde am meisten Stücke verkauft?
        f. Durchschnitt Einkauf pro Kunde?
* */
    public static void main(String[] args) {

        W04Tag4CSVAuswertenLukas.checkPreconditions(args);

        String text = W04Tag4CSVAuswertenLukas.readfile(args[0]);

        if (text == null) {
            System.out.println("Beim Lesen ist ein Fehler aufgetreten");
            System.exit(1);
        }

        String[] lines = W04Tag4CSVAuswertenLukas.splitLines(text);



    }
}
