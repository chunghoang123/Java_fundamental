package B6;

import java.util.*;

class UndoManager {
    Stack<InputAction> undoStack = new Stack<>();
    int maxUndoSteps = 5;

    void saveAction(InputAction action) {
        if (undoStack.size() == maxUndoSteps)
            undoStack.remove(0);

        undoStack.push(action);
    }

    void undo() {
        if (!undoStack.isEmpty())
            System.out.println("Undo: " + undoStack.pop());
        else
            System.out.println("Khong co thao tac!");
    }
}