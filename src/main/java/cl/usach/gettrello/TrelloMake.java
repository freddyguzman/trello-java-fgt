/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.gettrello;

import cl.usach.elements.*;
import cl.usach.request.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import org.json.JSONException;

/**
 *
 * @author FGT
 */
public class TrelloMake implements Trello {
    
    AppTrello appTrello = new AppTrello();    
    
    public void setConfigTrello(String KEY, String SECRET, String TOKEN){
        this.appTrello.setKEY(KEY);
        this.appTrello.setSECRET(SECRET);
        this.appTrello.setTOKEN(TOKEN);
    }    
    
    /* ---------------- Funciones BoardMethods ----------------*/

    /**
     *
     * @param idBoard
     * @return
     * @throws IOException
     * @throws JSONException
     */
    
    
    public BoardElem getBoard(String idBoard) throws IOException, JSONException{
        BoardMethods  board = new BoardMethods(appTrello);
        BoardElem boardElem =  board.getBoard(idBoard);
        return boardElem;
    }
    
    /**
     *
     * @param idAction
     * @return
     * @throws IOException
     */
    public BoardElem getBoardByIdAction(String idAction) throws IOException{
        BoardMethods  board = new BoardMethods(appTrello);
        BoardElem boardElem =  board.getBoardByIdAction(idAction);
        return boardElem;
    }
    
    /**
     *
     * @param idCard
     * @return
     * @throws IOException
     */
    public BoardElem getBoardByIdCard(String idCard) throws IOException{
        BoardMethods  board = new BoardMethods(appTrello);
        BoardElem boardElem =  board.getBoardByIdCard(idCard);
        return boardElem;
    }
    
    /**
     *
     * @param idList
     * @return
     * @throws IOException
     */
    public BoardElem getBoardByIdList(String idList) throws IOException{
        BoardMethods  board = new BoardMethods(appTrello);
        BoardElem boardElem =  board.getBoardByIdList(idList);
        return boardElem;
    }
    
    /**
     *
     * @param idMember
     * @return
     * @throws IOException
     */
    public List<BoardElem> getBoardsByIdMember(String idMember) throws IOException{
        BoardMethods board = new BoardMethods(appTrello);
        List<BoardElem> boardElems = board.getBoardsByIdMember(idMember);
        return boardElems;
    }
    
    /* ---------------- Funciones ActionMethods ----------------*/

    /**
     *
     * @param idBoard
     * @return
     * @throws IOException
     * @throws JSONException
     * @throws ParseException
     */
    
    
    public List<ActionElement> getActions(String idBoard) throws IOException, JSONException, ParseException{
        ActionMethods action = new ActionMethods(appTrello);
        List<ActionElement> actionElements = action.getActions(idBoard);
        return actionElements;
    }
    
    /**
     *
     * @param idAction
     * @return
     * @throws IOException
     * @throws JSONException
     * @throws ParseException
     */
    public ActionElement getAction(String idAction) throws IOException, JSONException, ParseException{
        ActionMethods action = new ActionMethods(appTrello);
        ActionElement actionElement = action.getAction(idAction);
        return actionElement;
    }
    
    /**
     *
     * @param idCard
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public List<ActionElement> getActionsByIdCard(String idCard) throws IOException, ParseException{
        ActionMethods action = new ActionMethods(appTrello);
        List<ActionElement> actionElements = action.getActionsByIdCard(idCard);
        return actionElements;
    }
    
    /**
     *
     * @param idList
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public List<ActionElement> getActionsByIdList(String idList) throws IOException, ParseException{
        ActionMethods action = new ActionMethods(appTrello);
        List<ActionElement> actionElements = action.getActionsByIdList(idList);
        return actionElements;
    }
    
    /**
     *
     * @param idMember
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public List<ActionElement> getActionsByIdMember(String idMember) throws IOException, ParseException{
        ActionMethods action = new ActionMethods(appTrello);
        List<ActionElement> actionElements = action.getActionsByIdMember(idMember);
        return actionElements;
    }
    
    /* ---------------- Funciones CardMethods ----------------*/

