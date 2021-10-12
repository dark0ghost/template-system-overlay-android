package org.dark0ghost.template_on_top_of_applications

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import org.dark0ghost.template_on_top_of_applications.service.ButtonService


class MainActivity : AppCompatActivity() {
    private lateinit var service: Intent

    private fun initializeView() {
        // Set and initialize the view elements
        startService(service)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        service = Intent(this, ButtonService::class.java)
        service.flags = FLAG_ACTIVITY_NEW_TASK
        if (!Settings.canDrawOverlays(this)) {
            val intent = Intent(
                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:$packageName")
            )
            startActivity(intent)
            return
        }
        initializeView()
    }

    override fun onDestroy() {
        stopService(service)
        super.onDestroy()
    }
}