package com.generation.aisv.myappdb;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.aisv.myappdb.models.UsuarioModel;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc

class Proyecto03jpaApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void PruebaPOST() throws Exception {
		UsuarioModel u = new UsuarioModel();
		u.setEmail("alansv96");
		u.setNombre("pepito");
		u.setPrioridad(4);
		
		this.mockMvc.perform(post("/usuario").contentType(MediaType.APPLICATION_JSON) 
				.content(asJsonString(u)))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("pepito")));
	}
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString

	
	
	@Test
	@Disabled("Se deshabilita temporalmente para no borrar registros en cada prueba")
	@DisplayName("Prueba el metodoDELETE")
	public void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete("/usuario/2")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("pancho")));
	}

	@Test
	@DisplayName("prueba el metodo get con su id: 1 y su contenido")
	public void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/usuario/1")).andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("alan")));
		
	}// prueba metodo GET
	
	

}
