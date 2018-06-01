package joel.tellez.com.activitiesandintents.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import joel.tellez.com.activitiesandintents.R;

public class MainActivity extends AppCompatActivity {

    private Button standardButton;
    private Button singleTopButton;
    private Button singleTaskButton;
    private Button singleInstanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        standardButton = findViewById(R.id.standardButton);
        singleTopButton = findViewById(R.id.singleTopButton);
        singleTaskButton = findViewById(R.id.singleTaskButton);
        singleInstanceButton = findViewById(R.id.singleInstanceButton);


        standardButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(StandardActivity.createIntent(getApplicationContext()));
            }
        });

        singleTopButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SingleTopActivity.createIntent(getApplicationContext()));
            }
        });

        singleTaskButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SingleTaskActivity.createIntent(getApplicationContext()));
            }
        });

        singleInstanceButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SingleInstanceActivity.createIntent(getApplicationContext()));
            }
        });
    }
}
