package cdi.com.onsport;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrateur on 11/09/2017.
 */

public class MyExterneServices implements IService {
    @Override
    public Utilisateur authenticate(String email, String password) {
        return null;
    }

    @Override
    public Utilisateur register(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Activites> getListActivity(String codepostal, Date debut, Date fin) {
        return null;
    }

    @Override
    public List<Activites> getListActivity(String codepostal, Date debut, Date fin, Integer num) {
        return null;
    }
}