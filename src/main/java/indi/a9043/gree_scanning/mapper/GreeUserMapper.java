package indi.a9043.gree_scanning.mapper;

import indi.a9043.gree_scanning.pojo.GreeUser;
import indi.a9043.gree_scanning.pojo.GreeUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GreeUserMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    long countByExample(GreeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int deleteByExample(GreeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int deleteByPrimaryKey(String usrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int insert(GreeUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int insertSelective(GreeUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    List<GreeUser> selectByExample(GreeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    GreeUser selectByPrimaryKey(String usrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int updateByExampleSelective(@Param("record") GreeUser record, @Param("example") GreeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int updateByExample(@Param("record") GreeUser record, @Param("example") GreeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int updateByPrimaryKeySelective(GreeUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gree-user
     *
     * @mbg.generated Tue Jun 12 12:44:06 CST 2018
     */
    int updateByPrimaryKey(GreeUser record);
}