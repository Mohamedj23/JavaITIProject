/*
 *  This an interface representing the CRUD operations done on the user table in the DB.
 */
package chatserver.model.dao.daointerface;

/**
 *
 * @author Mohamed Jamal
 */
public interface UserDAOInterface {
    
    public boolean addUser();
    public boolean retrieveUser();
    public boolean updateUser();
    public boolean deleteUser();
    
}
