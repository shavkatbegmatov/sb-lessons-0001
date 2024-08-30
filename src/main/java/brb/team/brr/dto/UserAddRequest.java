package brb.team.brr.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddRequest {
    private String firstName;
    private String lastName;
    private Integer age;
    private String cityName;
}
