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
 * <p>Classe Java de Repeater complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Repeater">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}repeaterAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repeater")
public class Repeater
    extends View
{

    @XmlAttribute(name = "itemTemplate")
    protected String itemTemplate;
    @XmlAttribute(name = "itemsLayout")
    protected String itemsLayout;

    /**
     * Obtém o valor da propriedade itemTemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTemplate() {
        return itemTemplate;
    }

    /**
     * Define o valor da propriedade itemTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTemplate(String value) {
        this.itemTemplate = value;
    }

    /**
     * Obtém o valor da propriedade itemsLayout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemsLayout() {
        return itemsLayout;
    }

    /**
     * Define o valor da propriedade itemsLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemsLayout(String value) {
        this.itemsLayout = value;
    }

}
