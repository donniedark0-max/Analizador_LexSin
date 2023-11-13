/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author jjose
 */
public class Principal {
    public static void main(String[] args) throws Exception{
        String ruta= "src/codigo/Lexer.flex";
        String ruta2= "src/codigo/LexerCup.flex";
        String[] rutaSintactico = {"-parser", "Sintax","src/codigo/Sintax.cup"};
        generarLexerAndSintac(ruta, ruta2, rutaSintactico);
    }
    public static void generarLexerAndSintac(String ruta, String ruta2, String[] rutaSintactico) throws IOException, Exception{
        File archivo;
          archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaSintactico);
        
        
        Path rutaSym = Paths.get("src/codigo/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("./sym.java"),
                Paths.get("src/codigo/sym.java")
        );
        
        Path rutaSin = Paths.get("src/codigo/sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
         Files.move(
                Paths.get("./sintax.java"),
                Paths.get("src/codigo/sintax.java")
        );
    }
}
