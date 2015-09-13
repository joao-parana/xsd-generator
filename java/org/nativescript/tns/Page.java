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
 * <p>Classe Java de Page complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Page">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}ContentView">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}pageAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page")
public class Page
    extends ContentView
{

    @XmlAttribute(name = "shownModally")
    protected String shownModally;
    @XmlAttribute(name = "navigatingTo")
    protected String navigatingTo;
    @XmlAttribute(name = "navigatedTo")
    protected String navigatedTo;
    @XmlAttribute(name = "navigatingFrom")
    protected String navigatingFrom;
    @XmlAttribute(name = "navigatedFrom")
    protected String navigatedFrom;
    @XmlAttribute(name = "navigationBarHidden")
    protected String navigationBarHidden;
    @XmlAttribute(name = "css")
    protected String css;
    @XmlAttribute(name = "optionsMenu")
    protected String optionsMenu;

    /**
     * Obtém o valor da propriedade shownModally.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShownModally() {
        return shownModally;
    }

    /**
     * Define o valor da propriedade shownModally.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShownModally(String value) {
        this.shownModally = value;
    }

    /**
     * Obtém o valor da propriedade navigatingTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigatingTo() {
        return navigatingTo;
    }

    /**
     * Define o valor da propriedade navigatingTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigatingTo(String value) {
        this.navigatingTo = value;
    }

    /**
     * Obtém o valor da propriedade navigatedTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigatedTo() {
        return navigatedTo;
    }

    /**
     * Define o valor da propriedade navigatedTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigatedTo(String value) {
        this.navigatedTo = value;
    }

    /**
     * Obtém o valor da propriedade navigatingFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigatingFrom() {
        return navigatingFrom;
    }

    /**
     * Define o valor da propriedade navigatingFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigatingFrom(String value) {
        this.navigatingFrom = value;
    }

    /**
     * Obtém o valor da propriedade navigatedFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigatedFrom() {
        return navigatedFrom;
    }

    /**
     * Define o valor da propriedade navigatedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigatedFrom(String value) {
        this.navigatedFrom = value;
    }

    /**
     * Obtém o valor da propriedade navigationBarHidden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigationBarHidden() {
        return navigationBarHidden;
    }

    /**
     * Define o valor da propriedade navigationBarHidden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigationBarHidden(String value) {
        this.navigationBarHidden = value;
    }

    /**
     * Obtém o valor da propriedade css.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCss() {
        return css;
    }

    /**
     * Define o valor da propriedade css.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCss(String value) {
        this.css = value;
    }

    /**
     * Obtém o valor da propriedade optionsMenu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsMenu() {
        return optionsMenu;
    }

    /**
     * Define o valor da propriedade optionsMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsMenu(String value) {
        this.optionsMenu = value;
    }

}
