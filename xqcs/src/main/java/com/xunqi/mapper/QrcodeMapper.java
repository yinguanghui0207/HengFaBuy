package com.xunqi.mapper;

import com.xunqi.pojo.Qrcode;
import com.xunqi.pojo.QrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrcodeMapper {
    int countByExample(QrcodeExample example);

    int deleteByExample(QrcodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Qrcode record);

    int insertSelective(Qrcode record);

    List<Qrcode> selectByExample(QrcodeExample example);

    Qrcode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Qrcode record, @Param("example") QrcodeExample example);

    int updateByExample(@Param("record") Qrcode record, @Param("example") QrcodeExample example);

    int updateByPrimaryKeySelective(Qrcode record);

    int updateByPrimaryKey(Qrcode record);

	Integer findQrcode(String scene);
}