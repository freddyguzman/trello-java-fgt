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
 * @version 1.0
 */
public class ActionElement extends FormatDate{
    
    String id;
    String idMemberCreator;
    String nameListAfter;
    String idListAfter;
    String nameListBefore;
    String idListBefore;
    String boardName;
    String boardId;
    String boardShortLink;
    String cardShortLink;
    String cardIdShort;
    String cardName;
    String cardId;
    Date cardDue;
    String type;
    Date date;
    String memberCreatorId;
    String memberCreatorFullName;
    String memberCreatorInitials;
    String memberCreatorUsername;
    String memberId;
    String memberAvatarHash;
    String memberFullName;
    String memberInitials;
    String memberUsername;
    
    /**
     * Constructor de la clase
     */
    public ActionElement() {
    }

    /**
     *
     * @param id
     * @param idMemberCreator
     * @param nameListAfter
     * @param idListAfter
     * @param nameListBefore
     * @param idListBefore
     * @param boardName
     * @param boardId
     * @param boardShortLink
     * @param cardShortLink
     * @param cardIdShort
     * @param cardName
     * @param cardId
     * @param cardDue
     * @param type
     * @param date
     * @param memberCreatorId
     * @param memberCreatorFullName
     * @param memberCreatorInitials
     * @param memberCreatorUsername
     * @param memberId
     * @param memberAvatarHash
     * @param memberFullName
     * @param memberInitials
     * @param memberUsername
     */
    public ActionElement(String id, String idMemberCreator, String nameListAfter, String idListAfter, String nameListBefore, String idListBefore, String boardName, String boardId, String boardShortLink, String cardShortLink, String cardIdShort, String cardName, String cardId, Date cardDue, String type, Date date, String memberCreatorId, String memberCreatorFullName, String memberCreatorInitials, String memberCreatorUsername, String memberId, String memberAvatarHash, String memberFullName, String memberInitials, String memberUsername) {
        this.id = id;
        this.idMemberCreator = idMemberCreator;
        this.nameListAfter = nameListAfter;
        this.idListAfter = idListAfter;
        this.nameListBefore = nameListBefore;
        this.idListBefore = idListBefore;
        this.boardName = boardName;
        this.boardId = boardId;
        this.boardShortLink = boardShortLink;
        this.cardShortLink = cardShortLink;
        this.cardIdShort = cardIdShort;
        this.cardName = cardName;
        this.cardId = cardId;
        this.cardDue = cardDue;
        this.type = type;
        this.date = date;
        this.memberCreatorId = memberCreatorId;
        this.memberCreatorFullName = memberCreatorFullName;
        this.memberCreatorInitials = memberCreatorInitials;
        this.memberCreatorUsername = memberCreatorUsername;
        this.memberId = memberId;
        this.memberAvatarHash = memberAvatarHash;
        this.memberFullName = memberFullName;
        this.memberInitials = memberInitials;
        this.memberUsername = memberUsername;
    }

