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
public class BoardElem {
    String id;
    String name;
    String desc;
    String descData;
    Boolean closed;
    String idOrganization;
    Boolean pinned;
    String url;
    String shortUrl;
    String prefs;
    String labelNames;

    /**
     *
     */
    public BoardElem() {
    }

    /**
     *
     * @param id
     * @param name
     * @param desc
     * @param descData
     * @param closed
     * @param idOrganization
     * @param pinned
     * @param url
     * @param shortUrl
     * @param prefs
     * @param labelNames
     */
    public BoardElem(String id, String name, String desc, String descData, boolean closed, String idOrganization, boolean pinned, String url, String shortUrl, String prefs, String labelNames) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.descData = descData;
        this.closed = closed;
        this.idOrganization = idOrganization;
        this.pinned = pinned;
        this.url = url;
        this.shortUrl = shortUrl;
        this.prefs = prefs;
        this.labelNames = labelNames;
    }
    
    /**
     *
     * @param jsonO
     * @throws JSONException
     */
    public BoardElem(JSONObject jsonO) throws JSONException{
        this.id = jsonO.get("id").toString();
        if(!jsonO.isNull("name")) this.name = jsonO.get("name").toString();
        if(!jsonO.isNull("desc")) this.desc = jsonO.get("desc").toString();
        if(!jsonO.isNull("descData")) this.descData = jsonO.get("descData").toString();
        if(!jsonO.isNull("closed")) this.closed = Boolean.valueOf(jsonO.get("closed").toString());
        if(!jsonO.isNull("idOrganization")) this.idOrganization = jsonO.get("idOrganization").toString();
        if(!jsonO.isNull("pinned")) this.pinned = Boolean.valueOf(jsonO.get("pinned").toString());
        if(!jsonO.isNull("url")) this.url = jsonO.get("url").toString();
        if(!jsonO.isNull("shortUrl")) this.shortUrl = jsonO.get("shortUrl").toString();
        if(!jsonO.isNull("prefs")) this.prefs = jsonO.get("prefs").toString();
        if(!jsonO.isNull("labelNames")) this.labelNames = jsonO.get("labelNames").toString();
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
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     *
     * @return
     */
    public String getDescData() {
        return descData;
    }

    /**
     *
     * @param descData
     */
    public void setDescData(String descData) {
        this.descData = descData;
    }

    /**
     *
     * @return
     */
    public boolean getClosed() {
        return closed;
    }

    /**
     *
     * @param closed
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    /**
     *
     * @return
     */
    public String getIdOrganization() {
        return idOrganization;
    }

    /**
     *
     * @param idOrganization
     */
    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    /**
     *
     * @return
     */
    public boolean getPinned() {
        return pinned;
    }

    /**
     *
     * @param pinned
     */
    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     *
     * @param shortUrl
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     *
     * @return
     */
    public String getPrefs() {
        return prefs;
    }

    /**
     *
     * @param prefs
     */
    public void setPrefs(String prefs) {
        this.prefs = prefs;
    }

    /**
     *
     * @return
     */
    public String getLabelNames() {
        return labelNames;
    }

    /**
     *
     * @param labelNames
     */
    public void setLabelNames(String labelNames) {
        this.labelNames = labelNames;
    }

    @Override
    public String toString() {
        String string;
        string = "id : " + this.id + "\n" +
                "name : " + this.name + "\n" +
                "desc : " + this.desc + "\n" +
                "descData : " + this.descData + "\n" +
                "closed : " + this.closed + "\n" +
                "idOrganization : " + this.idOrganization + "\n" +
                "pinned : " + this.pinned + "\n" +
                "url : " + this.url + "\n" +
                "shortUrl : " + this.shortUrl + "\n" +
                "prefs : " + this.prefs + "\n" +
                "labelNames : " + this.labelNames + "\n" ;

        return string;
    }
    
    
}
