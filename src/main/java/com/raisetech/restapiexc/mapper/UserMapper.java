package com.raisetech.restapiexc.mapper;

import com.raisetech.restapiexc.entity.InsertForm;
import com.raisetech.restapiexc.entity.UpdateForm;
import com.raisetech.restapiexc.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users;")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    Optional<User> findById(int id);

    @Insert("INSERT INTO users(name) VALUES(#{name}) ")
    void insertUser(InsertForm insertForm);

    @Update("UPDATE users SET name = #{name} WHERE id = #{id}")
    void updateUser(UpdateForm updateForm);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteuser(int id);
}

