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
 * <p>Classe Java de Label complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}TextBase">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}labelAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label")
public class Label
    extends TextBase
{

    @XmlAttribute(name = "textWrap")
    protected String textWrap;

    /**
     * Obtém o valor da propriedade textWrap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextWrap() {
        return textWrap;
    }

    /**
     * Define o valor da propriedade textWrap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextWrap(String value) {
        this.textWrap = value;
    }

}
