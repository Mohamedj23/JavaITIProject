package com.iti.commonservices.serviceinterface;

import com.iti.commonservices.entity.Message;
import com.iti.commonservices.entity.User;
import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author AmrHesham
 */
public interface ServerServiceInterface extends Remote {

    public boolean connectToDatabase();

    public boolean login(String phone, String password) throws RemoteException;

    public boolean register(User user) throws RemoteException;

    //chat session msh 3arfen da a asln
    public void sendMessage(Message message);

    //public void sendFile(File file);
    public void updateProfile(User user);

    public void notifyStatus(User user);

    public User addNewContact(String phoneNumber);

}
