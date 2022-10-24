package it.fi.itismeucci.lanzi;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App3json {
    public static void main(String[] args) {
        Alunno riccardo = new Alunno("riccardo", "fantacci", new Date(2004, 7, 29));
        Alunno guido = new Alunno("guido", "lanzi", new Date(2004, 3, 29));
        Alunno flavio = new Alunno("flavio", "ndoja", new Date(2004, 12, 31));
        Alunno niccolo = new Alunno("niccolo", "sartorio", new Date(2004, 8, 31));

        ArrayList<Alunno> lista = new ArrayList<>();

        lista.add(niccolo);
        lista.add(guido);
        lista.add(flavio);
        lista.add(riccardo);

        Classe classe = new Classe(5, "CIA", "06-TE", lista);
        
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("classe.json"), classe);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
