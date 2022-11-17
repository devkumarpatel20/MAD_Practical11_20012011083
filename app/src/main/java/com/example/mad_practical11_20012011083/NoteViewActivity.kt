package com.example.mad_practical11_20012011083

import androidx.appcompat.app.AppCompatActivity
import com.example.mad_practical11_20012011083.databinding.ActivityNoteViewBinding
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.WindowCompat


class NoteViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoteViewBinding
    private lateinit var note:Note
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        note = intent.getSerializableExtra("Object") as Note
        binding = ActivityNoteViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        with(note){
            binding.noteTitle.text = this.title
            binding.noteSubtitle.text = this.subTitle
            binding.noteContent.text = this.Description
            binding.noteDate.text = this.modifiedTime
            this.calcReminder()
            if(this.isReminder)
            {
                binding.noteReminderDateTime.visibility = View.VISIBLE
                binding.noteReminderDateTime.text = this.getReminderText()
            }
            else
                binding.noteReminderDateTime.visibility = View.GONE
        }
    }
}