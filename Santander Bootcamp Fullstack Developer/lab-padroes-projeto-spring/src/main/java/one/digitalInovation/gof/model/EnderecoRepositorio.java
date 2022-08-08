package one.digitalInovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositorio extends CrudRepository<Endereco, String> {
}
