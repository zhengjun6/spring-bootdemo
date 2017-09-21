package com.fiberhome.imc.Test.service;

import org.springframework.stereotype.Service;

@Service
public interface Operation {
	
	void add(String name,String pd);
	void delt(String name);

}
