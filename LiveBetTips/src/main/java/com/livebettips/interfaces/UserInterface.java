package com.livebettips.interfaces;

import com.livebettips.classes.User;


import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by sarthakmeh on 2/7/14.
 */
public interface UserInterface {

     @POST("/user/")
     void createUser(@Body User user, Callback<User> cb);

}