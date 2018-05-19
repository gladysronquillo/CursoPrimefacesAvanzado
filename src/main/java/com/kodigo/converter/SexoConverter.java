package com.kodigo.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("sexoConverter")
public class SexoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		return value;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		String sexo = "";

		if (value != null) {
			sexo = (String) value;
			switch (sexo) {
			case "M":
				sexo = "Masculino";
				break;
			case "F":
				sexo = "Femenino";
				break;
			}
		}
		return sexo;
	}

}
