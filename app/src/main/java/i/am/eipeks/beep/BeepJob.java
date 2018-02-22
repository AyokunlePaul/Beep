package i.am.eipeks.beep;

import android.support.annotation.NonNull;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobRequest;


public class BeepJob extends Job {

    public static final String TAG = "beep_job";

    @NonNull
    @Override
    protected Result onRunJob(@NonNull Params params) {
        scheduleBeep();
        return Result.SUCCESS;
    }

    private static void scheduleBeep(){
        new JobRequest.Builder(BeepJob.TAG)
                .setExecutionWindow(30_000L, 40_000L)
                .build().schedule();
    }

}
