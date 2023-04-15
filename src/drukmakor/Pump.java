package drukmakor;

import testHelpers.TestManager;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pump extends Breakable implements IActive {
    private ArrayList<Pipe> pipes;
    Pipe from;
    Pipe to;

    public Pump() {
        pipes = new ArrayList<>();
        from = null;
        to = null;
    }

    public ArrayList<Pipe> listAvailablePipes() {
        return pipes;
    }

    public void setIO(Pipe f, Pipe t) {
        from = f;
        to = t;
    }

    @Override
    public void manageFlow() {
        TestManager.printCall(to, "addWater", "int", new String[] {"amount"}, new String[] {"int"});
        int waterAdded = to.addWater(100);

        this.removeWater(waterAdded);

        int available = getFreeSpace();

        int waterRemoved = from.removeWater(0);

        this.addWater(waterRemoved);
    }

    @Override
    public void addPipe(Pipe p) {

    }

    @Override
    public void removePipe(Pipe p) {

    }

}
