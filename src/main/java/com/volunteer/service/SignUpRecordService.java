package com.volunteer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.volunteer.entity.SignUpRecord;
import com.volunteer.entity.vo.SignUpVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hefuren
 * @since 2021-11-07
 */
public interface SignUpRecordService extends IService<SignUpRecord> {
    /**
     * 志愿者报名
     * @param query
     * @return
     */
    int signUp(SignUpVo query);
}
