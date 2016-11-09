package com.iflyzunhong.vvm3.redismgrimpl.impl;

import java.util.List;
import java.util.Map;

import com.iflyzunhong.vvm3.redismgrimpl.modal.Score;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.iflyzunhong.vvm3.redismgrimpl.dao.IScoreDao;


/**
* @className: IScoreDaoImpl
* @description: 用户分数操作接口实现类
* @author 黄继国
* @version V1.0 
* @date 2016年10月26日
*/
public class IScoreDaoImpl implements IScoreDao {

    /**
    * 定义工厂类成员sqlSessionFactory  
    */
    private SqlSessionFactory sqlSessionFactory = null;  
   
    
    /**
     * 创建一个新的实例 IScoreDaoImpl.传入SqlSessionFactory
     */
    public IScoreDaoImpl(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IScoreDao#selectScore(int)
	*/
	public Score selectScore(int id) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		Score score = sqlSession.selectOne("dbredismgr.mapping.scoreMapper.selectScore", id);
		sqlSession.close();  
		return score;
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IScoreDao#addScore(com.iflyzunhong.vvm3.dbredismgr.modal.Score)
	*/
	public void addScore(Score score) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("dbredismgr.mapping.scoreMapper.addScore", score);
		sqlSession.commit();
		sqlSession.close(); 	
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IScoreDao#deleteScore(int)
	*/
	public void deleteScore(int id) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("dbredismgr.mapping.scoreMapper.deleteScore", id);
		sqlSession.commit();
		sqlSession.close(); 
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IScoreDao#updateScore(com.iflyzunhong.vvm3.dbredismgr.modal.Score)
	*/
	public void updateScore(Score score) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("dbredismgr.mapping.scoreMapper.updateScore", score);
		sqlSession.commit();
		sqlSession.close(); 	
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IScoreDao#selectAllScore(int)
	*/
	public List<Map> selectAllScore(int id) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		List<Map> list = sqlSession.selectList("dbredismgr.mapping.scoreMapper.selectAllScore",id);
		sqlSession.close();
		return list; 
	}
}
