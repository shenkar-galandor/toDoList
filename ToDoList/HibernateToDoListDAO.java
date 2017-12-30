package ToDoList;

public class HibernateToDoListDAO implements IToDoListDAO {
	private static HibernateToDoListDAO instance = null;
	protected HibernateToDoListDAO() {};
	
	   public static HibernateToDoListDAO getInstance() {
		      if(instance == null) {
		         instance = new HibernateToDoListDAO();
		      }
		      return instance;
		   }
	   
	
	public void addNewItem(int userId) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeItem(int userId, int itemId) {
		// TODO Auto-generated method stub
		
	}

	
	public void updateItem(int userId, int Itemid) {
		// TODO Auto-generated method stub
		
	}

}
