package com.fabiosilva.dscatalog.services.exceptions;

// tratar erros
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
