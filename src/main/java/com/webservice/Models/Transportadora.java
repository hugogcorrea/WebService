package com.webservice.Models;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transportadora {
	private  Integer _id;
	private Map<String, Float> valor_km;
	private List<String> tipo_transporte;
	private Map<String, Float> tempo_medio;
	
}
