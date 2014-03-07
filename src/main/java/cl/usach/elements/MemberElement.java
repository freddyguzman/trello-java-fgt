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
public class MemberElement {
    
    String id;
    String fullName;
    String initials;
    String memberType;
    String username;

    /**
     *
     */
    public MemberElement() {
    }

    /**
     *
     * @param id
     * @param fullName
     * @param initials
     * @param memberType
     * @param username
     */
    public MemberElement(String id, String fullName, String initials, String memberType, String username) {
        this.id = id;
        this.fullName = fullName;
        this.initials = initials;
        this.memberType = memberType;
        this.username = username;
    }
    
    /**
     *
     * @param jsonO
     * @throws JSONException
     */
    public MemberElement(JSONObject jsonO) throws JSONException{
        this.id = jsonO.get("id").toString();
        if(!jsonO.isNull("fullName")) this.fullName = jsonO.get("fullName").toString();
        if(!jsonO.isNull("initials")) this.initials = jsonO.get("initials").toString();
        if(!jsonO.isNull("memberType")) this.memberType = jsonO.get("memberType").toString();
        if(!jsonO.isNull("username")) this.username = jsonO.get("username").toString();
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
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getInitials() {
        return initials;
    }

    /**
     *
     * @param initials
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     *
     * @return
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     *
     * @param memberType
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        String string;
        string = "id : " + this.id + "\n" +
                "fullName : " + this.fullName + "\n" + 
                "initials : " + this.initials + "\n" +
                "memberType : " + this.memberType + "\n" +
                "username : " + this.username + "\n";
        return string;
    }
    
    
}
