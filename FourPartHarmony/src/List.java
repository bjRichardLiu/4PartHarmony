import java.util.ArrayList;

public class List {
    private ArrayList<chordList> chordArrayList;

    public List(ArrayList<chordList> chordArrayList) {
        this.chordArrayList = chordArrayList;
    }

    public ArrayList<chordList> getChordArrayList() {
        return chordArrayList;
    }

    public void setChordArrayList(ArrayList<chordList> chordArrayList) {
        this.chordArrayList = chordArrayList;
    }
}
