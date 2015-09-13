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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TextBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}textBaseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextBase")
@XmlSeeAlso({
    Label.class,
    EditableTextBase.class
})
public class TextBase
    extends View
{

    @XmlAttribute(name = "text")
    protected String text;
    @XmlAttribute(name = "textAlignment")
    protected String textAlignment;
    @XmlAttribute(name = "fontSize")
    protected String fontSize;
    @XmlAttribute(name = "formattedText")
    protected String formattedText;

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
     * Obtém o valor da propriedade textAlignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextAlignment() {
        return textAlignment;
    }

    /**
     * Define o valor da propriedade textAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextAlignment(String value) {
        this.textAlignment = value;
    }

    /**
     * Obtém o valor da propriedade fontSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Define o valor da propriedade fontSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Obtém o valor da propriedade formattedText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedText() {
        return formattedText;
    }

    /**
     * Define o valor da propriedade formattedText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedText(String value) {
        this.formattedText = value;
    }

}
