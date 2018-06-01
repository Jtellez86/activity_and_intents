package joel.tellez.com.activitiesandintents.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import joel.tellez.com.activitiesandintents.R;


public class StandardActivity extends BaseActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, StandardActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_standard);
    }
}
