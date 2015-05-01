package com.dianping.poi.datainput.module.dppoi;

import java.util.List;

public class POICategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POI_Category.category_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POI_Category.category_name
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POI_Category.parent_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POI_Category.ancestor_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    private Integer ancestorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POI_Category.category_level
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    private Byte categoryLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column POI_Category.is_leaf
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    private Boolean isLeaf;
    
    
    private List<POIPropMapping> proList;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POI_Category.category_id
     *
     * @return the value of POI_Category.category_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POI_Category.category_id
     *
     * @param categoryId the value for POI_Category.category_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POI_Category.category_name
     *
     * @return the value of POI_Category.category_name
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POI_Category.category_name
     *
     * @param categoryName the value for POI_Category.category_name
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POI_Category.parent_id
     *
     * @return the value of POI_Category.parent_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POI_Category.parent_id
     *
     * @param parentId the value for POI_Category.parent_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POI_Category.ancestor_id
     *
     * @return the value of POI_Category.ancestor_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public Integer getAncestorId() {
        return ancestorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POI_Category.ancestor_id
     *
     * @param ancestorId the value for POI_Category.ancestor_id
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public void setAncestorId(Integer ancestorId) {
        this.ancestorId = ancestorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POI_Category.category_level
     *
     * @return the value of POI_Category.category_level
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public Byte getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POI_Category.category_level
     *
     * @param categoryLevel the value for POI_Category.category_level
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public void setCategoryLevel(Byte categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column POI_Category.is_leaf
     *
     * @return the value of POI_Category.is_leaf
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public Boolean getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column POI_Category.is_leaf
     *
     * @param isLeaf the value for POI_Category.is_leaf
     *
     * @mbggenerated Wed Apr 22 15:13:51 CST 2015
     */
    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

	public List<POIPropMapping> getProList() {
		return proList;
	}

	public void setProList(List<POIPropMapping> proList) {
		this.proList = proList;
	}
    
}