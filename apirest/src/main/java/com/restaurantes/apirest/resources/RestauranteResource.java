package com.restaurantes.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.restaurantes.apirest.repository.RestauranteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.restaurantes.apirest.models.Restaurante;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Restaurantes")
@CrossOrigin(origins="*")
public class RestauranteResource {
	
	@Autowired
	RestauranteRepository restauranteRepository;
	
	/** Retornando uma lista de restaurantes cadastradados */
	@GetMapping("/restaurantes")
	@ApiOperation(value="Retorna uma lista de Restaurantes")
	public List<Restaurante> listaRestaurantes(){
		return restauranteRepository.findAll();
	}
	
	@GetMapping("/restaurante/{id}")
	@ApiOperation(value="Retorna um restaurante unico")
	public Restaurante listaRestauranteUnico(@PathVariable(value="id") long id){
		return restauranteRepository.findById(id);
	}
	
	@PostMapping("/restaurante")
	@ApiOperation(value="Salva um restaurante")
	public Restaurante salvarRestaurante(@RequestBody Restaurante restaurante) {
		return restauranteRepository.save(restaurante);
	}
	
	@DeleteMapping("/restaurante")
	@ApiOperation(value="Deleta um restaurante")
	public void deletaRestaurante(@RequestBody Restaurante restaurante) {
		restauranteRepository.delete(restaurante);
	}
	
	@PutMapping("/restaurante")
	@ApiOperation(value="Atualiza um restaurante")
	public Restaurante atualizaRestaurante(@RequestBody Restaurante restaurante) {
		return restauranteRepository.save(restaurante);
	}

}
