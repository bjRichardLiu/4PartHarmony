public class Chord {

    private int[] chordGenerated;
    private int base;


    public Chord(int[] chordGenerated, int base) {
        this.chordGenerated = chordGenerated;
        this.base = base;
    }

    public int[] getChordGenerated() {
        return chordGenerated;
    }

    public void setChordGenerated(int[] chordGenerated) {
        this.chordGenerated = chordGenerated;
    }
}
