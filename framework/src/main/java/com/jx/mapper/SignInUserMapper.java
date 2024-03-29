package com.jx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jx.domain.entity.SignInUser;
import com.jx.domain.vo.ListSignInUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * (SigninUser)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-19 11:01:37
 */
public interface SignInUserMapper extends BaseMapper<SignInUser> {

    List<ListSignInUserVo> listSignIns(@Param("activityName") String activityName, @Param("locationId") Long locationId, @Param("typeId") Long typeId, @Param("timeSlotId") Long timeSlotId);
}

