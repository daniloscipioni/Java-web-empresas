package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;



@WebServlet(urlPatterns = "/busca")
public class BuscaEmpresa implements Tarefa {
		
	public BuscaEmpresa() {
        System.out.println("Instanciando uma Servlet do tipo BuscaEmpresa "
                + this);
    }
	
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		String filtro = req.getParameter("filtro"); // Variável local - deve permanecer desta forma para que em cada requisição assuma um valor
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		req.setAttribute("empresas", empresas);
		
		return "/WEB-INF/pages/buscaEmpresa.jsp";
	}   
	
	/* String filtro;*/ //variavel membro ou variavel global - se manter esta declaração, caso for feita duas requisições com a thread, 
	//todas as buscas retornarão o resultado da última busca pois essa variável altera o valor para o último valor 
	 /*  @Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException{
		

	   
		String filtro = req.getParameter("filtro"); // Variável local - deve permanecer desta forma para que em cada requisição assuma um valor
		*/
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		req.setAttribute("empresas", empresas);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/buscaEmpresa.jsp");
		dispatcher.forward(req, resp);*/

	/*}
	   */
	 

	

}
