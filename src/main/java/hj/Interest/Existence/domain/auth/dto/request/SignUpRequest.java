package hj.Interest.Existence.domain.auth.dto.request;

public record SignUpRequest(
        String name,
        String email,
        String password,
        String id
) {}
