package br.com.jbasketball.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "placar")
	private int placar;
	
	@Column(name = "min_temporada")
	private int minimoTemporada;
	
	@Column(name = "max_temporada")
	private int maximoTemporada;
	
	@Column(name = "qr_minimo")
	private int quebraRecordeMinimo;
	
	@Column(name = "qr_maximo")
	private int quebraRecordeMaximo;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getPlacar() {
		return placar;
	}
	
	public void setPlacar(int placar) {
		this.placar = placar;
	}
	
	public int getMinimoTemporada() {
		return minimoTemporada;
	}
	
	public void setMinimoTemporada(int minimoTemporada) {
		this.minimoTemporada = minimoTemporada;
	}
	
	public int getMaximoTemporada() {
		return maximoTemporada;
	}
	
	public void setMaximoTemporada(int maximoTemporada) {
		this.maximoTemporada = maximoTemporada;
	}
	
	public int getQuebraRecordeMinimo() {
		return quebraRecordeMinimo;
	}
	
	public void setQuebraRecordeMinimo(int quebraRecordeMinimo) {
		this.quebraRecordeMinimo = quebraRecordeMinimo;
	}
	
	public int getQuebraRecordeMaximo() {
		return quebraRecordeMaximo;
	}
	
	public void setQuebraRecordeMaximo(int quebraRecordeMaximo) {
		this.quebraRecordeMaximo = quebraRecordeMaximo;
	}

}
