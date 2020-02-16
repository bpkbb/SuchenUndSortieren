package my_project.model;

/**
 * Diese Klasse dient dazu Arrays zu sortieren. Sie soll außerdem den Aufwand des  jeweils durchgeführten Verfahrens
 * messen.
 * //todo Aufwandsmessung
 */
public class Datenmanager {

    private int anzahlVergleiche;
    private int anzahlVertauschungen;
    private double benoetigteZeit;

    /**
     * Erzeugt ein neues Objekt (es wird nur eins benötigt)
     */
    public Datenmanager(){
        reset();
    }

    /**
     * Setzt alle Zähler für die Algorithmen zurück
     */
    private void reset(){
        anzahlVergleiche = 0;
        anzahlVertauschungen = 0;
        benoetigteZeit = 0;
    }

    /**
     * Sortiert ein Array aus Tokens gemäß BubbleSort-Algorithmus
     * @param t
     */
    public void bubbleSort(Token[] t){
        if (t != null) {
            Token tmp;
            for (int i = 1; i < t.length; i++) {
                for (int j = 0; j < t.length-i; j++){
                    if (t[j].getPrimaryKey()>t[j+1].getPrimaryKey()){
                        tmp = t[j];
                        t[j] = t[j+1];
                        t[j+1] = tmp;
                    }
                }
            }
        }
    }

    /**
     * Sortiert ein Array aus Tokens gemäß SelectionSort-Algorithmus
     * @param t
     */
    public void selectionSort(Token[] t){
        if (t != null){
            int indexMin;
            Token tmp;
            for (int i = 0; i < t.length; i++){
                indexMin = i;
                for (int j = i+1; j < t.length; j++){
                    if (t[indexMin].getPrimaryKey() > t[j].getPrimaryKey()){
                        indexMin = j;
                    }
                }
                tmp = t[i];
                t[i] = t[indexMin];
                t[indexMin] = tmp;
            }
        }
    }

    /**
     * Sortiert ein Array aus Tokens gemäß InsertionSort-Algorithmus
     * @param t
     */
    public void insertionSort(Token[] t){
        if (t != null){
            Token tmp;
            for (int i = 0; i < t.length; i++){
                int j = i;
                while(j > 0 && t[j].getPrimaryKey() < t[j-1].getPrimaryKey()){
                    tmp =t[j-1];
                    t[j-1] = t[j];
                    t[j] = tmp;
                    j--;
                }
            }
        }
    }

    /**
     * Ruft die rekursive Sortiermethode für QuickSort mit den nötigen Parametern auf und
     * sortiert ein Array aus Tokens gemäß QuickSort-Algorithmus
     * @param t
     */
    public void quickSort(Token[] t){
        recursiveQuickSort(t, 0,t.length-1);
    }

    /**
     * Sortiert ein Array aus Tokens gemäß QuickSort-Algorithmus
     * @param t
     * @param left
     * @param right
     */
    private void recursiveQuickSort(Token[] t, int left, int right){
        //todo Implementieren. Hilfestellungen finden sich im Buch und im Internet.
    }

    /**
     * Sortiert ein Array aus Tokens gemäß HashSort-Algorithmus
     * @param t
     */
    public void hashSort(Token[] t){
        //todo Implementieren. Hilfestellungen finden sich im Buch und im Internet.
    }

    /**
     * Sucht in einem Token-Array mit linearer Suche nach einem Token und gibt dessen Index zurück (-1 bedeutet nicht gefunden)
     * @param key Der gesuchte Schlüssel
     */
    public int linSearch(int key){
        //todo Implementieren. Hilfestellungen finden sich im Buch und im Internet.
        return -1;
    }

    /**
     * Sucht in einem Token-Array mit binärer Suche nach einem Token und gibt dessen Index zurück (-1 bedeutet nicht gefunden)
     * @param key Der gesuchte Schlüssel
     */
    public int binSearch(int key){
        //todo Implementieren. Hilfestellungen finden sich im Buch und im Internet.
        return -1;
    }

    // Sondierende / Zuweisende Methoden

    public int getAnzahlVergleiche() {
        return anzahlVergleiche;
    }

    public int getAnzahlVertauschungen() {
        return anzahlVertauschungen;
    }

    public double getBenoetigteZeit(){
        return benoetigteZeit;
    }
}
