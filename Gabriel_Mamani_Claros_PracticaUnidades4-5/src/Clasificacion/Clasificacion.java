package Clasificacion;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 
 * Clase auxiliar que se emplear� para el modelo de datos del TableView
 * 
 * @author SBF
 * 
 */
public class Clasificacion {
    private final SimpleStringProperty nombreEquipo;
    private final SimpleIntegerProperty partidosJugados;
    private final SimpleIntegerProperty partidosVencidos;
    private final SimpleIntegerProperty partidosEmpatados;
    private final SimpleIntegerProperty partidosPerdidos;
    private final SimpleIntegerProperty totalPuntos;
 
    public Clasificacion(String nEquipo, Integer pJugados, Integer pVencidos, Integer pEmpatados, Integer pDerrotados, Integer tPuntos) {
        this.nombreEquipo = new SimpleStringProperty(nEquipo);
        this.partidosJugados = new SimpleIntegerProperty(pJugados);
        this.partidosVencidos = new SimpleIntegerProperty(pVencidos);
        this.partidosEmpatados = new SimpleIntegerProperty(pEmpatados);
        this.partidosPerdidos = new SimpleIntegerProperty(pDerrotados);
        this.totalPuntos = new SimpleIntegerProperty(tPuntos);
    }
    public String getNombreEquipo() {
        return nombreEquipo.get();
    }
    
    public void setNombreEquipo(String nEquipo) {
    	nombreEquipo.set(nEquipo);
    }
    //
    public Integer getPartidosJugados() {
        return partidosJugados.get();
    }
    
    public void setPartidosJugados(Integer pJugados) {
    	partidosJugados.set(pJugados);
    }
    //
    public Integer getPartidosVencidos() {
        return partidosVencidos.get();
    }
    
    public void setPartidosVencidos(Integer pVencidos) {
    	partidosVencidos.set(pVencidos);
    }
    //    
    public Integer getPartidosEmpatados() {
        return partidosEmpatados.get();
    }
    public void setPartidosEmpatados(Integer pEmpatados) {
    	partidosEmpatados.set(pEmpatados);
    }
    //
    public Integer getPartidosPerdidos() {
        return partidosPerdidos.get();
    }
    public void setPartidosPerdidos(Integer pDerrotados) {
    	partidosPerdidos.set(pDerrotados);
    }
    //
	public Integer getTotalPuntos() {
		return totalPuntos.get();
	}
	public void setTotalPuntos(Integer tPuntos) {
		totalPuntos.set(tPuntos);
    }        
        
}