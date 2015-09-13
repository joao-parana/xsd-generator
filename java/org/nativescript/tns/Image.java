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
 * <p>Classe Java de Image complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}imageAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image")
public class Image
    extends View
{

    @XmlAttribute(name = "isLoading")
    protected String isLoading;
    @XmlAttribute(name = "stretch")
    protected String stretch;

    /**
     * Obtém o valor da propriedade isLoading.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLoading() {
        return isLoading;
    }

    /**
     * Define o valor da propriedade isLoading.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLoading(String value) {
        this.isLoading = value;
    }

    /**
     * Obtém o valor da propriedade stretch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStretch() {
        return stretch;
    }

    /**
     * Define o valor da propriedade stretch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStretch(String value) {
        this.stretch = value;
    }

}
