package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<ClienteEntity, Long> {
}
