package hj.Interest.Existence.domain.auth.service;

import hj.Interest.Existence.domain.auth.dto.request.SignInRequest;
import hj.Interest.Existence.domain.auth.dto.request.SignUpRequest;
import hj.Interest.Existence.domain.auth.dto.response.TokenResponse;
import hj.Interest.Existence.domain.member.entity.MemberEntity;
import hj.Interest.Existence.domain.member.repository.MemberRepository;
import hj.Interest.Existence.global.jwt.JwtTokenProvider;
import hj.Interest.Existence.global.response.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class AuthService {
    private  final MemberRepository memberRepository;

    public void signUp(SignUpRequest signUpRequest) {
//        if (memberRepository.existsById(Long.valueOf(signUpRequest.id()))){
//            throw
//        }
        String encryptedPassword = encrypt
    }



}
