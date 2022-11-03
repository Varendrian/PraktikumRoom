package com.example.praktikumroom.database;

@Dao
public interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Note note);
    @Update()
    void update(Note note);
    @Delete()
    void delete(Note note);
    @Query("SELECT * from note ORDER BY id ASC")
    LiveData<List<Note>> getAllNotes();
}