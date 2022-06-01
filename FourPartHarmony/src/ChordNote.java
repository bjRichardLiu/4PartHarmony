import java.util.ArrayList;

public class ChordNote {
    private ArrayList<Integer> notesToUse;
    private int[] notesInChords;
    private int base;

    public ChordNote(ArrayList<Integer> noteNum, int base) {
        this.notesToUse = noteNum;
        this.base = base;
    }

    public Integer[] getNoteNum(Scale scale) {
        //todo difference between integer and int

        notesInChords = new int[3];
        notesInChords[0] = scale.getAvailableNotesInScale()[base];
        notesInChords[1] = scale.getAvailableNotesInScale()[base + 2];
        notesInChords[2] = scale.getAvailableNotesInScale()[base + 4];

        for (int i = 0; i < 3; i++) {
            if (notesInChords[i] >= 12) {
                notesInChords[i] -= 12;
            }
        }

        Integer[] notesToUse;
        ArrayList<Integer> noteToUseArrayList = new ArrayList<>();
        //from E2(52) to C6(96)
        for (int p = 52; p < 96; p++) {
            if (p % 12 == notesInChords[0] || p % 12 == notesInChords[1] || p % 12 == notesInChords[2]) {
                noteToUseArrayList.add(p);
            }
        }

        notesToUse = noteToUseArrayList.toArray(new Integer[0]);

        return notesToUse;
    }

    public void setNoteNum(ArrayList<Integer> noteNum) {
        this.notesToUse = noteNum;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
