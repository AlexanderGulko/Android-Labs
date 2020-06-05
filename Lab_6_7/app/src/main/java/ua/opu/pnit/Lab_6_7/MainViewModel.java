package ua.opu.pnit.Lab_6_7;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import ua.opu.pnit.Lab_6_7.model.Note;
import ua.opu.pnit.Lab_6_7.repository.AppRepository;

public class MainViewModel extends AndroidViewModel {

    private AppRepository repository;

    public MainViewModel(@NonNull Application application) {
        super(application);

        repository = AppRepository.getInstance(application);
    }

    public void deleteNote(int note_id) {
        repository.deleteNoteById(note_id);
    }

    public LiveData<List<Note>> getData() {
        return repository.getAllNotes();
    }
}
