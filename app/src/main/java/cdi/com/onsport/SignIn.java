package cdi.com.onsport;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import cdi.com.onsport.MyContext.UserHandler;

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

        EditText email = (EditText) findViewById(R.id.email);
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

                    Intent intent = new Intent(SignIn.this, Home.class);
                    //Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle();
                    //startActivity(intent, bundle);

                    MyExterneServices login = new MyExterneServices();
                    Utilisateur  utilisateur = login.authenticate(Email, Password);
                    if (utilisateur != null ) {
                        UserHandler.getInstance().setUser(utilisateur);
                        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle();
                        startActivity(intent, bundle);

                    } else {
                        TransitionManager.beginDelayedTransition(TransitionContainer);
                        loginError.setVisibility(View.VISIBLE);
                    }

            }
        });





    }
}
