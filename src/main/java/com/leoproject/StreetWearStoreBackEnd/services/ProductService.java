package com.leoproject.StreetWearStoreBackEnd.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.leoproject.StreetWearStoreBackEnd.entities.Product;
import com.leoproject.StreetWearStoreBackEnd.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
    @Value("${image.upload.directory}")
    private String uploadDirectory;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Integer id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
	
	public List<Product> findByBrand(String brand){
		List<Product> products = productRepository.findByBrand(brand);
		return products;
	}
	
	 public Product salvarProdutoComImagem(MultipartFile file, Product product) throws IOException {
	        String fileName = file.getOriginalFilename();
	        // Converte o caminho relativo para absoluto
	        String absolutePath = new File(uploadDirectory).getAbsolutePath();
	        File dest = new File(absolutePath + "/" + fileName);
	        // Cria o diretório se não existir
	        Files.createDirectories(Paths.get(absolutePath));
	        file.transferTo(dest);

	        product.setUrlCover("/upload/" + fileName);
	        return productRepository.save(product);
	    }
}
