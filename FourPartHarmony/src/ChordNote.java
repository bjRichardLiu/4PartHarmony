import java.util.ArrayList;

public class ChordNote {
    private ArrayList<Integer> notesToUse;
    private int[] notesInChords;
    private int base;

    public ChordNote(ArrayList<Integer> noteNum, int base) {
        this.notesToUse = noteNum;
        this.base = base;
    }

    public ArrayList<Integer> getNoteNum(Scale scale) {

        notesInChords = new int[3];
        notesInChords[0] = scale.getAvailableNotesInScale()[base];
        notesInChords[1] = scale.getAvailableNotesInScale()[base + 2];
        notesInChords[2] = scale.getAvailableNotesInScale()[base + 4];

        


        return notesToUse;
    }

    public void setNoteNum(ArrayList<Integer> noteNum) {
        this.notesToUse = noteNum;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
