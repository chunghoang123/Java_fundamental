package B6;

import java.util.*;

class MedicalRecordHistory {
    Stack<EditAction> editStack = new Stack<>();
    String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    void addEdit(EditAction action) {
        editStack.push(action);
    }

    void undoEdit() {
        if (!editStack.isEmpty())
            System.out.println("Undo: " + editStack.pop());
        else
            System.out.println("Khong co lich su!");
    }

    void showHistory() {
        for (EditAction e : editStack)
            System.out.println(e);
    }
}