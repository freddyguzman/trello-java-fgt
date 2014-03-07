/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.elements;

import cl.usach.util.FormatDate;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class CardElement extends FormatDate{
    
    String id;
    String checkItemStates;
    Boolean closed;
    Date dateLastActivity;
    String desc;
    String descData;
    String idBoard;
    String idList;
    String idMembersVoted;
    String idShort;
    String idAttachmentCover;
    Boolean manualCoverAttachment;
    String name;
    String pos;
    String shortLink;
    String badges;
    Date due;
    String idChecklists;
    String idMembers;
    String labels;
    String shortUrl;
    Boolean subscribed;
    String url;

    /**
     *
     */
    public CardElement() {
    }

    /**
     *
     * @param id
     * @param checkItemStates
     * @param closed
     * @param dateLastActivity
     * @param desc
     * @param descData
     * @param idBoard
     * @param idList
     * @param idMembersVoted
     * @param idShort
     * @param idAttachmentCover
     * @param manualCoverAttachment
     * @param name
     * @param pos
     * @param shortLink
     * @param badges
     * @param due
     * @param idChecklists
     * @param idMembers
     * @param labels
     * @param shortUrl
     * @param subscribed
     * @param url
     */
    public CardElement(String id, String checkItemStates, Boolean closed, Date dateLastActivity, String desc, String descData, String idBoard, String idList, String idMembersVoted, String idShort, String idAttachmentCover, Boolean manualCoverAttachment, String name, String pos, String shortLink, String badges, Date due, String idChecklists, String idMembers, String labels, String shortUrl, Boolean subscribed, String url) {
        this.id = id;
        this.checkItemStates = checkItemStates;
        this.closed = closed;
        this.dateLastActivity = dateLastActivity;
        this.desc = desc;
        this.descData = descData;
        this.idBoard = idBoard;
        this.idList = idList;
        this.idMembersVoted = idMembersVoted;
        this.idShort = idShort;
        this.idAttachmentCover = idAttachmentCover;
        this.manualCoverAttachment = manualCoverAttachment;
        this.name = name;
        this.pos = pos;
        this.shortLink = shortLink;
        this.badges = badges;
        this.due = due;
        this.idChecklists = idChecklists;
        this.idMembers = idMembers;
        this.labels = labels;
        this.shortUrl = shortUrl;
        this.subscribed = subscribed;
        this.url = url;
    }
    
    /**
     * Constructor de la clase 
     * @param jsonO JSON Object
     * @throws JSONException
     * @throws ParseException
     */
    public CardElement(JSONObject jsonO) throws JSONException, ParseException{
        this.id = jsonO.get("id").toString();
        if(!jsonO.isNull("checkItemStates")) this.checkItemStates = jsonO.get("checkItemStates").toString();
        if(!jsonO.isNull("closed")) this.closed = Boolean.valueOf(jsonO.get("closed").toString());
        if(!jsonO.isNull("dateLastActivity")) this.dateLastActivity = getFormatDate(jsonO.get("dateLastActivity").toString());
        if(!jsonO.isNull("desc")) this.desc = jsonO.get("desc").toString();
        if(!jsonO.isNull("descData")) this.descData = jsonO.get("descData").toString();
        if(!jsonO.isNull("idBoard")) this.idBoard = jsonO.get("idBoard").toString();
        if(!jsonO.isNull("idList")) this.idList = jsonO.get("idList").toString();
        if(!jsonO.isNull("idMembersVoted")) this.idMembersVoted = jsonO.get("idMembersVoted").toString();
        if(!jsonO.isNull("idShort")) this.idShort = jsonO.get("idShort").toString();
        if(!jsonO.isNull("idAttachmentCover")) this.idAttachmentCover = jsonO.get("idAttachmentCover").toString();
        if(!jsonO.isNull("manualCoverAttachment")) this.manualCoverAttachment = Boolean.valueOf(jsonO.get("manualCoverAttachment").toString());
        if(!jsonO.isNull("name")) this.name = jsonO.get("name").toString(); 
        if(!jsonO.isNull("pos")) this.pos = jsonO.get("pos").toString(); 
        if(!jsonO.isNull("shortLink")) this.shortLink = jsonO.get("shortLink").toString(); 
        if(!jsonO.isNull("badges")) this.badges = jsonO.get("badges").toString(); 
        if(!jsonO.isNull("due")) this.due = getFormatDate(jsonO.get("due").toString()); 
        if(!jsonO.isNull("idChecklists")) this.idChecklists = jsonO.get("idChecklists").toString(); 
        if(!jsonO.isNull("idMembers")) this.idMembers = jsonO.get("idMembers").toString();
        if(!jsonO.isNull("labels")) this.labels = jsonO.get("labels").toString();
        if(!jsonO.isNull("shortUrl")) this.shortUrl = jsonO.get("shortUrl").toString();
        if(!jsonO.isNull("subscribed")) this.subscribed = Boolean.valueOf(jsonO.get("subscribed").toString());
        if(!jsonO.isNull("url")) this.url = jsonO.get("url").toString();    
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
    public String getCheckItemStates() {
        return checkItemStates;
    }

    /**
     *
     * @param checkItemStates
     */
    public void setCheckItemStates(String checkItemStates) {
        this.checkItemStates = checkItemStates;
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
    public Date getDateLastActivity() {
        return dateLastActivity;
    }

    /**
     *
     * @param dateLastActivity
     */
    public void setDateLastActivity(Date dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
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
    public String getIdList() {
        return idList;
    }

    /**
     *
     * @param idList
     */
    public void setIdList(String idList) {
        this.idList = idList;
    }

    /**
     *
     * @return
     */
    public String getIdMembersVoted() {
        return idMembersVoted;
    }

    /**
     *
     * @param idMembersVoted
     */
    public void setIdMembersVoted(String idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    /**
     *
     * @return
     */
    public String getIdShort() {
        return idShort;
    }

    /**
     *
     * @param idShort
     */
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    /**
     *
     * @return
     */
    public String getIdAttachmentCover() {
        return idAttachmentCover;
    }

    /**
     *
     * @param idAttachmentCover
     */
    public void setIdAttachmentCover(String idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    /**
     *
     * @return
     */
    public Boolean isManualCoverAttachment() {
        return manualCoverAttachment;
    }

    /**
     *
     * @param manualCoverAttachment
     */
    public void setManualCoverAttachment(Boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
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

    /**
     *
     * @return
     */
    public String getShortLink() {
        return shortLink;
    }

    /**
     *
     * @param shortLink
     */
    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    /**
     *
     * @return
     */
    public String getBadges() {
        return badges;
    }

    /**
     *
     * @param badges
     */
    public void setBadges(String badges) {
        this.badges = badges;
    }

    /**
     *
     * @return
     */
    public Date getDue() {
        return due;
    }

    /**
     *
     * @param due
     */
    public void setDue(Date due) {
        this.due = due;
    }

    /**
     *
     * @return
     */
    public String getIdChecklists() {
        return idChecklists;
    }

    /**
     *
     * @param idChecklists
     */
    public void setIdChecklists(String idChecklists) {
        this.idChecklists = idChecklists;
    }

    /**
     *
     * @return
     */
    public String getIdMembers() {
        return idMembers;
    }

    /**
     *
     * @param idMembers
     */
    public void setIdMembers(String idMembers) {
        this.idMembers = idMembers;
    }

    /**
     *
     * @return
     */
    public String getLabels() {
        return labels;
    }

    /**
     *
     * @param labels
     */
    public void setLabels(String labels) {
        this.labels = labels;
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
    public Boolean isSubscribed() {
        return subscribed;
    }

    /**
     *
     * @param subscribed
     */
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
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

    @Override
    public String toString() {
        String string ;
        string = "id : " + this.id + "\n" +
                "checkItemStates : " + this.checkItemStates + "\n" +
                "closed: " + this.closed + "\n" +
                "dateLastActivity: " + this.dateLastActivity + "\n" +
                "desc: " + this.desc + "\n" +
                "descData: " + this.descData + "\n" +
                "idBoard: " + this.idBoard + "\n" +
                "idList: " + this.idList + "\n" +
                "idMembersVoted: " + this.idMembersVoted + "\n" +
                "idShort: " + this.idShort + "\n" +
                "idAttachmentCover: " + this.idAttachmentCover + "\n" +
                "manualCoverAttachment: " + this.manualCoverAttachment + "\n" +
                "name: " + this.name + "\n" +
                "pos: " + this.pos + "\n" +
                "shortLink: " + this.shortLink + "\n" +
                "badges: " + this.badges + "\n" +
                "due: " + this.due + "\n" +
                "idChecklists: " + this.idChecklists + "\n" +
                "idMembers: " + this.idMembers + "\n" +
                "labels: " + this.labels + "\n" +
                "shortUrl: " + this.shortUrl + "\n" +
                "subscribed: " + this.subscribed + "\n" +
                "url: " + this.url + "\n";

        return string; 
    }
    
    
    
}
