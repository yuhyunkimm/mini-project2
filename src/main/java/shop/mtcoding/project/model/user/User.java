package shop.mtcoding.project.model.user;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private Integer userId;
    private String email;
    private String password;
    private String name;
    private String birth;
    private String tel;
    private String photo;
    private String Address;
    private Timestamp createdAt;
}
