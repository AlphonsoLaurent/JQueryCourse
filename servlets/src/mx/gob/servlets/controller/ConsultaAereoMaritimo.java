package mx.gob.servlets.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import mx.gob.servlets.modelo.ResultadoVO;

/**
 * Servlet implementation class ConsultaAereoMaritimo
 */
@WebServlet("/ConsultaAereoMaritimo")
public class ConsultaAereoMaritimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaAereoMaritimo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doPost(request, response);
		System.out.println("Esta es una peticion por GET");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Esta es una peticion por POST");
//		doGet(request, response);
		
		
		List<ResultadoVO> lstResultado=new ArrayList<ResultadoVO>();
		
		ResultadoVO result=null;
		result=new ResultadoVO();
		result.setItems("CUESTIONARIO");
		result.setPuntuacion(8);
		result.setInterpretacion("Sugerencia de alteración  importante en  las funciones cognoscitivas que  probablemente afectará en las funciones que la licencia Federal le confiere. Se remite al usuario a  atención especializada del servicio de neurología.");
		lstResultado.add(result);
		
		result=new ResultadoVO();
		result.setItems("FIGURA");
		result.setPuntuacion(2);
		result.setInterpretacion("Al momento de la evaluación, no se sugieren alteraciones en la función cognoscitiva -  visual");
		lstResultado.add(result);
		
		result=new ResultadoVO();
		result.setItems("RELOJ");
		result.setPuntuacion(1);
		result.setInterpretacion("Al momento de la evaluación, no se sugiere deterioro en la función ejecutiva -  memoria.");
		lstResultado.add(result);
		
		result=new ResultadoVO();
		result.setItems("LAMINAS");
		result.setPuntuacion(2);
		result.setInterpretacion("Al momento de la evaluación, no se sugiere deterioro en la función sensorial -  memoria.");
		lstResultado.add(result);
		
		for (ResultadoVO resultadoVO : lstResultado) {
			System.out.println(resultadoVO.toString());
		}
		
	}

}
