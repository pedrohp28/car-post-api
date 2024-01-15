package com.portal.api.controller;

import com.portal.api.dtos.OwnerPostDTO;
import com.portal.api.service.OwnerPostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/owner")
@Tag(name = "Owner Post", description = "Endpoint para criar o perfil do anunciante")
public class OwnerPostController {

    private final Logger LOG = LoggerFactory.getLogger(OwnerPostController.class);

    @Autowired
    private OwnerPostService ownerPostService;

    @PostMapping
    @Operation(summary = "Criar anunciante", description = "Permite criar um anunciante")
    public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO){
        LOG.info("USANDO API REST - Criando Novo Usuário: {}", ownerPostDTO);
        ownerPostService.createOwnerCar(ownerPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

