package hj.Interest.Existence.domain.auth.service;

import hj.Interest.Existence.domain.auth.dto.request.SignInRequest;
import hj.Interest.Existence.domain.auth.dto.response.TokenResponse;
import hj.Interest.Existence.domain.member.entity.MemberEntity;
import hj.Interest.Existence.domain.member.repository.MemberRepository;
import hj.Interest.Existence.global.response.ResponseData;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final MemberRepository memberRepository;
    public ResponseData<TokenResponse> SignIn(SignInRequest signInRequest) {
        MemberEntity memberEntity = memberRepository.findById(signInRequest.id());
        if (memberEntity == null) {
            throw MemberNotFoundException.EXCEPTION;
        }
    }

    public AuthService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