    /**
     * Constructor de la clase
     * @param json JSON Object
     * @throws JSONException
     * @throws ParseException
     */
    public ActionElement(JSONObject json) throws JSONException, ParseException{
        this.id = json.get("id").toString();
        this.idMemberCreator = json.get("idMemberCreator").toString();        
        if(!json.isNull("data")){
            if(!json.getJSONObject("data").isNull("listAfter")){
                if(!json.getJSONObject("data").getJSONObject("listAfter").isNull("name")){ 
                    this.nameListAfter = json.getJSONObject("data").getJSONObject("listAfter").get("name").toString();
                }
                if(!json.getJSONObject("data").getJSONObject("listAfter").isNull("id")){ 
                    this.idListAfter = json.getJSONObject("data").getJSONObject("listAfter").get("id").toString();
                }
            }
            if(!json.getJSONObject("data").isNull("listBefore")){
                if(!json.getJSONObject("data").getJSONObject("listBefore").isNull("name")){ 
                    this.nameListBefore = json.getJSONObject("data").getJSONObject("listBefore").get("name").toString();
                }
                if(!json.getJSONObject("data").getJSONObject("listBefore").isNull("id")){
                    this.idListBefore = json.getJSONObject("data").getJSONObject("listBefore").get("id").toString();
                }
            }
            if(!json.getJSONObject("data").isNull("board")){
                if(!json.getJSONObject("data").getJSONObject("board").isNull("name")){ 
                    this.boardName = json.getJSONObject("data").getJSONObject("board").get("name").toString();
                }if(!json.getJSONObject("data").getJSONObject("board").isNull("id")) 
                    this.boardId = json.getJSONObject("data").getJSONObject("board").get("id").toString();
                if(!json.getJSONObject("data").getJSONObject("board").isNull("shortLink"))
                    this.boardShortLink = json.getJSONObject("data").getJSONObject("board").get("shortLink").toString();
            }
            if(!json.getJSONObject("data").isNull("card")){
                if(!json.getJSONObject("data").getJSONObject("card").isNull("shortLink")) 
                    this.cardShortLink = json.getJSONObject("data").getJSONObject("card").get("shortLink").toString();
                if(!json.getJSONObject("data").getJSONObject("card").isNull("idShort")) 
                    this.cardIdShort = json.getJSONObject("data").getJSONObject("card").get("idShort").toString();
                if(!json.getJSONObject("data").getJSONObject("card").isNull("name")) 
                    this.cardName = json.getJSONObject("data").getJSONObject("card").get("name").toString();
                if(!json.getJSONObject("data").getJSONObject("card").isNull("id")) 
                    this.cardId = json.getJSONObject("data").getJSONObject("card").get("id").toString();
                if(!json.getJSONObject("data").getJSONObject("card").isNull("due")) 
                    this.cardDue = getFormatDate(json.getJSONObject("data").getJSONObject("card").get("due").toString());
            }
        }
        if(!json.isNull("type")) this.type = json.get("type").toString();
        if(!json.isNull("date")) this.date = getFormatDate(json.get("date").toString());
        if(!json.isNull("memberCreator")){
            if(!json.getJSONObject("memberCreator").isNull("id")) 
               this.memberCreatorId = json.getJSONObject("memberCreator").get("id").toString();
            if(!json.getJSONObject("memberCreator").isNull("fullName")) 
                this.memberCreatorFullName = json.getJSONObject("memberCreator").get("fullName").toString();
            if(!json.getJSONObject("memberCreator").isNull("initials")) 
                this.memberCreatorInitials = json.getJSONObject("memberCreator").get("initials").toString();
            if(!json.getJSONObject("memberCreator").isNull("username")) 
                this.memberCreatorUsername = json.getJSONObject("memberCreator").get("username").toString();
        }
        if(!json.isNull("member")){
            if(!json.getJSONObject("member").isNull("id")) 
               this.memberId = json.getJSONObject("member").get("id").toString();
            if(!json.getJSONObject("member").isNull("avatarHash")) 
               this.memberAvatarHash = json.getJSONObject("member").get("avatarHash").toString();
            if(!json.getJSONObject("member").isNull("fullName")) 
               this.memberFullName = json.getJSONObject("member").get("fullName").toString();
            if(!json.getJSONObject("member").isNull("initials")) 
               this.memberInitials = json.getJSONObject("member").get("initials").toString();
            if(!json.getJSONObject("member").isNull("username")) 
               this.memberUsername = json.getJSONObject("member").get("username").toString();
        }
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
    public String getIdMemberCreator() {
        return idMemberCreator;
    }

    /**
     *
     * @param idMemberCreator
     */
    public void setIdMemberCreator(String idMemberCreator) {
        this.idMemberCreator = idMemberCreator;
    }

    /**
     *
     * @return
     */
    public String getBoardName() {
        return boardName;
    }

    /**
     *
     * @param boardName
     */
    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    /**
     *
     * @return
     */
    public String getBoardId() {
        return boardId;
    }

    /**
     *
     * @param boardId
     */
    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    /**
     *
     * @return
     */
    public String getBoardShortLink() {
        return boardShortLink;
    }

    /**
     *
     * @param boardShortLink
     */
    public void setBoardShortLink(String boardShortLink) {
        this.boardShortLink = boardShortLink;
    }

    /**
     *
     * @return
     */
    public String getCardShortLink() {
        return cardShortLink;
    }

    /**
     *
     * @param cardShortLink
     */
    public void setCardShortLink(String cardShortLink) {
        this.cardShortLink = cardShortLink;
    }

    /**
     *
     * @return
     */
    public String getCardIdShort() {
        return cardIdShort;
    }

    /**
     *
     * @param cardIdShort
     */
    public void setCardIdShort(String cardIdShort) {
        this.cardIdShort = cardIdShort;
    }

    /**
     *
     * @return
     */
    public String getCardName() {
        return cardName;
    }

    /**
     *
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     *
     * @return
     */
    public String getCardId() {
        return cardId;
    }

    /**
     *
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     *
     * @return
     */
    public Date getCardDue() {
        return cardDue;
    }

    /**
     *
     * @param cardDue
     */
    public void setCardDue(Date cardDue) {
        this.cardDue = cardDue;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public String getMemberCreatorId() {
        return memberCreatorId;
    }

    /**
     *
     * @param memberCreatorId
     */
    public void setMemberCreatorId(String memberCreatorId) {
        this.memberCreatorId = memberCreatorId;
    }

    /**
     *
     * @return
     */
    public String getMemberCreatorFullName() {
        return memberCreatorFullName;
    }

    /**
     *
     * @param memberCreatorFullName
     */
    public void setMemberCreatorFullName(String memberCreatorFullName) {
        this.memberCreatorFullName = memberCreatorFullName;
    }

    /**
     *
     * @return
     */
    public String getMemberCreatorInitials() {
        return memberCreatorInitials;
    }

    /**
     *
     * @param memberCreatorInitials
     */
    public void setMemberCreatorInitials(String memberCreatorInitials) {
        this.memberCreatorInitials = memberCreatorInitials;
    }

    /**
     *
     * @return
     */
    public String getMemberCreatorUsername() {
        return memberCreatorUsername;
    }

    /**
     *
     * @param memberCreatorUsername
     */
    public void setMemberCreatorUsername(String memberCreatorUsername) {
        this.memberCreatorUsername = memberCreatorUsername;
    }

    /**
     *
     * @return
     */
    public String getNameListAfter() {
        return nameListAfter;
    }

    /**
     *
     * @param nameListAfter
     */
    public void setNameListAfter(String nameListAfter) {
        this.nameListAfter = nameListAfter;
    }

    /**
     *
     * @return
     */
    public String getIdListAfter() {
        return idListAfter;
    }

    /**
     *
     * @param idListAfter
     */
    public void setIdListAfter(String idListAfter) {
        this.idListAfter = idListAfter;
    }

    /**
     *
     * @return
     */
    public String getNameListBefore() {
        return nameListBefore;
    }

    /**
     *
     * @param nameListBefore
     */
    public void setNameListBefore(String nameListBefore) {
        this.nameListBefore = nameListBefore;
    }

    /**
     *
     * @return
     */
    public String getIdListBefore() {
        return idListBefore;
    }

    /**
     *
     * @param idListBefore
     */
    public void setIdListBefore(String idListBefore) {
        this.idListBefore = idListBefore;
    }

    /**
     *
     * @return
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     *
     * @param memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     *
     * @return
     */
    public String getMemberAvatarHash() {
        return memberAvatarHash;
    }

    /**
     *
     * @param memberAvatarHash
     */
    public void setMemberAvatarHash(String memberAvatarHash) {
        this.memberAvatarHash = memberAvatarHash;
    }

    /**
     *
     * @return
     */
    public String getMemberFullName() {
        return memberFullName;
    }

    /**
     *
     * @param memberFullName
     */
    public void setMemberFullName(String memberFullName) {
        this.memberFullName = memberFullName;
    }

    /**
     *
     * @return
     */
    public String getMemberInitials() {
        return memberInitials;
    }

    /**
     *
     * @param memberInitials
     */
    public void setMemberInitials(String memberInitials) {
        this.memberInitials = memberInitials;
    }

    /**
     *
     * @return
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     *
     * @param memberUsername
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Override
    public String toString() {
        String string;
        string = "id: " + this.id + "\n";
        
        if(this.idMemberCreator != null) string += "idMemberCreator : " + this.idMemberCreator + "\n";
        if(this.nameListAfter != null) string += "nameListAfter : " + this.nameListAfter + "\n";
        if(this.idListAfter != null) string += "idListAfter : " + this.idListAfter + "\n";
        if(this.nameListBefore != null) string += "nameListBefore : " + this.nameListBefore + "\n";
        if(this.idListBefore != null) string += "idListBefore : " + this.idListBefore + "\n";
        if(this.boardName != null) string += "boardName : " + this.boardName + "\n";
        if(this.boardId != null) string += "boardId : " + this.boardId + "\n";
        if(this.boardShortLink != null) string += "boardShortLink : " + this.boardShortLink + "\n";
        if(this.cardShortLink != null) string += "cardShortLink : " + this.cardShortLink + "\n";
        if(this.cardIdShort != null) string += "cardIdShort : " + this.cardIdShort + "\n";
        if(this.cardName != null) string += "cardName : " + this.cardName + "\n";
        if(this.cardId != null) string += "cardId : " + this.cardId + "\n";
        if(this.cardDue != null) string += "cardDue : " + this.cardDue + "\n";
        if(this.type != null) string += "type : " + this.type + "\n";
        if(this.date != null) string += "date : " + this.date + "\n";
        if(this.memberCreatorId != null) string += "memberCreatorId : " + this.memberCreatorId + "\n";
        if(this.memberCreatorFullName != null) string += "memberCreatorFullName : " + this.memberCreatorFullName + "\n";
        if(this.memberCreatorInitials != null) string += "memberCreatorInitials : " + this.memberCreatorInitials + "\n";
        if(this.memberId != null) string += "memberCreatorUsername : " + this.memberCreatorUsername + "\n";
        if(this.memberId != null) string += "memberId : " + this.memberId + "\n";
        if(this.memberAvatarHash != null) string += "memberAvatarHash : " + this.memberAvatarHash + "\n";
        if(this.memberFullName != null) string += "memberFullName : " + this.memberFullName + "\n";
        if(this.memberInitials != null) string += "memberInitials : " + this.memberInitials + "\n";
        if(this.memberUsername != null) string += "memberUsername : " + this.memberUsername + "\n";
    
        return string;
    }
    
    
    
}
