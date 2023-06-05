package com.academy.burtsevich.lesson13;

import java.util.*;

public class Notepad {
    KeyComparator keyComparator = new KeyComparator();
    Map<String, Note> noteMap = new TreeMap<>(keyComparator.reversed());

    public static class Note {
        private final String lastname;

        Note(String lastname) {
            this.lastname = lastname;
        }

        public String getLASTNAME() {
            return lastname;
        }

        @Override
        public String toString() {
            return "Note {" +
                    "LASTNAME = '" + lastname + '\'' +
                    '}';
        }
    }

    public void addNote(String date, String lastName) throws DateException {
        Note note = new Note(lastName);
        if (noteMap.isEmpty() || !noteMap.containsKey(date)) {
            noteMap.put(date, note);
        } else
            throw new DateException("Запись на эту дату невозможна!");

    }

    public Note getNote(String date) {
        return noteMap.getOrDefault(date, new Note("Запись отсутствует"));
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(noteMap.values());
    }


}



