package org.jeasy.flows.work;

/**
 * @author chenhao.ych
 * @date 2019-06-10
 */
public interface ParallelWork extends Work {

    void catchTimeoutException(Exception e);

}
