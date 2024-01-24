package lk.epic.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {
    private String userId;
    private String userName;
    private String password;
    private String fullName;
    private String mobileNo;
    private String nic;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy, hh:mm:ss a")
    private Date createdDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy, hh:mm:ss a")
    private Date updatedDate;
}
