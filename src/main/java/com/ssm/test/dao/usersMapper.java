package com.ssm.test.dao;

import com.ssm.test.model.users;

public interface usersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(users record);

    int insertSelective(users record);

    users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(users record);

    int updateByPrimaryKey(users record);
}