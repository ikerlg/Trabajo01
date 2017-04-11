/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilotodom;

import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author usuario
 */
public class PilotoDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
          System.out.println("DOM");
        System.out.println("---");

        //create an instance
       DOMParserPartes dpe = new DOMParserPartes();

        //call run example
        dpe.runExample();
    }
    
}
