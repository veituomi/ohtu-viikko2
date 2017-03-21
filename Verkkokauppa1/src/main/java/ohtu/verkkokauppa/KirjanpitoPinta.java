package ohtu.verkkokauppa;

import java.util.ArrayList;

interface KirjanpitoPinta {
    void lisaaTapahtuma(String tapahtuma);
    ArrayList<String> getTapahtumat();
}