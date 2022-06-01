//The scale object
public class Scale {
    private String scaleName;
    private boolean major;
    private int[] availableNotesInScale;

    public Scale(String scaleName, boolean major) {
        this.scaleName = scaleName;
        this.major = major;
        this.availableNotesInScale = getAvailableNotesInScale();
    }

    public String getScaleName() {
        return scaleName;
    }

    public void setScaleName(String scaleName) {
        this.scaleName = scaleName;
    }

    private void setMajor(boolean major) {
        if (scaleName.contains("minor")) {
            major = false;
        } else {
            major = true;
        }

        this.major = major;
    }

    public boolean isMajor() {
        return major;
    }

    public int[] getAvailableNotesInScale() {

        availableNotesInScale = new int[7];
        int tonic = 0;

        if (scaleName.contains("C")) {
            tonic += 0;
        } else if (scaleName.contains("D")) {
            tonic += 2;
        } else if (scaleName.contains("E")) {
            tonic += 4;
        } else if (scaleName.contains("F")) {
            tonic += 5;
        } else if (scaleName.contains("G")) {
            tonic += 7;
        } else if (scaleName.contains("A")) {
            tonic += 9;
        } else if (scaleName.contains("B")) {
            tonic += 11;
        }

        //Determine if it has a sharp of flat
        if (scaleName.contains("#")) {
            tonic += 1;
        } else if (scaleName.contains("b")) {
            tonic += -1;
        }




        if (major) {
            availableNotesInScale[0] = tonic;
            availableNotesInScale[1] = tonic + 2;
            availableNotesInScale[2] = tonic + 4;
            availableNotesInScale[3] = tonic + 5;
            availableNotesInScale[4] = tonic + 7;
            availableNotesInScale[5] = tonic + 9;
            availableNotesInScale[6] = tonic + 11;

            for (int x = 0; x < 7; x++) {
                if (availableNotesInScale[x] >= 12) {
                    availableNotesInScale[x] -= 12;

                }

            }
        } else {
            //harmonic minor
            availableNotesInScale[0] = tonic;
            availableNotesInScale[1] = tonic + 2;
            availableNotesInScale[2] = tonic + 3;
            availableNotesInScale[3] = tonic + 5;
            availableNotesInScale[4] = tonic + 6;
            availableNotesInScale[5] = tonic + 9;
            availableNotesInScale[6] = tonic + 11;

            for (int x = 0; x < 7; x++) {
                if (availableNotesInScale[x] >= 12) {
                    availableNotesInScale[x] -= 12;

                }

            }

        }



        return availableNotesInScale;
    }
}
