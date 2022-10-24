package it.fi.itismeucci.lanzi;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App {
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
        XmlMapper xmlMapper = new XmlMapper();
        
        /* try {
            xmlMapper.writeValue(new File("simple_bean.xml"), classe);
        } catch (Exception e) {
            // TODO: handle exception
        }
        */
        try {
            String xmlstringa = xmlMapper.writeValueAsString(classe);
            System.out.println(xmlstringa);

            Classe c = xmlMapper.readValue(xmlstringa, Classe.class);
            System.out.println(c.getAula());
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}