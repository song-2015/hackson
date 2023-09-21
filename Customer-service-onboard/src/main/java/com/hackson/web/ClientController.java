package com.hackson.web;

import com.hackson.dao.ClientRepository;
import com.hackson.domain.ClientCustomValDomain;
import com.hackson.domain.ClientDomain;
import com.hackson.domain.RecommandClientDomain;
import com.hackson.entity.ClientEntity;
import com.hackson.remote.MachineLearnRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by song on 2023/9/21.
 */
@RestController("/clients")
public class ClientController {

    @Autowired
    private MachineLearnRemote machineLearnRemote;

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/{clientId}")
    public ClientDomain getById(@PathVariable String clientId) {
        if (!StringUtils.hasLength(clientId)) {
            return null;
        }
        Optional<ClientEntity> optional = clientRepository.findById(clientId);
        return optional.isPresent() ? new ClientDomain(optional.get()) : null;

    }

    @GetMapping("/custom-value")
    public List<ClientCustomValDomain> clientCustomVal() {
        Map<String, Double> valueMap = machineLearnRemote.getCustomValue();

        Map<String, ClientEntity> allClients = new HashMap<>();
        clientRepository.findAll().forEach(clientEntity -> allClients.put(clientEntity.getClientId(), clientEntity));

        List<ClientCustomValDomain> result = new ArrayList<>();
        if (null != valueMap && !valueMap.isEmpty()) {
            valueMap.forEach((clientId, customValue) -> {
                result.add(new ClientCustomValDomain(allClients.get(clientId), customValue));
            });
        }

        return result;
    }

    @GetMapping("/recommand")
    public List<RecommandClientDomain> getRecommandList() {
        return null;
    }


}
