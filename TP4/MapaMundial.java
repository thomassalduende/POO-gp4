package Trabajo4.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MapaMundial {
	
	private List<Continentes> continentes;

	public MapaMundial() {
		continentes = new ArrayList<Continentes>();
		inicializar();
	}

	public void inicializar() {

		Continentes africa = new Continentes("Africa");
		Continentes antartida = new Continentes("Antartida");
		Continentes america = new Continentes("America");
		Continentes asia = new Continentes("Asia");
		Continentes oceania = new Continentes("Oceania");
		Continentes europa = new Continentes("Europa");

		continentes.add(africa);
		continentes.add(antartida);
		continentes.add(america);
		continentes.add(asia);
		continentes.add(oceania);
		continentes.add(europa);

		Pais argentina = new Pais("Argentina", "Buenos Aires", america);
		Pais uruguay = new Pais("Uruguay", "Montevideo", america);
		Pais brasil = new Pais("Brasil", "Brasilia", america);
		Pais chile = new Pais("Chile", "Santiago de Chile", america);
		Pais paraguay = new Pais("Paraguay", "Asuncion", america);
		Pais bolivia = new Pais("Bolivia", "La paz / Sucre", america);
		Pais espania = new Pais("España", "Madrid", europa);
		Pais francia = new Pais("Francia", "Paris", europa);
		Pais italia = new Pais("Italia", "Roma", europa);
		Pais portugal = new Pais("Portugal", "Lisboa", europa);

		america.agregarPais(argentina);
		america.agregarPais(uruguay);
		america.agregarPais(brasil);
		america.agregarPais(chile);
		america.agregarPais(paraguay);
		america.agregarPais(bolivia);
		europa.agregarPais(espania);
		europa.agregarPais(francia);
		europa.agregarPais(italia);
		europa.agregarPais(portugal);

		Provincia entreRios = new Provincia("Entre Rios", argentina);
		Provincia buenosAires = new Provincia("Buenos Aires", argentina);
		Provincia santaFe = new Provincia("Santa Fe", argentina);
		Provincia corrientes = new Provincia("Corrientes", argentina);
		Provincia cordoba = new Provincia("Cordoba", argentina);
		Provincia salto = new Provincia("Salto", uruguay);
		Provincia paysandu = new Provincia("Paysandu", uruguay);
		Provincia canelones = new Provincia("Canelones", uruguay);
		Provincia rocha = new Provincia("Rocha", uruguay);
		Provincia maldonado = new Provincia("Maldonado", uruguay);

		argentina.agregarProvincia(entreRios);
		argentina.agregarProvincia(buenosAires);
		argentina.agregarProvincia(santaFe);
		argentina.agregarProvincia(corrientes);
		argentina.agregarProvincia(cordoba);
		uruguay.agregarProvincia(salto);
		uruguay.agregarProvincia(paysandu);
		uruguay.agregarProvincia(canelones);
		uruguay.agregarProvincia(rocha);
		uruguay.agregarProvincia(maldonado);

		argentina.agregarLimitrofe(uruguay);
		argentina.agregarLimitrofe(brasil);
		argentina.agregarLimitrofe(chile);
		argentina.agregarLimitrofe(bolivia);
		argentina.agregarLimitrofe(paraguay);

		uruguay.agregarLimitrofe(brasil);
		uruguay.agregarLimitrofe(argentina);
		
		francia.agregarLimitrofe(italia);
		italia.agregarLimitrofe(francia);

	}
	public List<Pais> getPaises(String nombreContinente) {
		for (Continentes continente : continentes) {
			if (continente.getNombre().equalsIgnoreCase(nombreContinente)) {
				return continente.getPaises();
			}
		}
		return null;
	}

	public List<Provincia> getProvincias(String nombrePais) {
		for (Continentes continente : continentes) {
			for (Pais pais : continente.getPaises()) {
				if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
					return pais.getProvincias();
				}
			}
		}
		return null;
	}

	public List<Pais> getLimitrofes(String nombrePais) {
		for (Continentes continente : continentes) {
			for (Pais pais : continente.getPaises()) {
				if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
					return pais.getLimitrofes();
				}
			}
		}
		return null;
	}

}