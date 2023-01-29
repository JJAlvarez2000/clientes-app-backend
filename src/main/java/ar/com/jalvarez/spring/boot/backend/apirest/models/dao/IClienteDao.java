package ar.com.jalvarez.spring.boot.backend.apirest.models.dao;

import ar.com.jalvarez.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
