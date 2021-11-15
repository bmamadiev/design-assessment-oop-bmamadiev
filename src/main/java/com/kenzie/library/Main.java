package com.kenzie.library;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*** noteArrayList declaration ***/
    static ArrayList<StickyNote> noteArrayList = new ArrayList<>();

    /*** DO NOT CHANGE THE CODE IN THIS BLOCK ***/
    /*** You can use these constant values for test messages **/
    public static final String MESSAGE_1 = "Buy groceries";
    public static final String MESSAGE_2 = "Pay bills";
    public static final String MESSAGE_3 = "Do homework";
    /**********************************************/

    public static ArrayList<StickyNote> addNote(String message, Priority priority, ArrayList<StickyNote> noteArrayList) {
        ArrayList<StickyNote> tempArrayList = new ArrayList<>(noteArrayList);
        tempArrayList.add(new StickyNote(message, priority));

        return tempArrayList;
    }

    public static ArrayList<StickyNote> peelNote(ArrayList<StickyNote> noteArrayList, int index) {
        ArrayList<StickyNote> tempArrayList = new ArrayList<>(noteArrayList);
        tempArrayList.get(index).setStatus("inactive");

        return tempArrayList;
    }

    public static ArrayList<StickyNote> getActiveNotes(ArrayList<StickyNote> noteArrayList) {
        ArrayList<StickyNote> tempArrayList = new ArrayList<>();

        for (int i = 0; i < noteArrayList.size(); i++) {
            if (noteArrayList.get(i).getStatus().equalsIgnoreCase(("active"))) {
                tempArrayList.add(noteArrayList.get(i));
            }
        }

        return tempArrayList;
    }

    public static ArrayList<StickyNote> getPriorityNotes(ArrayList<StickyNote> noteArrayList, Priority priority ) {
        ArrayList<StickyNote> tempArrayList = new ArrayList<>();

        for (int i = 0; i < noteArrayList.size(); i++) {
            if (noteArrayList.get(i).getPriority().equals(priority)) {
                tempArrayList.add(noteArrayList.get(i));
            }
        }

        return tempArrayList;
    }

    public static void main (String[] args) {
        //your code here

        noteArrayList = addNote(MESSAGE_1, Priority.LOW, noteArrayList);
        noteArrayList = addNote(MESSAGE_2, Priority.MEDIUM, noteArrayList);
        noteArrayList = addNote(MESSAGE_3, Priority.HIGH, noteArrayList);

        noteArrayList = peelNote(noteArrayList, 0);

        System.out.println("-----Display all Sticky Notes-----");
        System.out.println(noteArrayList.toString());
        System.out.println("\n-----Display only active Sticky Notes-----");
        System.out.println(getActiveNotes(noteArrayList));
        System.out.println("\n-----Display only high priority Sticky Notes-----");
        System.out.println(getPriorityNotes(noteArrayList, Priority.HIGH));
    }
}