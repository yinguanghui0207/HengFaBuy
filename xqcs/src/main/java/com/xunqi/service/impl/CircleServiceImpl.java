package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.mapper.CircleCommentMapper;
import com.xunqi.mapper.CircleMessageMapper;
import com.xunqi.mapper.TebCollectionMapper;
import com.xunqi.mapper.TebPraiseMapper;
import com.xunqi.mapper.TebReplyMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.CircleComment;
import com.xunqi.pojo.CircleCommentExample;
import com.xunqi.pojo.CircleMessage;
import com.xunqi.pojo.CircleMessageExample;
import com.xunqi.pojo.TebCollection;
import com.xunqi.pojo.TebCollectionExample;
import com.xunqi.pojo.TebPraise;
import com.xunqi.pojo.TebPraiseExample;
import com.xunqi.pojo.TebReply;
import com.xunqi.pojo.TebReplyExample;
import com.xunqi.service.CircleService;
import com.xunqi.tool.ReturnResult;

@Service
public class CircleServiceImpl implements CircleService {
	@Autowired
	private CircleMessageMapper circleMessageMapper;
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	@Autowired
	private CircleCommentMapper circleCommentMapper;
	@Autowired
	private TebReplyMapper tebReplyMapper;
	@Autowired
	private TebPraiseMapper tebPraiseMapper;
	@Autowired
	private TebCollectionMapper tebCollectionMapper;
	@Override
	public ReturnResult insertMassage(CircleMessage circleMessage) {
		
		circleMessage.setCreateTime(new Date());
		if("00".equals(circleMessage.getMsgCompany())){
			ActivityUsr selectByUseId = activityUsrMapper.selectByUseId(circleMessage.getUseId());
			if(null == selectByUseId.getIsCompany()){
				return ReturnResult.error("01","您还没有企业小站，请绑定");
			}
			circleMessage.setMsgCompany(selectByUseId.getIsCompany());	
		}
		
		 	circleMessageMapper.insertSelective(circleMessage);
		 	return ReturnResult.success();
	}

	@Override
	public List<CircleMessage> findMassage(CircleMessage circleMessage) {
		CircleMessageExample example = new CircleMessageExample();
		CircleMessageExample.Criteria criteria = example.createCriteria();
		example.setPageNum(circleMessage.getPage());
		example.setPageSize(8);
		criteria.andMsgStateEqualTo(0);
		List<CircleMessage> selectByExample;
		switch (circleMessage.getMsgType()) {
		case "推荐":
			example.setOrderByClause("create_time desc");
			 selectByExample = circleMessageMapper.selectByExample(example);
			 return selectByExample;
		case "榜单":
			example.setOrderByClause("msg_praise");
		 selectByExample = circleMessageMapper.selectByExample(example);
		 return selectByExample;
			
		case "附近":
			selectByExample = circleMessageMapper.selectByRange(circleMessage,example);
			return selectByExample;
		default:
			criteria.andMsgTypeEqualTo(circleMessage.getMsgType());
			selectByExample = circleMessageMapper.selectByExample(example);
		}
		return selectByExample;
	}

	@Override
	public List<CircleMessage> findMassageByFollower(CircleMessage circleMessage,List<String> findFolloweringUseId) {
		CircleMessageExample example = new CircleMessageExample();
		example.setPageNum(circleMessage.getPage());
		example.setPageSize(8);
		List<CircleMessage> selectByuseIdList = circleMessageMapper.selectByuseIdList(findFolloweringUseId, example);
		return selectByuseIdList;
	}

	@Override
	public void updateMsgview(int id) {
		circleMessageMapper.updateMsgviewByPrimaryKey(id);
		
	}

	@Override
	public void updateMsgreply(int id) {
		circleMessageMapper.updateMsgreplyByPrimaryKey(id);
		
	}

	@Override
	public void updateMsgpraise(int id) {
		circleMessageMapper.updateMsgpraiseByPrimaryKey(id);
		
	}

	@Override
	public int insertComment(CircleComment circleComment) {
		
		circleComment.setCreateTime(new Date());		
		return circleCommentMapper.insertSelective(circleComment);
	}

	@Override
	public int insertReply(TebReply tebReply) {
		tebReply.setCreateTime(new Date());
		return tebReplyMapper.insertSelective(tebReply);
	}

