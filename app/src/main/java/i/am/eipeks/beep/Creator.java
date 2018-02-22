package i.am.eipeks.beep;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;


public class Creator implements JobCreator {

    @Nullable
    @Override
    public Job create(@NonNull String tag) {
        switch (tag){
            case BeepJob.TAG:
                return new BeepJob();
            default:
                return null;
        }
    }
}
