package com.dianping.poi.datainput.mapper.dppoi;

import com.dianping.poi.datainput.module.dppoi.UserRole;
import com.dianping.poi.datainput.module.dppoi.UserRoleExample;
import com.dianping.poi.datainput.module.query.dppoi.UserRoleQuery;
import com.dianping.poi.datainput.module.query.dppoi.UserRoleTreeListQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbggenerated Sat Apr 25 21:50:18 CST 2015
     */
    int updateByPrimaryKey(UserRole record);
    
    List<UserRoleQuery> qryUserRoleTree();
    
    UserRoleTreeListQuery qryUserRoleTree2();
}