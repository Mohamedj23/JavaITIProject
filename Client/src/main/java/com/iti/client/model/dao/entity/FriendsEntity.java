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
public class FriendsEntity {
    private String userPhoneNumber;
    private String friendPhoneNumber;

    public FriendsEntity() {
    }

    public FriendsEntity(String userPhoneNumber, String friendPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        this.friendPhoneNumber = friendPhoneNumber;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getFriendPhoneNumber() {
        return friendPhoneNumber;
    }

    public void setFriendPhoneNumber(String friendPhoneNumber) {
        this.friendPhoneNumber = friendPhoneNumber;
    }

    @Override
    public String toString() {
        return "FriendsEntity{" + "userPhoneNumber=" + userPhoneNumber + ", friendPhoneNumber=" + friendPhoneNumber + '}';
    }
    
}
