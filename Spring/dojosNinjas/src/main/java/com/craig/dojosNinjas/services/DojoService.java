package com.craig.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craig.dojosNinjas.models.Dojo;
import com.craig.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;

	// retrieves all the dojos
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}

	// creates a dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}

	// retrieves a dojo if it exists (optional)
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}

	public Dojo updateDojo(Dojo dojo) {
		return dojoRepository.save(dojo);

	}

	// delete a dojo
	public void delete(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			dojoRepository.deleteById(id);
		}
	}
}
