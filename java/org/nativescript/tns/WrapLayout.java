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
 * <p>Classe Java de WrapLayout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WrapLayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}Layout">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}wrapLayoutAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrapLayout")
public class WrapLayout
    extends Layout
{

    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "itemWidth")
    protected String itemWidth;
    @XmlAttribute(name = "itemHeight")
    protected String itemHeight;

    /**
     * Obtém o valor da propriedade orientation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Define o valor da propriedade orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Obtém o valor da propriedade itemWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemWidth() {
        return itemWidth;
    }

    /**
     * Define o valor da propriedade itemWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemWidth(String value) {
        this.itemWidth = value;
    }

    /**
     * Obtém o valor da propriedade itemHeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemHeight() {
        return itemHeight;
    }

    /**
     * Define o valor da propriedade itemHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemHeight(String value) {
        this.itemHeight = value;
    }

}
