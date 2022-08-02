package br.com.gcontato.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AdicionaContatoServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("txtnome");
		String telefone = request.getParameter("txtfone");
		String endereco = request.getParameter("txtendereco");
		out.println("<h1>Registros de Contatos</h1>");
		out.println("");
		out.println("<h3>Nome: </h3>" + nome);
		out.println("<h3>Telefone: </h3>" + telefone);
		out.println("<h3>Endereço: </h3>" + endereco);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
