package br.com.caelum.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup	// Indica ao EJB Container que o Singleton deve ser carregado no inicio da aplicação
public class Agendador {

	@Schedule(hour="*", minute="*", second="*/10")
	void agendado(){
		System.out.println("verificando serviço externmo periodicamente");
	}
	
}
