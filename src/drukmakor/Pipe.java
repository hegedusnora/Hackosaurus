package drukmakor;

import testHelpers.TestManager;

public class Pipe extends Breakable {
    private boolean endInDesert;

    public void pickUpEnde(IActive e){}
    public boolean isFull() {
        return false;
    }
    @Override
    public int addWater(int amount) {

        return 0;
    }
}
