package connection.connection.Model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull
    private Integer dni;
    @NotEmpty
    private String name;
    @NotEmpty
    private String phone;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}

