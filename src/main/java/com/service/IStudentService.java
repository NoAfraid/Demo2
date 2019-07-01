package com.service;

import com.pojo.ST;

public interface IStudentService {
    public ST insertByEmail(String email);
    public int insertSelective(ST st);
}
