package com.example.madlevel5task1

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository =  NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()

}