    /**
     *
     * @param idBoard
     * @return
     * @throws IOException
     * @throws ParseException
     */
    
    
    public List<CardElement> getCards(String idBoard) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        List<CardElement> cardElements = card.getCards(idBoard);
        return cardElements;
    }
    
    /**
     *
     * @param idBoard
     * @param idCard
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public CardElement getCard(String idBoard, String idCard) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        CardElement cardElement = card.getCard(idBoard, idCard);
        return cardElement;
    }
    
    /**
     *
     * @param idBoard
     * @param idMember
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public List<CardElement> getCards(String idBoard, String idMember) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        List<CardElement> cardElements = card.getCards(idBoard,idMember);
        return cardElements;
    }
    
    /**
     *
     * @param idAction
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public CardElement getCardByIdAction(String idAction) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        CardElement cardElement = card.getCardByIdAction(idAction);
        return cardElement;
    }
    
    /**
     *
     * @param idCard
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public CardElement getCard(String idCard) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        CardElement cardElement = card.getCard(idCard);
        return cardElement;        
    }
    
    /**
     *
     * @param idList
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public List<CardElement> getCardsByIdList(String idList) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        List<CardElement> cardElements = card.getCardsByIdList(idList);
        return cardElements;
    }
    
    /**
     *
     * @param idMember
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public List<CardElement> getCardsByIdMember(String idMember) throws IOException, ParseException{
        CardMethods card = new CardMethods(appTrello);
        List<CardElement> cardElements = card.getCardsByIdMember(idMember);
        return cardElements;
    }
    /* ---------------- Funciones List ----------------*/

    /**
     *
     * @param idBoard
     * @return
     * @throws IOException
     */    
    public List<ListElement> getLists(String idBoard) throws IOException{
        ListMethods listMethods = new ListMethods(appTrello);
        List<ListElement> listElements = listMethods.getLists(idBoard);
        return listElements;
    }
    
    /**
     *
     * @param idCard
     * @return
     * @throws IOException
     */
    public ListElement getListByIdCard(String idCard) throws IOException{
        ListMethods listMethods = new ListMethods(appTrello);
        ListElement listElement = listMethods.getListByIdCard(idCard);
        return listElement;
    }
    
    /**
     *
     * @param idList
     * @return
     * @throws IOException
     */
    public ListElement getList(String idList) throws IOException{
        ListMethods listMethods = new ListMethods(appTrello);
        ListElement listElement = listMethods.getList(idList);
        return listElement;
    }
    
    /* ---------------- Funciones Memeber ----------------*/

    /**
     *
     * @param idBoard
     * @return
     * @throws IOException
     */
    
    
    public List<MemberElement> getMembers (String idBoard) throws IOException{
        MemberMethods memberMethods = new MemberMethods(appTrello);
        List<MemberElement> memberElements = memberMethods.getMembers(idBoard);
        return memberElements;
    }
    
    /**
     *
     * @param idAction
     * @return
     * @throws IOException
     */
    public MemberElement getMemberCreator(String idAction) throws IOException{
        MemberMethods memberMethods = new MemberMethods(appTrello);
        MemberElement memberElement = memberMethods.getMemberCreator(idAction);
        return memberElement;
    }
    
    /**
     *
     * @param idCard
     * @return
     * @throws IOException
     */
    public List<MemberElement> getMembersByIdCard (String idCard) throws IOException{
        MemberMethods memberMethods = new MemberMethods(appTrello);
        List<MemberElement> memberElements = memberMethods.getMembersByIdCard(idCard);
        return memberElements;
    }
    
    /**
     *
     * @param idMember
     * @return
     * @throws IOException
     */
    public MemberElement getMember(String idMember) throws IOException{
        MemberMethods memberMethods = new MemberMethods(appTrello);
        MemberElement memberElement = memberMethods.getMember(idMember);
        return memberElement;
    }
}
