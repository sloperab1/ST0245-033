import java.io.Serializable;

public class Persona 
{

	String estu_consecutivo;
	String estu_exterior;
	String periodo;
	String estu_tieneetnia;
	String estu_tomo_cursopreparacion;
	String estu_cursodocentesies;
	String estu_cursoiesapoyoexterno;
	String estu_cursoiesexterna;
	String estu_simulacrotipoicfes;
	String estu_actividadrefuerzoareas;
	String estu_actividadrefuerzogeneric;
	String fami_trabajolaborpadre;
	String fami_trabajolabormadre;
	String fami_numlibros;
	String estu_inst_cod_departamento;
	String estu_tipodocumento;
	String estu_nacionalidad;
	String estu_genero;
	String estu_fechanacimiento;
	String periodo1;
	String estu_estudiante;
	String estu_pais_reside;
	String estu_depto_reside;
	String estu_cod_reside_depto;
	String estu_mcpio_reside;
	String estu_cod_reside_mcpio;
	String estu_areareside;
	String estu_valorpensioncolegio;
	String fami_educacionpadre;
	String fami_educacionmadre;
	String fami_ocupacionpadre;
	String fami_ocupacionmadre;
	String fami_estratovivienda;
	String fami_nivelsisben;
	String fami_pisoshogar;
	String fami_tieneinternet;
	String fami_tienecomputador;
	String fami_tienemicroondas;
	String fami_tienehorno;
	String fami_tieneautomovil;
	String fami_tienedvd;
	String fami_tiene_nevera;
	String fami_tiene_celular;
	String fami_telefono;
	String fami_ingresofmiliarmensual;
	String estu_trabajaactualmente;
	String estu_antecedentes;
	String estu_expectativas;
	String cole_codigo_icfes;
	String cole_cod_dane_establecimiento;
	String cole_nombre_establecimiento;
	String cole_genero;
	String cole_naturaleza;
	String cole_calendario;
	String cole_bilingue;
    String cole_caracter;
	String cole_cod_dane_sede;
	String cole_nombre_sede;
	String cole_sede_principal;
	String cole_area_ubicacion;
	String cole_jornada;
	String cole_cod_mcpio_ubicacion;
	String cole_mcpio_ubicacion;
	String cole_cod_depto_ubicacion;
	String cole_depto_ubicacion;
	String punt_lenguaje;
	String punt_matematicas;
	String punt_biologia;
	String punt_quimica;
	String punt_fisica;
	String punt_ciencias_sociales;
	String punt_filosofia;
	String punt_ingles;
	String desemp_ingles;
	String profundiza;
	String puntaje_prof;
	String desemp_prof;
	String exito;
	
	
	
	
	public Persona(String estu_consecutivo, String estu_exterior, String periodo, String estu_tieneetnia,
			String estu_tomo_cursopreparacion, String estu_cursodocentesies, String estu_cursoiesapoyoexterno,
			String estu_cursoiesexterna, String estu_simulacrotipoicfes, String estu_actividadrefuerzoareas,
			String estu_actividadrefuerzogeneric, String fami_trabajolaborpadre, String fami_trabajolabormadre,
			String fami_numlibros, String estu_inst_cod_departamento, String estu_tipodocumento,
			String estu_nacionalidad, String estu_genero, String estu_fechanacimiento, String periodo1,
			String estu_estudiante, String estu_pais_reside, String estu_depto_reside, String estu_cod_reside_depto,
			String estu_mcpio_reside, String estu_cod_reside_mcpio, String estu_areareside,
			String estu_valorpensioncolegio, String fami_educacionpadre, String fami_educacionmadre,
			String fami_ocupacionpadre, String fami_ocupacionmadre, String fami_estratovivienda,
			String fami_nivelsisben, String fami_pisoshogar, String fami_tieneinternet, String fami_tienecomputador,
			String fami_tienemicroondas, String fami_tienehorno, String fami_tieneautomovil, String fami_tienedvd,
			String fami_tiene_nevera, String fami_tiene_celular, String fami_telefono,
			String fami_ingresofmiliarmensual, String estu_trabajaactualmente, String estu_antecedentes,
			String estu_expectativas, String cole_codigo_icfes, String cole_cod_dane_establecimiento,
			String cole_nombre_establecimiento, String cole_genero, String cole_naturaleza, String cole_calendario,
			String cole_bilingue, String cole_caracter, String cole_cod_dane_sede, String cole_nombre_sede,
			String cole_sede_principal, String cole_area_ubicacion, String cole_jornada,
			String cole_cod_mcpio_ubicacion, String cole_mcpio_ubicacion, String cole_cod_depto_ubicacion,
			String cole_depto_ubicacion, String punt_lenguaje, String punt_matematicas, String punt_biologia,
			String punt_quimica, String punt_fisica, String punt_ciencias_sociales, String punt_filosofia,
			String punt_ingles, String desemp_ingles, String profundiza, String puntaje_prof, String desemp_prof,
			String exito) {
		super();
		this.estu_consecutivo = estu_consecutivo;
		this.estu_exterior = estu_exterior;
		this.periodo = periodo;
		this.estu_tieneetnia = estu_tieneetnia;
		this.estu_tomo_cursopreparacion = estu_tomo_cursopreparacion;
		this.estu_cursodocentesies = estu_cursodocentesies;
		this.estu_cursoiesapoyoexterno = estu_cursoiesapoyoexterno;
		this.estu_cursoiesexterna = estu_cursoiesexterna;
		this.estu_simulacrotipoicfes = estu_simulacrotipoicfes;
		this.estu_actividadrefuerzoareas = estu_actividadrefuerzoareas;
		this.estu_actividadrefuerzogeneric = estu_actividadrefuerzogeneric;
		this.fami_trabajolaborpadre = fami_trabajolaborpadre;
		this.fami_trabajolabormadre = fami_trabajolabormadre;
		this.fami_numlibros = fami_numlibros;
		this.estu_inst_cod_departamento = estu_inst_cod_departamento;
		this.estu_tipodocumento = estu_tipodocumento;
		this.estu_nacionalidad = estu_nacionalidad;
		this.estu_genero = estu_genero;
		this.estu_fechanacimiento = estu_fechanacimiento;
		this.periodo1 = periodo1;
		this.estu_estudiante = estu_estudiante;
		this.estu_pais_reside = estu_pais_reside;
		this.estu_depto_reside = estu_depto_reside;
		this.estu_cod_reside_depto = estu_cod_reside_depto;
		this.estu_mcpio_reside = estu_mcpio_reside;
		this.estu_cod_reside_mcpio = estu_cod_reside_mcpio;
		this.estu_areareside = estu_areareside;
		this.estu_valorpensioncolegio = estu_valorpensioncolegio;
		this.fami_educacionpadre = fami_educacionpadre;
		this.fami_educacionmadre = fami_educacionmadre;
		this.fami_ocupacionpadre = fami_ocupacionpadre;
		this.fami_ocupacionmadre = fami_ocupacionmadre;
		this.fami_estratovivienda = fami_estratovivienda;
		this.fami_nivelsisben = fami_nivelsisben;
		this.fami_pisoshogar = fami_pisoshogar;
		this.fami_tieneinternet = fami_tieneinternet;
		this.fami_tienecomputador = fami_tienecomputador;
		this.fami_tienemicroondas = fami_tienemicroondas;
		this.fami_tienehorno = fami_tienehorno;
		this.fami_tieneautomovil = fami_tieneautomovil;
		this.fami_tienedvd = fami_tienedvd;
		this.fami_tiene_nevera = fami_tiene_nevera;
		this.fami_tiene_celular = fami_tiene_celular;
		this.fami_telefono = fami_telefono;
		this.fami_ingresofmiliarmensual = fami_ingresofmiliarmensual;
		this.estu_trabajaactualmente = estu_trabajaactualmente;
		this.estu_antecedentes = estu_antecedentes;
		this.estu_expectativas = estu_expectativas;
		this.cole_codigo_icfes = cole_codigo_icfes;
		this.cole_cod_dane_establecimiento = cole_cod_dane_establecimiento;
		this.cole_nombre_establecimiento = cole_nombre_establecimiento;
		this.cole_genero = cole_genero;
		this.cole_naturaleza = cole_naturaleza;
		this.cole_calendario = cole_calendario;
		this.cole_bilingue = cole_bilingue;
		this.cole_caracter = cole_caracter;
		this.cole_cod_dane_sede = cole_cod_dane_sede;
		this.cole_nombre_sede = cole_nombre_sede;
		this.cole_sede_principal = cole_sede_principal;
		this.cole_area_ubicacion = cole_area_ubicacion;
		this.cole_jornada = cole_jornada;
		this.cole_cod_mcpio_ubicacion = cole_cod_mcpio_ubicacion;
		this.cole_mcpio_ubicacion = cole_mcpio_ubicacion;
		this.cole_cod_depto_ubicacion = cole_cod_depto_ubicacion;
		this.cole_depto_ubicacion = cole_depto_ubicacion;
		this.punt_lenguaje = punt_lenguaje;
		this.punt_matematicas = punt_matematicas;
		this.punt_biologia = punt_biologia;
		this.punt_quimica = punt_quimica;
		this.punt_fisica = punt_fisica;
		this.punt_ciencias_sociales = punt_ciencias_sociales;
		this.punt_filosofia = punt_filosofia;
		this.punt_ingles = punt_ingles;
		this.desemp_ingles = desemp_ingles;
		this.profundiza = profundiza;
		this.puntaje_prof = puntaje_prof;
		this.desemp_prof = desemp_prof;
		this.exito = exito;
	}




