package net.sf.bloodball;

import net.sf.bloodball.gameflow.GameFlowController;
import net.sf.bloodball.gameflow.Operation;

public interface Observer {
    public void update(Operation operation, GameFlowController controller);
}
