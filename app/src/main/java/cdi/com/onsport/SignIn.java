package cdi.com.onsport;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

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
        final EditText dateNaissance = (EditText) findViewById(R.id.dateNaissance);
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

        /****************** OnClick EditText date de naissance ***************************/
        //calendrier

        dateNaissance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                DatePickerDialog datePickerDialog = new DatePickerDialog(SignIn.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                dateNaissance.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);

                datePickerDialog.show();
            }
        });
        /********************** fin onclick date de naissance *************************************/


        Button signUp = (Button) findViewById(R.id.SignUp);
        signUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


            }
        });





    }
}
