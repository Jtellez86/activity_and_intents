package joel.tellez.com.activitiesandintents.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import joel.tellez.com.activitiesandintents.R;

public class SingleTaskActivity extends BaseActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, SingleTopActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
    }
}
