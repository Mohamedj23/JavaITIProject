/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.model.dao.entity;

/**
 *
 * @author Mohamed Jamal
 */
public class RequestsEntity {
    private String senderPhoneNumber;
    private String recieverPhoneNumber;

    public RequestsEntity() {
    }

    public RequestsEntity(String senderPhoneNumber, String recieverPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
        this.recieverPhoneNumber = recieverPhoneNumber;
    }

    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String getRecieverPhoneNumber() {
        return recieverPhoneNumber;
    }

    public void setRecieverPhoneNumber(String recieverPhoneNumber) {
        this.recieverPhoneNumber = recieverPhoneNumber;
    }

    @Override
    public String toString() {
        return "RequestsEntity{" + "senderPhoneNumber=" + senderPhoneNumber + ", recieverPhoneNumber=" + recieverPhoneNumber + '}';
    }
    
    
}
