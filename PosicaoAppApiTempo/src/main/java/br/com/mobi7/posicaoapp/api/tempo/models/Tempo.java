package br.com.mobi7.posicaoapp.api.tempo.models;


public class Tempo {

	    private String placa;	    
	    private String pontoInteresse;	    
	    private Long tempo;
	    
	    public Tempo(String placa, String pontoInteresse, Long tempo) {
	        this.placa = placa;
	        this.pontoInteresse = pontoInteresse;
	        this.tempo = tempo;
	    }
		
	    public Tempo() {
	        
	    }

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getPontoInteresse() {
			return pontoInteresse;
		}

		public void setPontoInteresse(String pontoInteresse) {
			this.pontoInteresse = pontoInteresse;
		}

		public Long getTempo() {
			return tempo;
		}

		public void setTempo(Long tempo) {
			this.tempo = tempo;
		}
}
