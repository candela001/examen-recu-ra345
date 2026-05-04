/**
 * 
 */
package org.lapaloma.gobierno.controller;

import java.util.List;

import org.lapaloma.gobierno.service.MinisterioService;
import org.lapaloma.gobierno.vo.Ministerio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Isidoro Nevares Martín - Virgen de la Paloma Fecha creación: 13 mar 2026
 */
@RestController
@RequestMapping("/gobierno/ministerios")
public class MinisterioController {
    private final MinisterioService ministerioService;

    // Spring inyecta automáticamente el service con su DAO
    public MinisterioController(MinisterioService ministerioService) {
        this.ministerioService = ministerioService;
    }

    // GET /gobierno/ministerios - listar todos los ministerio
    @GetMapping
    public List<Ministerio> getAll() {
        List<Ministerio> listaCasas = ministerioService.obtenerListaMinisterios();
        return listaCasas;
    }

 
}