	@Override
	public int insertpraise(TebPraise tebPraise) {		
		tebPraise.setCreateTime(new Date());
		if(0 == tebPraise.getType()){
			circleMessageMapper.updateMsgpraiseByPrimaryKey(tebPraise.getFcmid());
		}else if(1 == tebPraise.getType()){
			circleCommentMapper.updateCommentPraise(tebPraise.getFcmid());
		}
		return tebPraiseMapper.insertSelective(tebPraise);
	}

	@Override
	public Boolean findIspraise(TebPraise tebPraise) {
		Integer a = 1;
		if(a.equals(tebPraiseMapper.selectIspraise(tebPraise))){
				return true;
			}else{
				return false;
			}
		
	}

	@Override
	public int deletepraise(TebPraise tebPraise) {
		TebPraiseExample example = new TebPraiseExample();
		TebPraiseExample.Criteria criteria = example.createCriteria();
		criteria.andFcmidEqualTo(tebPraise.getFcmid());
		criteria.andUseIdEqualTo(tebPraise.getUseId());
		criteria.andTypeEqualTo(tebPraise.getType());
		if(0 == tebPraise.getType()){
			circleMessageMapper.updateMsgpraise1ByPrimaryKey(tebPraise.getFcmid());
		}else if(1 == tebPraise.getType()){
			circleCommentMapper.updateCommentPraise2(tebPraise.getFcmid());
		}
		
		return tebPraiseMapper.deleteByExample(example);
	}

	@Override
	public int findCountPraise(CircleMessage circleMessage) {
		TebPraiseExample example = new TebPraiseExample();
		TebPraiseExample.Criteria criteria = example.createCriteria();
		criteria.andFcmidEqualTo(circleMessage.getId());
		criteria.andTypeEqualTo(0);
		return tebPraiseMapper.countByExample(example);
	}

	@Override
	public int findCommentCountPraise(CircleComment circleComment) {
		TebPraiseExample example = new TebPraiseExample();
		TebPraiseExample.Criteria criteria = example.createCriteria();
		criteria.andFcmidEqualTo(circleComment.getId());
		criteria.andTypeEqualTo(1);
		return tebPraiseMapper.countByExample(example);		
	}

	@Override
	public int insertTebCollection(TebCollection tebCollection) {	
		tebCollection.setCreateTime(new Date());		
		return tebCollectionMapper.insertSelective(tebCollection);
	}

	@Override
	public Boolean findIsCollection(TebCollection tebCollection) {
		Integer a = 1;
		if(a.equals(tebCollectionMapper.selectIsCollection(tebCollection))){
				return true;
			}else{
				return false;
			}				 
	}

	@Override
	public List<TebCollection> findCollection(TebCollection tebCollection) {
		TebCollectionExample example = new TebCollectionExample();
		TebCollectionExample.Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(tebCollection.getType());
		criteria.andUseIdEqualTo(tebCollection.getUseId());
	
		return tebCollectionMapper.selectByExample(example);
		
	}

	@Override
	public CircleMessage findMassageInfo(CircleMessage circleMessage) {		
		CircleMessage selectByPrimaryKey = circleMessageMapper.selectByPrimaryKey(circleMessage.getId());
		selectByPrimaryKey.setActivityUsr(activityUsrMapper.selectByUseId(selectByPrimaryKey.getUseId()));
		
		//查询评论
		CircleCommentExample circleCommentExample = new CircleCommentExample();
		CircleCommentExample.Criteria criteria = circleCommentExample.createCriteria();
		criteria.andFcmidEqualTo(circleMessage.getId());
		List<CircleComment> selectByExample = circleCommentMapper.selectByExample(circleCommentExample);
		//查询评论的回复
		TebReplyExample tebReplyExample = new TebReplyExample();
		TebReplyExample.Criteria criteria2 = tebReplyExample.createCriteria();
		for (CircleComment circleComment : selectByExample) {
			criteria2.andCommentIdEqualTo(circleComment.getId());		
			circleComment.setTebReplyList(tebReplyMapper.selectByExample(tebReplyExample));
		}
		selectByPrimaryKey.setCircleCommentList(selectByExample);
		
		return selectByPrimaryKey;
	}

	@Override
	public List<CircleMessage> findByMsgIds(List<Integer> ids, int page) {
		CircleMessageExample example = new CircleMessageExample();
		example.setPageNum(page);
		example.setPageSize(8);
		 List<CircleMessage> findByMsgIds = circleMessageMapper.findByMsgIds(ids,example);
		 for (CircleMessage c : findByMsgIds) {
			c.setActivityUsr(activityUsrMapper.selectByUseId(c.getUseId()));
		}
		 return findByMsgIds;
	}
}
