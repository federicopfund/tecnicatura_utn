package Servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		contexto.register(SpringConfigurador.class);
		contexto.refresh();
		
		servicio miservicio= contexto.getBean(servicio.class);
		System.out.println(miservicio.mensaje());
		contexto.close();
		
	}

}
