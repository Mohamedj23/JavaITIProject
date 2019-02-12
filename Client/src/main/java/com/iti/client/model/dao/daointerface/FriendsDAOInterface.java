/*
 * This an interface representing the CRUD operations done on the friends table in the DB.
 */
package chatserver.model.dao.daointerface;

/**
 *
 * @author Mohamed Jamal
 */
public interface FriendsDAOInterface {
    
    public boolean addFriend();
    //Will retrieve iserId from the FriedList Table and then retrieve User profile from the User Table
    public boolean retrieveFriend();
    public boolean deleteFriend();
}
