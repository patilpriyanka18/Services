package com.example.pc.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

/**
 * Created by PC on 06/05/2018.
 */
class MyService:Service() {
    var mp:MediaPlayer?=null
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //mp=MediaPlayer.create(this@MyService,R.raw.my)
        mp=MediaPlayer.create(this@MyService,R.raw.my)
        mp?.start()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onBind(intent: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        throw UnsupportedOperationException("Not yet implemented")

    }

    override fun onDestroy() {
       // mp?.stop()
        mp?.stop()
        mp?.release()
        super.onDestroy()
    }

}