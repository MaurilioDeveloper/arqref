package br.gov.caixa.arqrefservices.soap;

import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

public class SystemProxyFabrica {
	
	private Properties properties;
	
	
	public void verificaProxyRequerido() {
		String proxyRequied = getProperties().getProperty("proxySet");
		if(proxyRequied!=null && proxyRequied.equals("true")){
			System.setProperty("proxySet", getProperties().getProperty("proxySet"));
			System.setProperty("proxyHost", getProperties().getProperty("proxyHost"));
			System.setProperty("proxyPort", getProperties().getProperty("proxyPort"));
			Authenticator.setDefault(new Authenticator() {
				@Override
				public PasswordAuthentication getPasswordAuthentication() {
					if (getRequestorType() == Authenticator.RequestorType.PROXY)
						return new PasswordAuthentication(
								getProperties().getProperty("userProxyAutentic"), 
								getProperties().getProperty("passwordProxyAutentic").toCharArray()
						);
					else
						return super.getPasswordAuthentication();
				}
			});
		}
	}
	
	
	public void configuraAmbienteCertificado() {
		System.setProperty("javax.net.ssl.trustStore", getProperties().getProperty("TRUST_STORE"));
		System.setProperty("javax.net.ssl.trustStorePassword", getProperties().getProperty("TRUST_STORE_PASS"));
		System.setProperty("javax.net.ssl.keyStorePassword", getProperties().getProperty("KEY_STORE_PASS"));
	}
	
	public Properties getProperties() {
		if(this.properties==null){
			this.properties = new Properties();
			InputStream in = getClass().getResourceAsStream("Servicos_SOAP.properties");
			try {
				this.properties.load(in);
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
