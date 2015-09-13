//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TextField complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}EditableTextBase">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}textFieldAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextField")
public class TextField
    extends EditableTextBase
{

    @XmlAttribute(name = "secure")
    protected String secure;

    /**
     * Obtém o valor da propriedade secure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecure() {
        return secure;
    }

    /**
     * Define o valor da propriedade secure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecure(String value) {
        this.secure = value;
    }

}
