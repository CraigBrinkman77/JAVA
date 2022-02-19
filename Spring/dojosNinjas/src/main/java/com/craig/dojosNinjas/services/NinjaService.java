package com.craig.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craig.dojosNinjas.models.Ninja;
import com.craig.dojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepository;

	// retrieves all the ninjas
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}

	// creates a ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

	// retrieves a ninja if it exists (optional)
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}

	public Ninja updateNinja(Ninja ninja) {

		return ninjaRepository.save(ninja);

	}

	// delete a ninja
	public String delete(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if (optionalNinja.isPresent()) {
            ninjaRepository.deleteById(id);
            return "Deleted";
        } else {
            return "No ninja to delete";
        }
}
}
