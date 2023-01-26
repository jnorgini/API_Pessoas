package com.juliananorgini.API_Pessoas.entities.enums;

public enum TipoPessoa {
	
	FISICA(1),
	JURIDICA(2);
	
	private int code;
	
	private TipoPessoa(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TipoPessoa valueOf(int code) {
		for(TipoPessoa value : TipoPessoa.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TipoPessoa code");
	}

}
