package com.example.praktikumroom.ui;

public class NoteInsertUpdateViewModel {
    private final NoteRepository mNoteRepository;
    public NoteInsertUpdateViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    public void insert(Note note) {
        mNoteRepository.insert(note);
    }
    public void update(Note note) {
        mNoteRepository.update(note);
    }
    public void delete(Note note) {
        mNoteRepository.delete(note);
    }
}