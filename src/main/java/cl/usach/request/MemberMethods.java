/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.request;

import cl.usach.elements.MemberElement;
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
public class MemberMethods extends AppTrello{
    
    String url;
    
    /**
     * Obtener la lista de miembros a través del identificador del tablero
     * @param idBoard Id del tablero
     * @return Lista de elementos Member
     * @throws IOException
     * @see https://trello.com/docs/api/board/index.html#get-1-boards-board-id-members
     */
    public List<MemberElement> getMembers (String idBoard) throws IOException{
        url = getUrlAPIbase() + "board/" + idBoard + "/members?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<MemberElement> memberElements = new ArrayList<MemberElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                MemberElement memberElement = new MemberElement(jsona.getJSONObject(i));
                memberElements.add(memberElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return memberElements;
    }
    
    /**
     * Obtener el miembro creador de la acción
     * @param idAction Id de la acción
     * @return Elemento Miembro
     * @throws IOException
     * @see https://trello.com/docs/api/action/index.html#get-1-actions-idaction-membercreator
     */
    public MemberElement getMemberCreator(String idAction) throws IOException{
        url = getUrlAPIbase() + "actions/" + idAction + "/memberCreator?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        MemberElement memberElement = null;
        try{
            jsonO = new JSONObject(http.getResult());
            memberElement = new MemberElement(jsonO);
        }catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return memberElement;
    }
    
    /**
     * Obtiene los miembros que fueron asignados a la tarjeta
     * @param idCard Identificador de tarjeta
     * @return Lista de elementos Member
     * @throws IOException
     * @see https://trello.com/docs/api/card/index.html#get-1-cards-card-id-or-shortlink-members
     */
    public List<MemberElement> getMembersByIdCard (String idCard) throws IOException{
        url = getUrlAPIbase() + "cards/" + idCard + "/members?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        List<MemberElement> memberElements = new ArrayList<MemberElement>();
        try {
            jsona = new JSONArray(http.getResult());            
            for (int i=0; i < jsona.length(); i++){
                MemberElement memberElement = new MemberElement(jsona.getJSONObject(i));
                memberElements.add(memberElement);
            }
        } catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return memberElements;
    }
    
    /**
     * Obtener miembro a través de su identificador
     * @param idMember Identificador del miembro
     * @return Elemento Miembro
     * @throws IOException
     * @see https://trello.com/docs/api/member/index.html#get-1-members-idmember-or-username
     */
    public MemberElement getMember(String idMember) throws IOException{
        url = getUrlAPIbase() + "members/" + idMember + "?" + getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONObject jsonO;
        MemberElement memberElement = null;
        try{
            jsonO = new JSONObject(http.getResult());
            memberElement = new MemberElement(jsonO);
        }catch (JSONException ex) {
            System.out.println("Error: No existen Acciones");
        }
        
        return memberElement;
    }
}
