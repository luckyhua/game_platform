package com.liegou.platform.service;

import com.liegou.platform.domain.UserInfo;
import com.liegou.platform.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luckyhua
 * @version 1.0
 * @date 2017/3/29
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public List<UserInfo> list() {
        return userInfoRepository.findAll();
    }

    public Boolean remove(Long id) {
        userInfoRepository.delete(id);
        return Boolean.TRUE;
    }

}
