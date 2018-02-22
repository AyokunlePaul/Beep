package i.am.eipeks.beep;


import android.app.Application;

import com.evernote.android.job.JobManager;

public class RootApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        JobManager.create(this).addJobCreator(new Creator());
    }
}
