package com.example.praktikumroom.repository;

public class NoteRepository {
    private final DAONote mDaoNotes;
    private final ExecutorService executorService;
    public NoteRepository(Application application) {
        executorService = Executors.newSingleThreadExecutor();
        NoteRoomDB db = NoteRoomDB.getDatabase(application);
        mDaoNotes = db.daoNote();
    }
    public LiveData<List<Note>> getAllNotes() {
        return mDaoNotes.getAllNotes();
    }
    public void insert(final Note note) {
        executorService.execute(() -> mDaoNotes.insert(note));
    }
    public void delete(final Note note){
        executorService.execute(() -> mDaoNotes.delete(note));
    }
    public void update(final Note note){
        executorService.execute(() -> mDaoNotes.update(note));
    }
}