package br.com.zup.orangetalents.vacina.controller

import br.com.zup.orangetalents.vacina.contract.service.IServiceGenerics
import br.com.zup.orangetalents.vacina.data.mappers.toDto
import br.com.zup.orangetalents.vacina.domain.models.UsuarioDto
import br.com.zup.orangetalents.vacina.message.request.UsuarioPostRequest
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/usuario")
class UsuarioController(val usuarioService: IServiceGenerics<UsuarioDto>) {

    @GetMapping
    fun get() = usuarioService.get()

    @PostMapping
    fun post(@RequestBody @Valid usuarioPost: UsuarioPostRequest): UsuarioDto {
        return usuarioService.post(usuarioPost.toDto())
    }
}