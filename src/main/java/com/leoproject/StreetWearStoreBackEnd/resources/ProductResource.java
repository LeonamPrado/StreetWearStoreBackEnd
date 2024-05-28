package com.leoproject.StreetWearStoreBackEnd.resources;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List <Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id){
		Product p = service.findById(id);
		return ResponseEntity.ok().body(p);
	}
	
	@GetMapping(value = "/brand/{brand}")
	public ResponseEntity<List<Product>> findById(@PathVariable String brand){
		List<Product> p = service.findByBrand(brand);
		return ResponseEntity.ok().body(p);
	}
	
    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file, @ModelAttribute Product product) {
        try {
            Product savedProduto = service.salvarProdutoComImagem(file, product);
            return new ResponseEntity<>(savedProduto, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>("Falha no upload da imagem: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
