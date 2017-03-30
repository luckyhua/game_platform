package com.liegou.platform;

import com.liegou.platform.domain.UserInfo;
import com.liegou.platform.repository.UserInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ${DESCRIPTION}
 *
 * @author luckyhua
 * @version 1.0
 * @date 2017/3/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Entry.class)
public class JpaTest {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void test() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setCellphone("11111111");
        userInfo.setNickname("test");
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setCellphone("222");
        userInfo1.setNickname("test2");
        userInfoRepository.save(userInfo);
        userInfoRepository.save(userInfo1);

        UserInfo info = userInfoRepository.findByCellphone("11111111");
        System.out.println(info);
    }
}
