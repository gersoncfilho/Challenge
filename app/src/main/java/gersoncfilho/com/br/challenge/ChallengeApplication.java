package gersoncfilho.com.br.challenge;

import android.app.Application;
import android.util.Log;

/**
 * Created by gersoncardoso on 28/09/2016.
 */

public class ChallengeApplication extends Application {

    private static final String TAG = "ChallengeApplication";

    private static  ChallengeApplication instance = null;

    public static ChallengeApplication getInstance()
    {
        return instance;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "ChallengeApplication.onCreate()");
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "ChallengeApplication.onTerminate()");
    }
}
