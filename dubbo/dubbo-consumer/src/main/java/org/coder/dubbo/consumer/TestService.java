package org.coder.dubbo.consumer;

import org.coder.dubbo.api.ExceptionTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by coder on 16/8/29.
 */
@Service
public class TestService {

    @Resource(name = "exceptionTestService1")
    private ExceptionTestService exceptionTestService1;

    public void notException() {
        exceptionTestService1.notException();
    }


}
