package com.hackson.dao;

import com.hackson.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by song on 2023/9/21.
 */
public interface ClientRepository extends JpaRepository<ClientEntity, String> {

}
