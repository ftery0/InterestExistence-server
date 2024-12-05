package hj.Interest.Existence.global.error;

import hj.Interest.Existence.global.error.exception.ErrorCodeEnum;
import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Builder

public class ErrorResponse {
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;
    private String description;

    public static ErrorResponse of(ErrorCodeEnum errorCode, String description){
        return ErrorResponse.builder().message(errorCode.getMessage()).status(errorCode.getHttpStatus()).timestamp(LocalDateTime.now()).description(description).build();
    }
    public static ErrorResponse of(HttpStatus statusCode, String description) {
        return ErrorResponse.builder()
                .message(description)
                .status(statusCode)
                .timestamp(LocalDateTime.now())
                .description(description)
                .build();
    }

}
