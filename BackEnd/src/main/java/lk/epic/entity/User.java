package lk.epic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class User {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String fullName;
    private String mobileNo;
    private String nic;
    private Date createdDate;
    private Date updatedDate;

}
