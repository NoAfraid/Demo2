package com.serviceImpl;

import com.dao.STMapper;
import com.pojo.ST;
import com.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public abstract class StudentServiceImpl implements IStudentService {
    @Resource
    private STMapper mapper;
    @Autowired
    private IStudentService studentService;
    @Override
    public ST insertByEmail(String email) {
        return this.mapper.insertByEmail(email);
    }
    public int insertSelective(ST st){
        return this.mapper.insertSelective(st);
    }
}
