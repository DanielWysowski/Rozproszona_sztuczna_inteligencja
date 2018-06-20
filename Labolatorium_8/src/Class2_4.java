import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;

public class Class2_4 extends Agent{



    private int step=0;
    protected void setup() {

        System.out.println("startuje");
        final SequentialBehaviour threeStepBehaviour = new SequentialBehaviour();
        threeStepBehaviour.addSubBehaviour( new OneShotBehaviour()
        {
            public void action() { System.out.println( "pierwszy krok!" ); }
        });
        threeStepBehaviour.addSubBehaviour( new OneShotBehaviour()
        {
            public void action() { System.out.println( "drugi krok !" ); }
        });
        threeStepBehaviour.addSubBehaviour( new OneShotBehaviour()
        {
            public void action() {
                System.out.println( "trzeci krok!" );
                removeBehaviour(threeStepBehaviour);
                System.out.println( "usuwam!" );
            }
        });
        addBehaviour(threeStepBehaviour);
    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }


}