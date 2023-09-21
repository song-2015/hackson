package com.hackson.remote;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by song on 2023/9/21.
 */
@Service
public class MachineLearnRemote {

    public Map<String, Double> getCustomValue() {
        return new HashMap<>();
    }

    public List<Map<String, Object>> getRecommandations() {
        return null;
    }

    public Double getPredictByclientId(String clientId) {
        return null;
    }
}
