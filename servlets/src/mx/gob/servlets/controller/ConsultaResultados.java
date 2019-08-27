package mx.gob.servlets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import mx.gob.servlets.modelo.ResultadoVO;

@WebServlet("/consultaResultados")
public class ConsultaResultados extends HttpServlet {

//	public static final Integer CONSULTA_MARITIMA = 1;
//	public static final Integer CONSULTA_AUTOTRANSPORTE = 2;
//	public static final Integer CONSULTA_85_PREGUNTAS = 3;
	private static final long serialVersionUID = -7774596332009530529L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Esta es una peticion por GET");

		doPost(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Esta es una peticion por POST");
		Integer opcion = Integer.valueOf(request.getParameter("opcion").toString());
//		Integer numPersona = Integer.valueOf(request.getParameter("numPersona").toString());
		switch (opcion) {
		case 1:
			getConsultaMaritimo(response);
			break;
		case 2:
			getConsultaAutoFerroviario(response);
			break;
		case 3:
			getConsulta85Preguntas(response);
			break;
		}
	}

	private void getConsultaMaritimo(HttpServletResponse response) throws IOException {
		List<ResultadoVO> lstResultado = new ArrayList<ResultadoVO>();

		ResultadoVO resultadoVO = null;
		resultadoVO = new ResultadoVO();
		resultadoVO.setItems("CUESTIONARIO");
		resultadoVO.setPuntuacion(8);
		resultadoVO.setInterpretacion(
				"Sugerencia de alteración  importante en  las funciones cognoscitivas que  probablemente afectará en las funciones que la licencia Federal le confiere. Se remite al usuario a  atención especializada del servicio de neurología.");
		lstResultado.add(resultadoVO);

		resultadoVO = new ResultadoVO();
		resultadoVO.setItems("FIGURA");
		resultadoVO.setPuntuacion(2);
		resultadoVO.setInterpretacion(
				"Al momento de la evaluación, no se sugieren alteraciones en la función cognoscitiva -  visual");
		lstResultado.add(resultadoVO);

		resultadoVO = new ResultadoVO();
		resultadoVO.setItems("RELOJ");
		resultadoVO.setPuntuacion(1);
		resultadoVO.setInterpretacion(
				"Al momento de la evaluación, no se sugiere deterioro en la función ejecutiva -  memoria.");
		lstResultado.add(resultadoVO);

		resultadoVO = new ResultadoVO();
		resultadoVO.setItems("LAMINAS");
		resultadoVO.setPuntuacion(2);
		resultadoVO.setInterpretacion(
				"Al momento de la evaluación, no se sugiere deterioro en la función sensorial -  memoria.");
		lstResultado.add(resultadoVO);

		PrintWriter pw = response.getWriter();
		Gson gson = new Gson();

		pw.println(gson.toJson(lstResultado));
		pw.close();
	}

	private void getConsultaAutoFerroviario(HttpServletResponse response) throws IOException {
		List<ResultadoVO> lstResultadoauF = new ArrayList<ResultadoVO>();

		ResultadoVO resultadoVOauF = null;
		resultadoVOauF = new ResultadoVO();
		resultadoVOauF.setItems("CUESTIONARIO");
		resultadoVOauF.setPuntuacion(8);
		resultadoVOauF.setInterpretacion(
				"Sugerencia de alteración  importante en  las funciones cognoscitivas que  probablemente afectará en las funciones que la licencia Federal le confiere. Se remite al usuario a  atención especializada del servicio de neurología.");
		lstResultadoauF.add(resultadoVOauF);

		resultadoVOauF = new ResultadoVO();
		resultadoVOauF.setItems("FIGURA");
		resultadoVOauF.setPuntuacion(5);
		resultadoVOauF.setInterpretacion(
				"Al momento de la evaluación, se sugiere deterioro moderado que pudiera repercutir de en las funciones cognoscitivas -  visual.  Es necesario interconsulta con servicio de neurología para descartar alguna alteración a modo preventivo");
		lstResultadoauF.add(resultadoVOauF);

		resultadoVOauF = new ResultadoVO();
		resultadoVOauF.setItems("RELOJ");
		resultadoVOauF.setPuntuacion(1);
		resultadoVOauF.setInterpretacion(
				"Al momento de la evaluación, no se sugiere deterioro en la función ejecutiva -  memoria.");
		lstResultadoauF.add(resultadoVOauF);

		resultadoVOauF = new ResultadoVO();
		resultadoVOauF.setItems("LAMINAS");
		resultadoVOauF.setPuntuacion(2);
		resultadoVOauF.setInterpretacion(
				"Al momento de la evaluación, no se sugiere deterioro en la función sensorial -  memoria.");
		lstResultadoauF.add(resultadoVOauF);

		PrintWriter pw = response.getWriter();

		Gson gson2 = new Gson();

		pw.println(gson2.toJson(lstResultadoauF));
		pw.close();
	}
	
	
	private void getConsulta85Preguntas(HttpServletResponse response) throws IOException {
		List<ResultadoVO> lstResultado85=new ArrayList<ResultadoVO>();
		
		ResultadoVO resultadoVO85=null;
		resultadoVO85=new ResultadoVO();
		resultadoVO85.setItems("TRASTORNO PARANOIDE DE LA PERSONALIDAD");
		resultadoVO85.setPuntuacion(0);
		resultadoVO85.setNivel("APTO");
		resultadoVO85.setInterpretacion("Al momento de la evaluación, no se reportan  síntomas clínico psicológicos que sugieran rasgos de personalidad que interfieran con las funciones que su Licencia Federal le confiere.");
		lstResultado85.add(resultadoVO85);
		
		resultadoVO85=new ResultadoVO();
		resultadoVO85.setItems("TRASTORNO ESQUIZOTIPICO DE LA PERSONALIDAD");
		resultadoVO85.setPuntuacion(0);
		resultadoVO85.setNivel("APTO");
		resultadoVO85.setInterpretacion("Al momento de la evaluación, no se reportan  síntomas clínico psicológicos que sugieran rasgos de personalidad que interfieran con las funciones que su Licencia Federal le confiere.");
		lstResultado85.add(resultadoVO85);
		
		resultadoVO85=new ResultadoVO();
		resultadoVO85.setItems("TRASTORNO ESQUIZOIDE DE LA PERSONALIDAD");
		resultadoVO85.setPuntuacion(0);
		resultadoVO85.setNivel("APTO");
		resultadoVO85.setInterpretacion("Al momento de la evaluación, no se reportan  síntomas clínico psicológicos que sugieran rasgos de personalidad que interfieran con las funciones que su Licencia Federal le confiere.");
		lstResultado85.add(resultadoVO85);
		
		resultadoVO85=new ResultadoVO();
		resultadoVO85.setItems("TRASTORNO LÍMITE DE LA PERSONALIDAD");
		resultadoVO85.setPuntuacion(0);
		resultadoVO85.setNivel("APTO");
		resultadoVO85.setInterpretacion("Al momento de la evaluación, no se reportan  síntomas clínico psicológicos que sugieran rasgos de personalidad que interfieran con las funciones que su Licencia Federal le confiere.");
		lstResultado85.add(resultadoVO85);
		
		
		PrintWriter pw1=response.getWriter();
		
		Gson gson1= new Gson();
		
		pw1.println(gson1.toJson(lstResultado85));
		pw1.close();
	}

}
