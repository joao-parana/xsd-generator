//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TextView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}EditableTextBase">
 *       &lt;sequence>
 *         &lt;element name="TextView.formattedText" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.nativescript.org/tns.xsd}FormattedText">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextView", propOrder = {
    "textViewFormattedText"
})
public class TextView
    extends EditableTextBase
{

    @XmlElement(name = "TextView.formattedText")
    protected TextView.TextViewFormattedText textViewFormattedText;

    /**
     * Obtém o valor da propriedade textViewFormattedText.
     * 
     * @return
     *     possible object is
     *     {@link TextView.TextViewFormattedText }
     *     
     */
    public TextView.TextViewFormattedText getTextViewFormattedText() {
        return textViewFormattedText;
    }

    /**
     * Define o valor da propriedade textViewFormattedText.
     * 
     * @param value
     *     allowed object is
     *     {@link TextView.TextViewFormattedText }
     *     
     */
    public void setTextViewFormattedText(TextView.TextViewFormattedText value) {
        this.textViewFormattedText = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.nativescript.org/tns.xsd}FormattedText">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TextViewFormattedText
        extends FormattedText
    {


    }

}
