package com.tasker.dao;
import java.util.List;

import com.tasker.model.UserProfile;

 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}