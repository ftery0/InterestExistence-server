package hj.Interest.Existence.domain.auth.controller;

import hj.Interest.Existence.domain.auth.dto.request.SignInRequest;
import hj.Interest.Existence.domain.auth.dto.request.SignUpRequest;
import hj.Interest.Existence.domain.auth.dto.response.TokenResponse;
import hj.Interest.Existence.domain.auth.service.AuthService;
import hj.Interest.Existence.global.response.BaseResponse;
import hj.Interest.Existence.global.response.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/sign-in")
    public ResponseData<TokenResponse> signIn(
            @RequestBody SignInRequest signInRequest
    ){
        return authService.signIn(signInRequest);
    }
}
