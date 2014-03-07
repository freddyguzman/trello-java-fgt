/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.gettrello;

/**
 *
 * @author FGT
 */
public class AppTrello {
    
    public String KEY;
    public String SECRET;
    public String urlAPIbase = "https://api.trello.com/1/";
    public String TOKEN;

    /**
     *
     * @return
     */
    public String getTOKEN() {
        return TOKEN;
    }

    /**
     *
     * @param TOKEN
     */
    public void setTOKEN(String TOKEN) {
        this.TOKEN = TOKEN;
    }

    /**
     *
     * @return
     */
    public String getKEY() {
        return KEY;
    }

    /**
     *
     * @return
     */
    public String getUrlAPIbase() {
        return urlAPIbase;
    }

    /**
     *
     * @param urlAPIbase
     */
    public void setUrlAPIbase(String urlAPIbase) {
        this.urlAPIbase = urlAPIbase;
    }

    /**
     *
     * @param KEY
     */
    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    /**
     *
     * @return
     */
    public String getSECRET() {
        return SECRET;
    }

    /**
     *
     * @param SECRET
     */
    public void setSECRET(String SECRET) {
        this.SECRET = SECRET;
    }

    /**
     *
     */
    public AppTrello() {
    }
    
    /**
     *
     * @return
     */
    public String getArgAccess(){        
       return "key="+this.KEY+"&token="+this.TOKEN;
    }
}
