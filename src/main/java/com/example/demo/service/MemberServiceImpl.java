package com.example.demo.service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.request_response.MemberRequest;
import com.example.demo.request_response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public MemberResponse get(Integer id) {
        Member member = memberRepository.findById(id).get();
        return MemberResponse.builder().id(member.getId()).name(member.getName()).surname(member.getSurname()).identityNo(member.getIdentityNo()).build();
    }

    @Override
    public Member create(MemberRequest request) {
        return memberRepository.save(Member.builder().name(request.getName()).surname(request.getSurname()).identityNo(request.getIdentityNo()).build());
    }

    @Override
    public void delete(Integer id) {
        memberRepository.deleteById(id);
    }

    @Override
    public Member update(MemberRequest request) {
        Member member = memberRepository.findById(request.getId()).get();
        member.setName(request.getName());
        member.setSurname(request.getSurname());
        member.setIdentityNo(request.getIdentityNo());
        return memberRepository.save(member);
    }
}
