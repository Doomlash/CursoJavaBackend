package connection.connection.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private Integer dni;
    private String name;
    private String phone;
}

