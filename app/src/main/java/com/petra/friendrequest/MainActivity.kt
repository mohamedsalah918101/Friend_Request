package com.petra.friendrequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val acceptButton: Button = findViewById(R.id.acceptButton)
        val ignoreButton: Button = findViewById(R.id.ignoreButton)
        val friendRequestFragment : Fragment = FriendRequestFragment()
        val ignore : Fragment = Ignore()

        acceptButton.setOnClickListener()
        {
            val FragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()
            FragmentTransaction.replace(R.id.nav_container,friendRequestFragment).commit()
        }
        ignoreButton.setOnClickListener()
        {
            val FragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()
            FragmentTransaction.replace(R.id.nav_container,ignore).commit()
        }

    }
}