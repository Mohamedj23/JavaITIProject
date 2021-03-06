/*
  This an interface representing the CRUD operations done on the requests table in the DB.
 */
package chatserver.model.dao.daointerface;

/**
 *
 * @author Mohamed Jamal
 */
public interface RequestsDAOInterface {
    public boolean addFriendRequest();
    public boolean retrieveFriendRequest();
}
