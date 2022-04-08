package com.mnazari2.flashcardapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Flashcard.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FlashcardDao flashcardDao();
}
