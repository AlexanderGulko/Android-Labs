package ua.opu.pnit.Lab_6_7;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import ua.opu.pnit.Lab_6_7.model.Note;
import ua.opu.pnit.Lab_6_7.repository.AppRepository;

public class NoteViewModel extends AndroidViewModel {

    private AppRepository repository;

    public NoteViewModel(@NonNull Application application) {
        super(application);

        repository = AppRepository.getInstance(application);
    }

    public Note getNoteById(int note_id) {
        return repository.getNoteById(note_id);
    }

    public void insertNote(Note note) {
        repository.insertNote(note);
    }
}
