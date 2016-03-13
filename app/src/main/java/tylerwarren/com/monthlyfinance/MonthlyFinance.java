package tylerwarren.com.monthlyfinance;

import com.firebase.client.Firebase;

/**
 * Created by tyfig on 3/12/2016.
 */
public class MonthlyFinance  extends  android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
