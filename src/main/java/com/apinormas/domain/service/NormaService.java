package com.apinormas.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apinormas.domain.model.NormaEntity;
import com.apinormas.domain.reporitory.NormaRepository;

@Service
public class NormaService {
	
	@Autowired
	NormaRepository normaRepository;
	
	public NormaEntity salva(NormaEntity norma) {
		
		return normaRepository.save(norma);
	}
	
	public List<NormaEntity> obter(){
		
		return (List<NormaEntity>) normaRepository.findAll();
	}
	
	public Optional<NormaEntity> obterPorCodigo(String codigo){
		
		return  normaRepository.findById(codigo);
	}

}
