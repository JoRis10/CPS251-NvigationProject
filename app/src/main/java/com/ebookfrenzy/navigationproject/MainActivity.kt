package com.ebookfrenzy.navigationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.ImageView

class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun onFragmentInteraction(uri: Uri) {
    }

}