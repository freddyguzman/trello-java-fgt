/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.elements;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class ListElement {
    
    String id;
    String name;
    Boolean closed;
    String idBoard;
    String pos;
    Boolean subscribed;

    /**
     * Constructor de la clase
     */
    public ListElement() {
    }

    /**
     * Constructor de la clase
     * @param id Id de lista
     * @param name Nombre de la lista
     * @param closed Boolean si esta cerrada la lista
     * @param idBoard Id del tablero
     * @param pos posición
     * @param subscribed
     */
    public ListElement(String id, String name, Boolean closed, String idBoard, String pos, Boolean subscribed) {
        this.id = id;
        this.name = name;
        this.closed = closed;
        this.idBoard = idBoard;
        this.pos = pos;
        this.subscribed = subscribed;
    }
    
    /**
     *
     * @param jsonO
     * @throws JSONException
     */
    public ListElement(JSONObject jsonO) throws JSONException{
        this.id = jsonO.get("id").toString();
        if(!jsonO.isNull("name")) this.name = jsonO.get("name").toString();
        if(!jsonO.isNull("closed")) this.closed = Boolean.valueOf(jsonO.get("closed").toString());
        if(!jsonO.isNull("idBoard")) this.idBoard = jsonO.get("idBoard").toString();
        if(!jsonO.isNull("pos")) this.pos = jsonO.get("pos").toString();
        if(!jsonO.isNull("subscribed")) this.subscribed = Boolean.valueOf(jsonO.get("subscribed").toString());        
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     *
     * @param closed
     */
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    /**
     *
     * @return
     */
    public String getIdBoard() {
        return idBoard;
    }

    /**
     *
     * @param idBoard
     */
    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    /**
     *
     * @return
     */
    public String getPos() {
        return pos;
    }

    /**
     *
     * @param pos
     */
    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        String string;
        string = "id : " + this.id + "\n" +
                "name : " + this.name + "\n" +
                "closed : " + this.closed + "\n" +
                "idBoard : " + this.idBoard + "\n" +
                "pos : " + this.pos + "\n" +
                "subscribed : " + this.subscribed + "\n";
        
        return string;
    }
    
    
}
