package com.liegou.platform.repository;

import com.liegou.platform.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${DESCRIPTION}
 *
 * @author luckyhua
 * @version 1.0
 * @date 2017/3/29
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    UserInfo findByCellphone(String cellphone);
}
