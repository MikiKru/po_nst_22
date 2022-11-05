package model;

import lombok.*;
import model.enums.Status;

import java.time.LocalDateTime;

//@Data                 // add getters, setters, toString and equals methods to Task class
@Getter                 // add getters to Task class
@Setter                 // add setters to Task class
@ToString               // text representation of the object
@AllArgsConstructor     // constructor with all fields as arguments
public class Task {
    private long taskId;
    private String taskName;
    private LocalDateTime taskStart;
    private LocalDateTime taskStop;
    private Status status;


}
