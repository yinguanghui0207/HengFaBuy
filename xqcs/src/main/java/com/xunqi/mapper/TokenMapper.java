package com.xunqi.mapper;

import com.xunqi.pojo.Token;

public interface TokenMapper {
    
    int updateByPrimaryKey(Token record);

	String getToken();
}