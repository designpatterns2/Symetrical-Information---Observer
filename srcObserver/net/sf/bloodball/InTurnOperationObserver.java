package net.sf.bloodball;

import net.sf.bloodball.gameflow.GameFlowController;
import net.sf.bloodball.gameflow.InTurnOperation;
import net.sf.bloodball.gameflow.Operation;
import net.sf.bloodball.gameflow.State;
import net.sf.bloodball.view.MainFrame;

import static net.sf.bloodball.GameController.mainFrame;

public class InTurnOperationObserver implements Observer {

    public InTurnOperationObserver(State state) {
        state.attachObserver(this);
    }

    @Override
    public void update(Operation operation, GameFlowController controller) {
        mainFrame.setStatusBarColor(controller.getGame().getTeams().getActiveTeam().getColor());
        mainFrame.setStatusBarText(new OperationMessages(controller).getInTurnStatusTextFor((InTurnOperation) operation));
    }
}
