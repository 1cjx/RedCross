package com.jx.utils;


import com.jx.constants.SystemConstants;
import com.jx.domain.entity.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils
{

    /**
     * 获取用户
     **/
    public static LoginUser getLoginUser()
    {
        return (LoginUser) getAuthentication().getPrincipal();
    }

    /**
     * 获取Authentication
     */
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static Boolean isAdmin(){
        System.err.println("isAdmin");
        Long id = getLoginUser().getUser().getId();
        return id != null && id == 222021321262020L ;
    }

    public static Long getUserId() {
        return getLoginUser().getUser().getId();
    }
}