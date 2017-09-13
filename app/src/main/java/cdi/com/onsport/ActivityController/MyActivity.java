package cdi.com.onsport.ActivityController;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cdi.com.onsport.Activites;
import cdi.com.onsport.Home;
import cdi.com.onsport.MyExterneServices;
import cdi.com.onsport.R;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        Intent intent = getIntent();
        if (intent != null) {
            int id = intent.getIntExtra("id", 0);
            MyExterneServices activity = new MyExterneServices(false);
            Activites thisactivity = activity.getActivity(id);
            setDisplay(thisactivity);
        }






        final ImageView home = (ImageView) findViewById(R.id.homeLink);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, Home.class);
                Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(MyActivity.this).toBundle();
                startActivity(intent, bundle);


            }
        });




    }

    private void setDisplay(Activites thisactivity) {
        TextView activityType,lieu, date, commentaire, nbrparticipants, maxpartipants;

        activityType = (TextView) findViewById(R.id.activityType);
        lieu = (TextView) findViewById(R.id.lieu);
        date = (TextView) findViewById(R.id.date);
        commentaire = (TextView) findViewById(R.id.commentaire);
        nbrparticipants = (TextView) findViewById(R.id.nbrparticipants);
        maxpartipants = (TextView) findViewById(R.id.maxpartipants);

        activityType.setText(thisactivity.getActivite());
        lieu.setText(thisactivity.getLieu());
        date.setText(thisactivity.getDate_debut().toString());
        commentaire.setText(thisactivity.getMessages());
        nbrparticipants.setText(thisactivity.getListe_participants());
        maxpartipants.setText(Integer.toString(thisactivity.getNbr_participants()));

    }


}
