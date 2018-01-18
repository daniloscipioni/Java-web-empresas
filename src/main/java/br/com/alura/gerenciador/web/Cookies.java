package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;

public class Cookies {
	
	 private final Cookie[] cookies;

	    public Cookies(Cookie[] cookies) {
	        this.cookies = cookies;
	    }
	    
	    public Cookie getUsuarioLogado() {
	        if (cookies == null)
	            return null; //se não encontrar o usuário logado ele retorna null
	        for (Cookie cookie : cookies) {
	            if (cookie.getName().equals("usuario.logado")) {
	                return cookie;//retorna o usuário que está logado
	            }
	        }
	        return null;
	    }
}
