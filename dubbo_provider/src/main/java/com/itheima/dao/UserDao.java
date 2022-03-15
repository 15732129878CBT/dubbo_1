package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author Cbt
 * @createDate 2022-03-14 18:23
 */
public interface UserDao {
    @Select("select * from t_user where id = #{id}")
    User findByID(Integer id);
}
