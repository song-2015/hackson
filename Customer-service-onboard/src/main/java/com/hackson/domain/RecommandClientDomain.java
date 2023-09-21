package com.hackson.domain;

import java.util.List;

/**
 * Created by song on 2023/9/21.
 */
public class RecommandClientDomain extends BaseClientDomain {

    private List<String> recommandServices;

    public List<String> getRecommandServices() {
        return recommandServices;
    }

    public void setRecommandServices(List<String> recommandServices) {
        this.recommandServices = recommandServices;
    }
}
