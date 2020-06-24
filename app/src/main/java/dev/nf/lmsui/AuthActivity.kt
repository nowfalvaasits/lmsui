package dev.nf.lmsui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.distribute.Distribute





class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        AppCenter.start(
            application, "10116e51-af94-4acf-a814-c58af5a83a3c",
            Analytics::class.java, Crashes::class.java
        )
        AppCenter.start(application, "10116e51-af94-4acf-a814-c58af5a83a3c", Distribute::class.java)
    }
}