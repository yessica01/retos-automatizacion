package co.com.bancolombia.certification.utest.persistencia;



import static co.com.bancolombia.certification.utest.exceptions.LecturaArchivoException.FORMATO_MENSAJE_ERROR_LECTURA;
import static co.com.bancolombia.certification.utest.util.LectorArchivoBuilder.leerUnArchivo;

import java.io.File;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.com.bancolombia.certification.utest.exceptions.LecturaArchivoException;
import co.com.bancolombia.certification.utest.model.InformacionParaRegistro;

public class DaoInformacionParaRegistroImpl implements DaoInformacionParaRegistro{
	private String datosRegistro;
    private Gson gson;
	
    public DaoInformacionParaRegistroImpl(String datosRegistro) {
        this.gson = new GsonBuilder().create();
        this.datosRegistro = datosRegistro;
    }
    @Override
	public InformacionParaRegistro getInformacionParaRegistro() {
    	 try {
             File documentoDeRegistro = leerUnArchivo().paraFormatoJson(datosRegistro);
             String json = IOUtils.toString(documentoDeRegistro.toURI(), StandardCharsets.UTF_8);
             return gson.fromJson(json, InformacionParaRegistro.class);
         } catch (Exception e) {
             throw new LecturaArchivoException(String.format(FORMATO_MENSAJE_ERROR_LECTURA, datosRegistro), e);
         }
	}
}