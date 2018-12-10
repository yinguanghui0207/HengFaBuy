package com.xunqi.mapper;

import com.xunqi.pojo.CircleComment;
import com.xunqi.pojo.CircleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleCommentMapper {
    int countByExample(CircleCommentExample example);

    int deleteByExample(CircleCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CircleComment record);

    int insertSelective(CircleComment record);

    List<CircleComment> selectByExample(CircleCommentExample example);

    CircleComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CircleComment record, @Param("example") CircleCommentExample example);

    int updateByExample(@Param("record") CircleComment record, @Param("example") CircleCommentExample example);

    int updateByPrimaryKeySelective(CircleComment record);

    int updateByPrimaryKey(CircleComment record);
    /**
     * 增加点赞数
     * @param fcmid
     * @return
     */
	int updateCommentPraise(Integer id);
	/**
	 * 减少点赞数
	 * @param fcmid
	 * @return
	 */
	int updateCommentPraise2(Integer id);
}