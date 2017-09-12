package cdi.com.onsport.userAccount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cdi.com.onsport.MyContext.UserHandler;
import cdi.com.onsport.R;

public class MonCompte extends AppCompatActivity {
    TextView Email;
    String email;
  /*  TextView ddn;
    Date dateNaissance;*/
    TextView textViewPPseudo;
    String pseudo ;
    TextView textViewVVille;
    String ville;
    TextView textViewCCP;
    String ccp;
    TextView textViewCComm;
    String comm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_compte);

        //commentaire
        textViewCComm = (TextView) findViewById(R.id.textViewCComm);
        comm = UserHandler.getInstance().getUser().getCommentaire();
        textViewCComm.setText(comm);
        // code postal
        textViewCCP = (TextView)findViewById(R.id.textViewCCP);
        ccp = UserHandler.getInstance().getUser().getCp();
        textViewCCP.setText(ccp);
        //pseudo
        textViewPPseudo = (TextView)findViewById(R.id.textViewPPseudo);
        pseudo =  UserHandler.getInstance().getUser().getPseudo();
        textViewPPseudo.setText(pseudo);
        //ville
        textViewVVille = (TextView) findViewById(R.id.textViewVVille);
        ville = UserHandler.getInstance().getUser().getVille();
        textViewVVille.setText(ville);
        // email
        Email = (TextView)findViewById(R.id.Mail);
        email =  UserHandler.getInstance().getUser().getMail();
        Email.setText(email);

      /*  ddn = (EditText)findViewById(R.id.dateNaissance);
        dateNaissance = UserHandler.getInstance().getUser().getDatedenaissance();
        ddn.setText(dateNaissance.format("dd/MM/yyyy ", dateNaissance).toString());*/

    }

}
