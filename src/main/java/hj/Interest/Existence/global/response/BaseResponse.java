package hj.Interest.Existence.global.response;

public record BaseResponse(int status, String message ) {
    public static BaseResponse success(String message) {
        return new BaseResponse(200, message);
    }

    // 실패 응답을 생성하는 정적 메소드
    public static  BaseResponse error(int status, String message) {
        return new BaseResponse(status, message);
    }

}
