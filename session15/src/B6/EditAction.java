package B6;

import java.time.LocalDateTime;

class EditAction {
    String description;
    String editedBy;
    LocalDateTime editTime;

    public EditAction(String description, String editedBy) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = LocalDateTime.now();
    }

    public String toString() {
        return description + " | " + editedBy + " | " + editTime;
    }
}