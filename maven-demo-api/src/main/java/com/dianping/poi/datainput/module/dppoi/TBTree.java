package com.dianping.poi.datainput.module.dppoi;

public class TBTree {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_TREE.CID
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    private Integer cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_TREE.CNAME
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    private String cname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_TREE.PID
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_TREE.CID
     *
     * @return the value of TB_TREE.CID
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_TREE.CID
     *
     * @param cid the value for TB_TREE.CID
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_TREE.CNAME
     *
     * @return the value of TB_TREE.CNAME
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_TREE.CNAME
     *
     * @param cname the value for TB_TREE.CNAME
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_TREE.PID
     *
     * @return the value of TB_TREE.PID
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_TREE.PID
     *
     * @param pid the value for TB_TREE.PID
     *
     * @mbggenerated Sat Apr 25 16:44:42 CST 2015
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

	@Override
	public String toString() {
		return "TBTree [cid=" + cid + ", cname=" + cname + ", pid=" + pid + "]";
	}
    
    
}