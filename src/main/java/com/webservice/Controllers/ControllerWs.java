package com.webservice.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webservice.Models.Transportadora;

@Controller
public class ControllerWs {

	List<Transportadora> transportadoras;

	public ControllerWs() {
		transportadoras = new ArrayList<Transportadora>();

		Map<String, Float> valor_km = new HashMap<String, Float>();
		List<String> tipo_transporte = new ArrayList<String>();
		Map<String, Float> tempo_medio = new HashMap<String, Float>();
		valor_km.put("A", 200F);
		valor_km.put("T", 75F);
		tipo_transporte.add("Aéreo");
		tipo_transporte.add("Terrestre");
		tempo_medio.put("A", 30F);
		tempo_medio.put("T", 59F);
		Transportadora t2 = new Transportadora(2, valor_km, tipo_transporte, tempo_medio);

		Map<String, Float> valor_km_3 = new HashMap<String, Float>();
		List<String> tipo_transporte_3 = new ArrayList<String>();
		Map<String, Float> tempo_medio_3 = new HashMap<String, Float>();
		valor_km_3.put("A", 180F);
		valor_km_3.put("T", 55F);
		tipo_transporte_3.add("Aéreo");
		tipo_transporte_3.add("Terrestre");
		tempo_medio_3.put("A", 33F);
		tempo_medio_3.put("T", 1.05F);
		Transportadora t3 = new Transportadora(3, valor_km_3, tipo_transporte_3, tempo_medio_3);

		Map<String, Float> valor_km_4 = new HashMap<String, Float>();
		List<String> tipo_transporte_4 = new ArrayList<String>();
		Map<String, Float> tempo_medio_4 = new HashMap<String, Float>();
		valor_km_4.put("A", 175F);
		tipo_transporte_4.add("Aéreo");
		tempo_medio_4.put("A", 30F);
		Transportadora t4 = new Transportadora(4, valor_km_4, tipo_transporte_4, tempo_medio_4);

		transportadoras.add(t2);
		transportadoras.add(t3);
		transportadoras.add(t4);

	}

	@GetMapping("/transportadora")
	@ResponseBody
	public List<Transportadora> listar() {
		return transportadoras;
	}
}
