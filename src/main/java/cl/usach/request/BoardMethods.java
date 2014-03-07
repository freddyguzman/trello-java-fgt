/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.request;

import cl.usach.gettrello.AppTrello;
import cl.usach.elements.BoardElem;
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
public class BoardMethods{
    
    String url;
    AppTrello appTrello;

    /**
     * Constructor de la clase
     */
    public BoardMethods() {
    }
    
    public BoardMethods(AppTrello appTrello) {
        this.appTrello = appTrello;
    }
    
    /**
     * Obtiene la información del tablero
     * @param idBoard Id del tablero
     * @return Elemento Board
     * @throws IOException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id
     */
    public BoardElem getBoard(String idBoard) throws IOException{
        url = appTrello.getUrlAPIbase() + "boards/" + idBoard + "?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        BoardElem boardElem = null;
        try {
            jsonO = new JSONObject(http.getResult());
            boardElem = new BoardElem(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existe Tablero");
        }
                       
        return boardElem;
    }
    
    /**
     * Obtener el tablero a través del identificador de una acción
     * @param idAction Id de la acción
     * @return Elemento Board
     * @throws IOException
     * @see https://trello.com/docs/api/action/index.html#get-1-actions-idaction-board
     */
    public BoardElem getBoardByIdAction(String idAction) throws IOException{
        url = appTrello.getUrlAPIbase() + "actions/" + idAction + "/board?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        BoardElem boardElem = null;
        try {
            jsonO = new JSONObject(http.getResult());
            boardElem = new BoardElem(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existe Tablero");
        }
                       
        return boardElem;
    }
    
    /**
     * Obteniene el tablero a la cual pertece la carta
     * @param idCard Identificador de la carta
     * @return Elemento Board
     * @throws IOException
     * @see https://trello.com/docs/api/card/index.html#get-1-cards-card-id-or-shortlink-board
     */
    public BoardElem getBoardByIdCard(String idCard) throws IOException{
        url = appTrello.getUrlAPIbase() + "cards/" + idCard + "/board?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        BoardElem boardElem = null;
        try {
            jsonO = new JSONObject(http.getResult());
            boardElem = new BoardElem(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existe Tablero");
        }
                       
        return boardElem;
    }
    
    /**
     * Obtiene el tablero de una lista
     * @param idList Identificador de la lista
     * @return Elemento Board
     * @throws IOException
     *  @see https://trello.com/docs/api/list/index.html#get-1-lists-idlist-board
     */
    public BoardElem getBoardByIdList(String idList) throws IOException{
        url = appTrello.getUrlAPIbase() + "lists/" + idList + "/board?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        BoardElem boardElem = null;
        try {
            jsonO = new JSONObject(http.getResult());
            boardElem = new BoardElem(jsonO);
        } catch (JSONException ex) {
            System.out.println("Error: No existe Tablero");
        }
                       
        return boardElem;
    }
    
    /**
     * Obtiene los tableros del miembro
     * @param idMember Identificador del miembro
     * @return Lista de elementos Board
     * @throws IOException
     * @see https://trello.com/docs/api/member/index.html#get-1-members-idmember-or-username-boards
     */
    public List<BoardElem> getBoardsByIdMember(String idMember) throws IOException{
        url = appTrello.getUrlAPIbase() + "members/" + idMember + "/boards?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<BoardElem> boardElems = new ArrayList<BoardElem>();
        
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                BoardElem boardElem = new BoardElem(jsona.getJSONObject(i));
                boardElems.add(boardElem);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return boardElems;
        
    }
}
