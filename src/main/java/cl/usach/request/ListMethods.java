/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.request;

import cl.usach.elements.ListElement;
import cl.usach.gettrello.AppTrello;
import cl.usach.gettrello.HTTP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class ListMethods extends AppTrello{
    String url;
    AppTrello appTrello;
    
    public ListMethods(AppTrello appTrello){
        this.appTrello = appTrello;
    }
    
    /**
     * Obtiene una lista de elementos a través del identificador del tablero
     * @param idBoard Id del tablero
     * @return Lista de elementos List
     * @throws IOException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id-lists
     */
    public List<ListElement> getLists(String idBoard) throws IOException{
        url = appTrello.getUrlAPIbase() + "boards/" + idBoard + "/lists?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<ListElement> listElements = new ArrayList<ListElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                ListElement listElement = new ListElement(jsona.getJSONObject(i));
                listElements.add(listElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return listElements;
    }
    
    /**
     * Obtener la lista a la cual pertenece la carta
     * @param idCard Identificador de la carta
     * @return Elemento List
     * @throws IOException
     * @see https://trello.com/docs/api/card/index.html#get-1-cards-card-id-or-shortlink-list
     */
    public ListElement getListByIdCard(String idCard) throws IOException{
        url = appTrello.getUrlAPIbase() + "cards/" + idCard + "/list?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        ListElement listElement = null;
        try {
            jsonO = new JSONObject(http.getResult()); 
            listElement = new ListElement(jsonO);
            
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return listElement;
    }

    /**
     * Obtiene la lista a través de su identificador
     * @param idList Identificador de la lista
     * @return Elemento List
     * @throws IOException
     * @see https://trello.com/docs/api/list/index.html#get-1-lists-idlist
     */
    public ListElement getList(String idList) throws IOException{
        url = appTrello.getUrlAPIbase() + "lists/" + idList + "?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        ListElement listElement = null;
        try {
            jsonO = new JSONObject(http.getResult()); 
            listElement = new ListElement(jsonO);
            
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return listElement;
    }
    
    
}
