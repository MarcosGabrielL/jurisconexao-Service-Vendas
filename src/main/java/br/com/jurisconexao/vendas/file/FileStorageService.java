/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jurisconexao.vendas.file;

/**
 *
 * @author Marcos
 */

import br.com.jurisconexao.vendas.models.Produto;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileStorageService {

  @Autowired
  private FileDBRepository fileDBRepository;

  public FileDB store(MultipartFile file, String idpost, String idvendedor) throws IOException {
      
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    FileDB FileDB = new FileDB();
    FileDB.setData(file.getBytes());
    FileDB.setIdpost(idpost);
    FileDB.setIdvendedor(idvendedor);
    FileDB.setName(fileName);
    FileDB.setType(file.getContentType());

    return fileDBRepository.save(FileDB);
  }
  
  
   public FileDB storeupdate(MultipartFile file, String idpost, String idvendedor, Long id) throws IOException {
      
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    FileDB FileDB = new FileDB();
    FileDB.setId(id);
    FileDB.setData(file.getBytes());
    FileDB.setIdpost(idpost);
    FileDB.setIdvendedor(idvendedor);
    FileDB.setName(fileName);
    FileDB.setType(file.getContentType());

    return fileDBRepository.save(FileDB);
  }
   
   public FileDB storeBanner(MultipartFile file, String idpost, String idvendedor, String id) throws IOException {
	      
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    FileDB FileDB = new FileDB();
	    FileDB.setIdbanner(id);
	    FileDB.setData(file.getBytes());
	    FileDB.setIdpost("");
	    FileDB.setIdvendedor(idvendedor);
	    FileDB.setName(fileName);
	    FileDB.setType("banner");

	    return fileDBRepository.save(FileDB);
	  }

  public FileDB getFile(Long id) {
    return fileDBRepository.findById(id).get();
  }
  
  public List<FileDB> findByIdProduto(String id) {
    return fileDBRepository.findByIdProduto(id);
  }
  
  public List<FileDB> findByIdVendedor(String id) {
    return fileDBRepository.findByIdVendedor(id);
  }
  
  public List<FileDB> findBannerByIdProduto(String id) {
	    return fileDBRepository.findBannerByIdProduto(id);
	  }
  
  public Stream<FileDB> getAllFiles() {
    return fileDBRepository.findAll().stream();
  }
  
  public void deleteBannersFromVendedor(String idvendedor) {
	  try{
	     fileDBRepository.deleteBannersFromVendedor(idvendedor);
	  }catch(DataIntegrityViolationException e){
		  System.err.println(e.getMessage());
          throw new DataIntegrityViolationException(
                  "Não foi possivel deletar os Arquivos");
      }
  }
}
