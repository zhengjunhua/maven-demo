package com.dianping.poi.datainput.mapper.dppoi;

import com.dianping.poi.datainput.module.dppoi.TestUser;
import com.dianping.poi.datainput.module.dppoi.TestUserExample;
import com.dianping.poi.datainput.module.query.dppoi.TestUserArticleListQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TestUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int countByExample(TestUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int deleteByExample(TestUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int insert(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int insertSelective(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    List<TestUser> selectByExample(TestUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    TestUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int updateByExampleSelective(@Param("record") TestUser record, @Param("example") TestUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int updateByExample(@Param("record") TestUser record, @Param("example") TestUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int updateByPrimaryKeySelective(TestUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_user
     *
     * @mbggenerated Fri May 01 18:57:20 CST 2015
     */
    int updateByPrimaryKey(TestUser record);
    
    
    List<TestUser> qryList();
    
    List<TestUser> qryListByName(String username);
    
    int addTestUser(TestUser user);
    
    int updTestUser(TestUser user);
    
    int delTestUser(TestUser user);
    
    List<TestUserArticleListQuery> getUserArticles(int userID);
}