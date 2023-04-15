package testHelpers;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Stack;

import drukmakor.*;

import javax.sound.midi.SysexMessage;

public class TestManager {
    public static int tabCount = 0;

    HashMap<String, Object> objects;

    public TestManager() {
        objects = new HashMap<>();
    }

    public void testPumping() {
        //INITIALIZATION
        Pump fullPump = new Pump();
        fullPump.setVariableName("fullPump");

        Pipe regularPipe = new Pipe();
        regularPipe.setVariableName("regularPipe");

        Pipe fullPipe= new Pipe();
        regularPipe.setVariableName("fullPipe");

        fullPump.addPipe(regularPipe);
        fullPump.addPipe(fullPipe);

        fullPump.setIO(regularPipe, fullPipe);
        // /INITIALIZATION

        printCall(fullPump, "manageFlow", "void", new String[] {}, new String[] {} );
        fullPump.manageFlow();

        //System.out.println(p.getClass());

    }

    public static void printCall(SeqDiagramHelper calledObject, String functionName, String returnType, String[] paramNames, String[] paramTypes) {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //for(StackTraceElement s : ste) {
        //System.out.println(s.getClassName());
        //}
        //System.out.println();

        //String CallerObjectType = ste[3].getClassName();
        String CallerObjectType = ste[2].getClassName();
        String CalledObjectType = calledObject.getClass().getName();



        for(int i = 0 ; i < tabCount; i++)
            System.out.print("\t");
        System.out.print("caller : " + CallerObjectType + " ");

        System.out.print("-- "+functionName+"(");
        for(int i = 0; i < paramNames.length; i++) {
            System.out.print(paramNames[i] + " : " + paramTypes[i]);
            if(i != paramNames.length - 1) System.out.print(", ");
        }
        System.out.print(") : " + returnType + " --> ");

        System.out.print("called : " + CalledObjectType + "\n");

        tabCount++;
    }

    public static void printReturn() {

    }


}
