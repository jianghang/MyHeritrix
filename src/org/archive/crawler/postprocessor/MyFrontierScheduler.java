package org.archive.crawler.postprocessor;

import org.archive.crawler.datamodel.CandidateURI;

/**
 * Created by jianghang on 2017/5/14.
 */
public class MyFrontierScheduler extends FrontierScheduler {
    /**
     * @param name Name of this filter.
     */
    public MyFrontierScheduler(String name) {
        super(name);
    }

    /**
     * 针对URL进行过滤操作
     * @param caUri The CandidateURI to be scheduled.
     */
    protected void schedule(CandidateURI caUri) {
        getController().getFrontier().schedule(caUri);
    }
}
