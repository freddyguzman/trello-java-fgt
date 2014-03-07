/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.gettrello;

import java.io.IOException;
import java.text.ParseException;
import org.json.JSONException;

/**
 *
 * @author FGT
 */
public class MainClass {

    /**
     *
     * @param args
     * @throws IOException
     * @throws JSONException
     * @throws java.text.ParseException
     */
    public static void main( String[] args ) throws IOException, JSONException, ParseException{
        //String url = "https://api.trello.com/1/boards/52cb0d12e6db0a043c125fe1/cards?key=631d4a8cc7564a6b5f67a584ceef0062&token=be925ccf711a6a1c221baa5571f514e2f68ba8e2bd58af1bb50411b5220c7de1;
        
        
        Trello trello = new TrelloMake();
                
        String KEY = "631d4a8cc7564a6b5f67a584ceef0062";
        String SECRET = "24c808e1254f3399d4996f7e71d5fb8b448b57b8848f00207d38a636ef6b51e2";
        String TOKEN = "be925ccf711a6a1c221baa5571f514e2f68ba8e2bd58af1bb50411b5220c7de1";
        
        trello.setConfigTrello(KEY, SECRET, TOKEN);
        String idAction = "52fd436835d6ee09421feb38";
        String idBoard = "52cb0d12e6db0a043c125fe1";
        String idCard = "52d86225b752c7210ef11d3d";
        String idList = "52cb0d12e6db0a043c125fe4";
        String idMember = "51f0873a21aea82b18002bfc";
                
        System.out.println(trello.getMemberCreator(idAction));
        System.out.println(trello.getList(idList));
    }
    
}
