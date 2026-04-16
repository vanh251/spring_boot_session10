package ra.edu.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ra.edu.dto.Meta;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponse<T> {
    private String status;
    private int code;
    private T data;
    private Meta meta;
}

