package final_shopping_mall.domain.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum GlobalExceptionConst {

    // user_Exception (상태코드 401) //
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "비밀번호가 일치하지 않습니다."),

    // user_Exception (상태코드 404) //
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "회원이 존재하지 않습니다."),
    NOT_FOUND_EMAIL(HttpStatus.NOT_FOUND, "이메일이 존재하지 않습니다."),

    // user_Exception (상태코드 409) //
    DUPLICATE_EMAIL(HttpStatus.CONFLICT, "중복된 이메일입니다."),

    // user_Exception (상태코드 404) //
    NOT_FOUND_ITEM(HttpStatus.NOT_FOUND, "상품의 존재하지 않습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
