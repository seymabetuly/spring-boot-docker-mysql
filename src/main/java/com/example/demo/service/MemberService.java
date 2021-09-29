package com.example.demo.service;

import com.example.demo.entity.Member;
import com.example.demo.request_response.MemberRequest;
import com.example.demo.request_response.MemberResponse;

public interface MemberService {

    MemberResponse get(Integer id);

    Member create(MemberRequest request);

    void delete(Integer id);

    Member update(MemberRequest request);
}
