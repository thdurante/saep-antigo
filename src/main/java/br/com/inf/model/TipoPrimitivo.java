package br.com.inf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public enum TipoPrimitivo {
    LOGICO, REAL, STRING
}
