package B6;

import java.time.LocalDateTime;

class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    LocalDateTime actionTime;

    public InputAction(String fieldName,
                       String oldValue,
                       String newValue) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = LocalDateTime.now();
    }

    public String toString() {
        return fieldName +
                ": " + oldValue +
                " -> " + newValue +
                " | " + actionTime;
    }
}