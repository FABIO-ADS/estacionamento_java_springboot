package com.biomello.demoparkapi.service;

import com.biomello.demoparkapi.entity.Usuario;
import com.biomello.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Transactional
    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Transactional(readOnly = true)
    public  Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado!!")
        );
    }
    @Transactional
    public Usuario editarSenha(Long id, String password) {

        Usuario user = buscarPorId(id);

        user.setPassword(password);

        return user;
    }
}
