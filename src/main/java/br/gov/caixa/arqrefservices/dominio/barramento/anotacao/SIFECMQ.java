package br.gov.caixa.arqrefservices.dominio.barramento.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Anotacao para conexao na filas MQ do SIFEC
 *
 */
@Target(value={ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Qualifier
public @interface SIFECMQ {

}
