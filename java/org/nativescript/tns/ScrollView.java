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
 * <p>Classe Java de ScrollView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScrollView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}ContentView">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}scrollViewAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScrollView")
public class ScrollView
    extends ContentView
{

    @XmlAttribute(name = "verticalOffset")
    protected String verticalOffset;
    @XmlAttribute(name = "horizontalOffset")
    protected String horizontalOffset;
    @XmlAttribute(name = "scrollableHeight")
    protected String scrollableHeight;
    @XmlAttribute(name = "scrollableWidth")
    protected String scrollableWidth;
    @XmlAttribute(name = "orientation")
    protected String orientation;

    /**
     * Obtém o valor da propriedade verticalOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalOffset() {
        return verticalOffset;
    }

    /**
     * Define o valor da propriedade verticalOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalOffset(String value) {
        this.verticalOffset = value;
    }

    /**
     * Obtém o valor da propriedade horizontalOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalOffset() {
        return horizontalOffset;
    }

    /**
     * Define o valor da propriedade horizontalOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalOffset(String value) {
        this.horizontalOffset = value;
    }

    /**
     * Obtém o valor da propriedade scrollableHeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrollableHeight() {
        return scrollableHeight;
    }

    /**
     * Define o valor da propriedade scrollableHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrollableHeight(String value) {
        this.scrollableHeight = value;
    }

    /**
     * Obtém o valor da propriedade scrollableWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrollableWidth() {
        return scrollableWidth;
    }

    /**
     * Define o valor da propriedade scrollableWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrollableWidth(String value) {
        this.scrollableWidth = value;
    }

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

}
