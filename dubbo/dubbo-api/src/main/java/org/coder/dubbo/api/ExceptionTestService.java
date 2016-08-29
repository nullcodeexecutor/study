package org.coder.dubbo.api;

/**
 * Created by coder on 16/8/28.
 */
public interface ExceptionTestService {

    String notException();

    String throwException(int type);

}
