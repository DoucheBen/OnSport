package cdi.com.onsport;

import java.util.Date;
import java.util.List;

public interface IService {

	Utilisateur authenticate(String email, String password);
	
	Utilisateur register(Utilisateur utilisateur);
	
	List<Activites> getListActivity(String codepostal, Date debut, Date fin);
	
	List<Activites> getListActivity(String codepostal, Date debut, Date fin, Integer num);

	Activites getActivity(int id);

	
}
