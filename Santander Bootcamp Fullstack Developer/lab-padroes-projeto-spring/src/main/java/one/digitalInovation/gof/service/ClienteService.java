package one.digitalInovation.gof.service;

import one.digitalInovation.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscaTodos();
    Cliente buscaPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(long id);
}
