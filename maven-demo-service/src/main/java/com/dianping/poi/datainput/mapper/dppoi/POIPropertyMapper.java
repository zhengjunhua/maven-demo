package com.dianping.poi.datainput.mapper.dppoi;

import com.dianping.poi.datainput.module.dppoi.POIProperty;
import com.dianping.poi.datainput.module.dppoi.POIPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface POIPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    int countByExample(POIPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    int deleteByExample(POIPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    int insert(POIProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    int insertSelective(POIProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    List<POIProperty> selectByExample(POIPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    int updateByExampleSelective(@Param("record") POIProperty record, @Param("example") POIPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table POI_Property
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    int updateByExample(@Param("record") POIProperty record, @Param("example") POIPropertyExample example);
}