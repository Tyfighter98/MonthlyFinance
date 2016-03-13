package tylerwarren.com.monthlyfinance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

public class TransactionsActivity extends AppCompatActivity {

    Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract);
    }

    protected void onStart() {
        super.onStart();
        mRef = new Firebase("https://scorching-inferno-4119.firebaseio.com/");
    }
}
