package it.fi.itismeucci.lanzi;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App4json {
    
    public static void main( String[] args )
    {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Classe classe = objectMapper.readValue(new File("classe.json"), Classe.class);
            System.out.println(classe.getAula());
        } catch (Exception e) {}
        
    }
}
