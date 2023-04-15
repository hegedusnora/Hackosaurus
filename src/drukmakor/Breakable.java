package drukmakor;

import testHelpers.SeqDiagramHelper;
import testHelpers.TestManager;

public class Breakable implements SeqDiagramHelper {
    private String seqHelperName;

    private boolean broken;
    private int capacity;
    private int amount;

    public void repair() {}
    public void breakDown() {}

    public int addWater(int amount) {
        return 0;
    }

    public int removeWater(int amount) {
        return 0;
    }

    public int getFreeSpace() {
        return 0;
    }

    @Override
    public String getVariableName() {
        return seqHelperName;
    }
    @Override
    public void setVariableName(String n) {
        seqHelperName = n;
    }
}
