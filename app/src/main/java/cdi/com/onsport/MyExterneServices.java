package cdi.com.onsport;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrateur on 11/09/2017.
 */

public class MyExterneServices implements IService {
    protected boolean prod;
    protected ClientWS cws;
    public MyExterneServices(boolean prod){
        this.prod=prod;
    }
    @Override
    public Utilisateur authenticate(String email, String password) {
        if(!prod) {
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setId(1);
            utilisateur.setPseudo("toto");
            utilisateur.setMail("toto@mail.com");
            utilisateur.setMotdepasse("1234");
            utilisateur.setDatedenaissance(new Date("now"));
            utilisateur.setVille("Lille");
            utilisateur.setCp("59000");
            if (email.equals(utilisateur.getMail()) && password.equals(utilisateur.getMotdepasse())) {
                return utilisateur;
            } else {
                return null;
            }
        }else
        {

            return null;
        }

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
