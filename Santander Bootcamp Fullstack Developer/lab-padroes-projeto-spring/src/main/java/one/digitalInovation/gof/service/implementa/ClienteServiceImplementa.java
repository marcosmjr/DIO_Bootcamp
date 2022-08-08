package one.digitalInovation.gof.service.implementa;

import io.swagger.v3.oas.annotations.servers.Server;
import one.digitalInovation.gof.model.Cliente;
import one.digitalInovation.gof.model.ClienteRepository;
import one.digitalInovation.gof.model.Endereco;
import one.digitalInovation.gof.model.EnderecoRepositorio;
import one.digitalInovation.gof.service.ClienteService;
import one.digitalInovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImplementa implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepositorio enderecoRepositorio;

    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Cliente> buscaTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscaPorId(Long id) {

        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (!cliente.isPresent()) return null;
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvaClienteComCep(cliente);
    }



    @Override
    public void atualizar(Long id, Cliente cliente) {

        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvaClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(long id) {

        clienteRepository.deleteById(id);

    }



    private void salvaClienteComCep(Cliente cliente) {

        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepositorio.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepositorio.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }


}
