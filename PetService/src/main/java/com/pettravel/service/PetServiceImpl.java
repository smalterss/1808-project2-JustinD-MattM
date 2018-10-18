package com.pettravel.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.pettravel.dao.PetRepository;
@RunWith(MockitoJUnitRunner.class)
public class PetServiceImpl implements PetService {

	@Mock
	PetRepository rp;
	
	@injectMocks
	PetService ps;
	
	@Autowired
	PetRepository pr;
	
	@Override
	
	@Before
}f
