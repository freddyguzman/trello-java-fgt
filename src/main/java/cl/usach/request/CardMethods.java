/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.request;

import cl.usach.elements.CardElement;
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
public class CardMethods extends AppTrello{
    
    String url;
    AppTrello appTrello;

    public CardMethods(AppTrello appTrello) {
        this.appTrello = appTrello;
    }   
    
    /**
     * Obtener lista de Cartas a través del identificador del tablero
     * @param idBoard Id del tablero
     * @return Lista de elementos Cards
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id-cards
     */
    public List<CardElement> getCards(String idBoard) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "boards/" + idBoard + "/cards?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<CardElement> cardsElements = new ArrayList<CardElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                CardElement actionElement = new CardElement(jsona.getJSONObject(i));
                cardsElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return cardsElements;
    }
    
    /**
     * Obtener Carta a través del identificador del tablero y el identificador de la carta
     * @param idBoard Id del tablero
     * @param idCard Id de la carta
     * @return Elemento Card
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id-cards-idcard
     */
    public CardElement getCard(String idBoard, String idCard) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "boards/" + idBoard + "/cards/" + idCard + "?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        CardElement cardElement = null;
        try {       
            jsonO = new JSONObject(http.getResult());
            cardElement = new CardElement(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }       
        return cardElement;
    }
    
    /**
     * Obtener lista de cartas a través del identificador del tablero y el identificador del Miembro
     * @param idBoard Id del tablero
     * @param idMember Id del miembro
     * @return Lista de elementos Cartas
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id-members-idmember-cards
     */
    public List<CardElement> getCards(String idBoard, String idMember) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "boards/" + idBoard + "/members/" + idMember + "/cards?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<CardElement> cardsElements = new ArrayList<CardElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                CardElement actionElement = new CardElement(jsona.getJSONObject(i));
                cardsElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return cardsElements;
    }
    
    /**
     * Obtener la carta a través del identificador de la acción 
     * @param idAction Id de la acción
     * @return Elemento Card
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/action/index.html#get-1-actions-idaction-card
     */
    public CardElement getCardByIdAction(String idAction) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "actions/" + idAction + "/card?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        CardElement cardElement = null;
        try {       
            jsonO = new JSONObject(http.getResult());
            cardElement = new CardElement(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }       
        return cardElement;
    }
    
    /**
     * Obtener la carta a través de su identificador
     * @param idCard Id de la tarjeta
     * @return Elemento Card
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/card/index.html#get-1-cards-card-id-or-shortlink
     */
    public CardElement getCard(String idCard) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "cards/" + idCard + "?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        CardElement cardElement = null;
        try {       
            jsonO = new JSONObject(http.getResult());
            cardElement = new CardElement(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }       
        return cardElement;
    }
    
    /**
     * Obtener las cartas de una lista 
     * @param idList Identificador de la lista
     * @return Lista de elementos Card
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/list/index.html#get-1-lists-idlist-cards
     */
    public List<CardElement> getCardsByIdList(String idList) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "lists/" + idList + "/cards?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<CardElement> cardsElements = new ArrayList<CardElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                CardElement actionElement = new CardElement(jsona.getJSONObject(i));
                cardsElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return cardsElements;
    }
    
    /**
     * Obtiene las cartas de un miembro
     * @param idMember Identificador del miembro
     * @return Lista de elementos Member
     * @throws IOException
     * @throws ParseException
     * @see https://trello.com/docs/api/member/index.html#get-1-members-idmember-or-username-cards
     */
    public List<CardElement> getCardsByIdMember(String idMember) throws IOException, ParseException{
        url = appTrello.getUrlAPIbase() + "members/" + idMember + "/cards?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<CardElement> cardsElements = new ArrayList<CardElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                CardElement actionElement = new CardElement(jsona.getJSONObject(i));
                cardsElements.add(actionElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return cardsElements;
    }
}
