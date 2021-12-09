package com.charmander.peopleinfoservice;

import com.charmander.peopleinfoservice.entity.Person;
import com.github.tbayzin.peopleinfoservice.Personsoap;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonRepositorySoap {


private static final Map<Integer, Personsoap> people = new HashMap<>();

	@PostConstruct
	public void initData() {
		Personsoap esref = new Personsoap();
		esref.setName("Esref Sencer");
		esref.setSurname("Kuşçubaşı");
		esref.setCity("Burdur");
		esref.setTckn(87159625);

		people.put(esref.getTckn(),esref);

		Personsoap haci = new Personsoap();
		esref.setName("Hacı");
		esref.setSurname("Hüsrev");
		esref.setCity("İstanbul");
		esref.setTckn(21599025);
		people.put(haci.getTckn(),haci);


	}

	public Personsoap findPersonsoap(int tckn) {
		Assert.notNull(tckn, "Kişi tckn numarası boş olamaz");
		return people.get(tckn);
	}


}
