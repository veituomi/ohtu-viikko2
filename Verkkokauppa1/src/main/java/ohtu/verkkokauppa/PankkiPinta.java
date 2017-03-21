package ohtu.verkkokauppa;

interface PankkiPinta {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}