import java.util.ArrayList;

public class List {
    private ArrayList<ChordList> chordArrayList;

    public List(ArrayList<ChordList> chordArrayList) {
        this.chordArrayList = chordArrayList;
    }

    public ArrayList<ChordList> getChordArrayList() {
        return chordArrayList;
    }

    public void setChordArrayList(ArrayList<ChordList> chordArrayList) {
        this.chordArrayList = chordArrayList;
    }
}
