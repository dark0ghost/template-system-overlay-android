package org.dark0ghost.template_on_top_of_applications.service

import android.app.Service
import android.content.Intent
import android.graphics.PixelFormat
import android.os.IBinder
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.RelativeLayout
import org.dark0ghost.template_on_top_of_applications.R
import org.dark0ghost.template_on_top_of_applications.settings.AppSettings


class ButtonService: Service() {

    private lateinit var  windowManager: WindowManager
    private lateinit var params: WindowManager.LayoutParams
    private lateinit var topView: RelativeLayout
    private lateinit var button: Button
    private lateinit var edge: View

    override fun onCreate() {
        super.onCreate();
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager

        topView = LayoutInflater.from(this).inflate(R.layout.revolt, null) as RelativeLayout
        topView.visibility = View.VISIBLE
        button = topView.findViewById(R.id.grub)
        params = WindowManager.LayoutParams(
            AppSettings.width,
            AppSettings.height,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.RGBA_F16
        )
        params.x = 10
        params.y = 500 // service position
        params.gravity = Gravity.TOP or Gravity.END
        windowManager.addView(topView, params)

        button.setOnClickListener{ _ ->
            println("click")
        }

    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        windowManager.removeView(topView)
        windowManager.removeView(edge)
    }
}