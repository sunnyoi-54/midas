package codenameStudy.Member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {
    @NotEmpty(message = "이름을 입력해주세요")
    private String userName;

    @NotEmpty(message = "비밀번호를 입력해주세요")
    private String pwd;
}
