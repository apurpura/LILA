
package com.example.apurpura.lifenavhelperapi;


/**
 * Created by apurpura on 5/30/2017.
 */


import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class RefreshCredentialsService  extends Service {
    private static Context mContext;
    public RefreshCredentialsService(){
        mContext = this;
    }


    public static void refreshCredentials(){
        if(mContext == null){
            new RefreshCredentialsService();
        }
        if(Credentials.signonActivity == null)
            Credentials.signonActivity = new SigningOnActivity();

        Credentials.signonActivity.refreshCalendarService(mContext);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}


