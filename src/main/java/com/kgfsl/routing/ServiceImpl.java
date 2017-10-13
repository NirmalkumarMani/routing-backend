package com.kgfsl.routing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kgfsl.routing.Register;
import com.kgfsl.routing.Repository;
import com.kgfsl.routing.RegService;

@Service
public class ServiceImpl implements RegService{

    @Autowired
    private Repository repository;
     
     	@Override
	public Register createRegistration(Register register) {
		return repository.save(register);
	}
}