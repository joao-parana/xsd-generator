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
 * <p>Classe Java de SegmentedBar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SegmentedBar">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}segmentedBarAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentedBar")
public class SegmentedBar
    extends View
{

    @XmlAttribute(name = "selectedIndex")
    protected String selectedIndex;
    @XmlAttribute(name = "selectedBackgroundColor")
    protected String selectedBackgroundColor;
    @XmlAttribute(name = "items")
    protected String items;

    /**
     * Obtém o valor da propriedade selectedIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedIndex() {
        return selectedIndex;
    }

    /**
     * Define o valor da propriedade selectedIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedIndex(String value) {
        this.selectedIndex = value;
    }

    /**
     * Obtém o valor da propriedade selectedBackgroundColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }

    /**
     * Define o valor da propriedade selectedBackgroundColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedBackgroundColor(String value) {
        this.selectedBackgroundColor = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItems(String value) {
        this.items = value;
    }

}
