/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.request;

import cl.usach.elements.ActionElement;
import cl.usach.gettrello.AppTrello;
import cl.usach.gettrello.HTTP;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class ActionMethods extends AppTrello{
    
    String url;
    
    /**
     * Obtener acciones a través de la id del tablero
     * @param idBoard Id del tablero
     * @return Lista de acciones
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id-actions
     */
    public List<ActionElement> getActions(String idBoard) throws IOException, ParseException{
        url = getUrlAPIbase() + "board/" + idBoard + "/actions?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<ActionElement> actionElements = new ArrayList<ActionElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                ActionElement actionElement = new ActionElement(jsona.getJSONObject(i));
                actionElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return actionElements;
    }
    
    /**
     * Obtener acción a través de su identificador
     * @param idAction Id de la acción
     * @return Acción
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/action/index.html#get-1-actions-idaction
     */
    public ActionElement getAction(String idAction) throws IOException, ParseException{
        url = getUrlAPIbase() + "actions/" + idAction + "?" + getArgAccess();System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        ActionElement actionElement = null;
        try {       
            jsonO = new JSONObject(http.getResult());
            actionElement = new ActionElement(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }       
        return actionElement;
    }

    /**
     * Obtiene la lista de acciones a través de la id de la carta. Acciones que pertenecen a esa carta.
     * @param idCard Identificador de la carta.
     * @return Lista de elementos Action.
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/card/index.html#get-1-cards-card-id-or-shortlink-actions
     */
    public List<ActionElement> getActionsByIdCard(String idCard) throws IOException, ParseException{
        url = getUrlAPIbase() + "cards/" + idCard + "/actions?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<ActionElement> actionElements = new ArrayList<ActionElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                ActionElement actionElement = new ActionElement(jsona.getJSONObject(i));
                actionElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return actionElements;
    }
    
    /**
     * Obtener lista de acciones de una lista
     * @param idList Identificador de la lista
     * @return Elemento List
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/list/index.html#get-1-lists-idlist-actions
     */
    public List<ActionElement> getActionsByIdList(String idList) throws IOException, ParseException{
        url = getUrlAPIbase() + "lists/" + idList + "/actions?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<ActionElement> actionElements = new ArrayList<ActionElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                ActionElement actionElement = new ActionElement(jsona.getJSONObject(i));
                actionElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return actionElements;
    }
    
    /**
     * Obtiene las acciones de un miembro
     * @param idMember Identificador del miembro
     * @return Lista de elementos Action
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/member/index.html#get-1-members-idmember-or-username-actions
     */
    public List<ActionElement> getActionsByIdMember(String idMember) throws IOException, ParseException{
        url = getUrlAPIbase() + "members/" + idMember + "/actions?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<ActionElement> actionElements = new ArrayList<ActionElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                ActionElement actionElement = new ActionElement(jsona.getJSONObject(i));
                actionElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return actionElements;
    }
           
    
}
