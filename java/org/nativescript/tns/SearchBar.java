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
 * <p>Classe Java de SearchBar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SearchBar">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}searchBarAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBar")
public class SearchBar
    extends View
{

    @XmlAttribute(name = "submit")
    protected String submit;
    @XmlAttribute(name = "clear")
    protected String clear;
    @XmlAttribute(name = "text")
    protected String text;
    @XmlAttribute(name = "hint")
    protected String hint;
    @XmlAttribute(name = "textFieldBackgroundColor")
    protected String textFieldBackgroundColor;
    @XmlAttribute(name = "textFieldHintColor")
    protected String textFieldHintColor;

    /**
     * Obtém o valor da propriedade submit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmit() {
        return submit;
    }

    /**
     * Define o valor da propriedade submit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmit(String value) {
        this.submit = value;
    }

    /**
     * Obtém o valor da propriedade clear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClear() {
        return clear;
    }

    /**
     * Define o valor da propriedade clear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClear(String value) {
        this.clear = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtém o valor da propriedade hint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Define o valor da propriedade hint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    /**
     * Obtém o valor da propriedade textFieldBackgroundColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFieldBackgroundColor() {
        return textFieldBackgroundColor;
    }

    /**
     * Define o valor da propriedade textFieldBackgroundColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFieldBackgroundColor(String value) {
        this.textFieldBackgroundColor = value;
    }

    /**
     * Obtém o valor da propriedade textFieldHintColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFieldHintColor() {
        return textFieldHintColor;
    }

    /**
     * Define o valor da propriedade textFieldHintColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFieldHintColor(String value) {
        this.textFieldHintColor = value;
    }

}
