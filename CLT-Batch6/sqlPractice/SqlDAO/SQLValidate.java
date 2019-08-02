package SqlDAO;

import java.util.List;

import Properties.DataUser;

public interface SQLValidate {
	
	public void addPerson(DataUser pRef);
	
	public void updatePerson(DataUser pRef);
	
	public List<DataUser> ListPerson();
	
	public void getPersonById (int id);
	
	public void removePerson(int id);
}
