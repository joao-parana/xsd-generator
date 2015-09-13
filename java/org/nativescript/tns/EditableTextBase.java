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
 * <p>Classe Java de EditableTextBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EditableTextBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}TextBase">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}editableTextBaseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditableTextBase")
@XmlSeeAlso({
    TextField.class,
    TextView.class
})
public class EditableTextBase
    extends TextBase
{

    @XmlAttribute(name = "keyboardType")
    protected String keyboardType;
    @XmlAttribute(name = "returnKeyType")
    protected String returnKeyType;
    @XmlAttribute(name = "editable")
    protected String editable;
    @XmlAttribute(name = "updateTextTrigger")
    protected String updateTextTrigger;
    @XmlAttribute(name = "autocapitalizationType")
    protected String autocapitalizationType;
    @XmlAttribute(name = "autocorrect")
    protected String autocorrect;
    @XmlAttribute(name = "hint")
    protected String hint;

    /**
     * Obtém o valor da propriedade keyboardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardType() {
        return keyboardType;
    }

    /**
     * Define o valor da propriedade keyboardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardType(String value) {
        this.keyboardType = value;
    }

    /**
     * Obtém o valor da propriedade returnKeyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnKeyType() {
        return returnKeyType;
    }

    /**
     * Define o valor da propriedade returnKeyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnKeyType(String value) {
        this.returnKeyType = value;
    }

    /**
     * Obtém o valor da propriedade editable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditable() {
        return editable;
    }

    /**
     * Define o valor da propriedade editable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditable(String value) {
        this.editable = value;
    }

    /**
     * Obtém o valor da propriedade updateTextTrigger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTextTrigger() {
        return updateTextTrigger;
    }

    /**
     * Define o valor da propriedade updateTextTrigger.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTextTrigger(String value) {
        this.updateTextTrigger = value;
    }

    /**
     * Obtém o valor da propriedade autocapitalizationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutocapitalizationType() {
        return autocapitalizationType;
    }

    /**
     * Define o valor da propriedade autocapitalizationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutocapitalizationType(String value) {
        this.autocapitalizationType = value;
    }

    /**
     * Obtém o valor da propriedade autocorrect.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutocorrect() {
        return autocorrect;
    }

    /**
     * Define o valor da propriedade autocorrect.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutocorrect(String value) {
        this.autocorrect = value;
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

}