	@Override
	public String toString() {
		return "Persona [estu_consecutivo=" + estu_consecutivo + ", estu_exterior=" + estu_exterior + ", periodo="
				+ periodo + ", estu_tieneetnia=" + estu_tieneetnia + ", estu_tomo_cursopreparacion="
				+ estu_tomo_cursopreparacion + ", estu_cursodocentesies=" + estu_cursodocentesies
				+ ", estu_cursoiesapoyoexterno=" + estu_cursoiesapoyoexterno + ", estu_cursoiesexterna="
				+ estu_cursoiesexterna + ", estu_simulacrotipoicfes=" + estu_simulacrotipoicfes
				+ ", estu_actividadrefuerzoareas=" + estu_actividadrefuerzoareas + ", estu_actividadrefuerzogeneric="
				+ estu_actividadrefuerzogeneric + ", fami_trabajolaborpadre=" + fami_trabajolaborpadre
				+ ", fami_trabajolabormadre=" + fami_trabajolabormadre + ", fami_numlibros=" + fami_numlibros
				+ ", estu_inst_cod_departamento=" + estu_inst_cod_departamento + ", estu_tipodocumento="
				+ estu_tipodocumento + ", estu_nacionalidad=" + estu_nacionalidad + ", estu_genero=" + estu_genero
				+ ", estu_fechanacimiento=" + estu_fechanacimiento + ", periodo1=" + periodo1 + ", estu_estudiante="
				+ estu_estudiante + ", estu_pais_reside=" + estu_pais_reside + ", estu_depto_reside="
				+ estu_depto_reside + ", estu_cod_reside_depto=" + estu_cod_reside_depto + ", estu_mcpio_reside="
				+ estu_mcpio_reside + ", estu_cod_reside_mcpio=" + estu_cod_reside_mcpio + ", estu_areareside="
				+ estu_areareside + ", estu_valorpensioncolegio=" + estu_valorpensioncolegio + ", fami_educacionpadre="
				+ fami_educacionpadre + ", fami_educacionmadre=" + fami_educacionmadre + ", fami_ocupacionpadre="
				+ fami_ocupacionpadre + ", fami_ocupacionmadre=" + fami_ocupacionmadre + ", fami_estratovivienda="
				+ fami_estratovivienda + ", fami_nivelsisben=" + fami_nivelsisben + ", fami_pisoshogar="
				+ fami_pisoshogar + ", fami_tieneinternet=" + fami_tieneinternet + ", fami_tienecomputador="
				+ fami_tienecomputador + ", fami_tienemicroondas=" + fami_tienemicroondas + ", fami_tienehorno="
				+ fami_tienehorno + ", fami_tieneautomovil=" + fami_tieneautomovil + ", fami_tienedvd=" + fami_tienedvd
				+ ", fami_tiene_nevera=" + fami_tiene_nevera + ", fami_tiene_celular=" + fami_tiene_celular
				+ ", fami_telefono=" + fami_telefono + ", fami_ingresofmiliarmensual=" + fami_ingresofmiliarmensual
				+ ", estu_trabajaactualmente=" + estu_trabajaactualmente + ", estu_antecedentes=" + estu_antecedentes
				+ ", estu_expectativas=" + estu_expectativas + ", cole_codigo_icfes=" + cole_codigo_icfes
				+ ", cole_cod_dane_establecimiento=" + cole_cod_dane_establecimiento + ", cole_nombre_establecimiento="
				+ cole_nombre_establecimiento + ", cole_genero=" + cole_genero + ", cole_naturaleza=" + cole_naturaleza
				+ ", cole_calendario=" + cole_calendario + ", cole_bilingue=" + cole_bilingue + ", cole_caracter="
				+ cole_caracter + ", cole_cod_dane_sede=" + cole_cod_dane_sede + ", cole_nombre_sede="
				+ cole_nombre_sede + ", cole_sede_principal=" + cole_sede_principal + ", cole_area_ubicacion="
				+ cole_area_ubicacion + ", cole_jornada=" + cole_jornada + ", cole_cod_mcpio_ubicacion="
				+ cole_cod_mcpio_ubicacion + ", cole_mcpio_ubicacion=" + cole_mcpio_ubicacion
				+ ", cole_cod_depto_ubicacion=" + cole_cod_depto_ubicacion + ", cole_depto_ubicacion="
				+ cole_depto_ubicacion + ", punt_lenguaje=" + punt_lenguaje + ", punt_matematicas=" + punt_matematicas
				+ ", punt_biologia=" + punt_biologia + ", punt_quimica=" + punt_quimica + ", punt_fisica=" + punt_fisica
				+ ", punt_ciencias_sociales=" + punt_ciencias_sociales + ", punt_filosofia=" + punt_filosofia
				+ ", punt_ingles=" + punt_ingles + ", desemp_ingles=" + desemp_ingles + ", profundiza=" + profundiza
				+ ", puntaje_prof=" + puntaje_prof + ", desemp_prof=" + desemp_prof + ", exito=" + exito + "]";
	}
	
	
	
	
	
	
	

}