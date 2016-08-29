package org.coder.dubbo.provider.impl;

import org.coder.dubbo.api.ExceptionTestService;
import org.springframework.stereotype.Service;

/**
 * Created by coder on 16/8/28.
 */
@Service("exceptionTestService")
public class ExceptionTestServiceImpl implements ExceptionTestService {
    public String notException() {
        return "notException";
    }

    public String throwException(int type) {
        if (0 == type) {
            return "throwException";
        }
        if (1 == type) {
            //测试抛出一个Dubbo-API中不存在的exception
            throw new MyException();
        }
        if (2 == type) {
            throw new NullPointerException();
        }
        throw new IllegalStateException();
    }
}
