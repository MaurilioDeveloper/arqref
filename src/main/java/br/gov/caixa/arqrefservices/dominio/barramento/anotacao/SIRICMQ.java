package br.gov.caixa.arqrefservices.dominio.barramento.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Anotacao para conexao na filas MQ do SIRIC
 *
 * @author c110503
 *
 */
@Target(value = { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Qualifier
public @interface SIRICMQ {

}
