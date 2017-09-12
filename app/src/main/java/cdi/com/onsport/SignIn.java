package cdi.com.onsport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    ViewGroup TransitionContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);



        Slide slideOut = new Slide(Gravity.LEFT);
        getWindow().setExitTransition(slideOut);
        Slide slideIn = new Slide(Gravity.RIGHT);
        getWindow().setEnterTransition(slideIn);

        EditText email = (EditText) findViewById(R.id.emailUser);
        EditText dateNaissance = (EditText) findViewById(R.id.dateNaissance);
        EditText password = (EditText) findViewById(R.id.password);
        EditText password2 = (EditText) findViewById(R.id.password2);
        EditText codePostal = (EditText) findViewById(R.id.CodePostal);
        EditText ville = (EditText) findViewById(R.id.Ville);

        final String Email = email.getText().toString();
        final String Date = dateNaissance.getText().toString();
        final String Password = password.getText().toString();
        final String Password2 = password2.getText().toString();
        final String CodePostal = codePostal.getText().toString();
        final String Ville = ville.getText().toString();

        Button signUp = (Button) findViewById(R.id.SignUp);
        signUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


            }
        });





    }
}
