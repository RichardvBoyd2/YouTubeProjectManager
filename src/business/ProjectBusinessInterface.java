package business;

import java.util.ArrayList;
import javax.ejb.Local;
import beans.Project;

@Local
public interface ProjectBusinessInterface {
	
	public int deleteOne(int d);
	public int insertOne(Project b);
	public ArrayList<Project> readAll();
	public int updateOne(int d, Project b);
	
}
