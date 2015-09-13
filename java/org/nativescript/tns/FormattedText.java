//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormattedText complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormattedText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormattedString">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FormattedString.spans">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Span" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}FormattedTextAttributes"/>
 *                                     &lt;attribute name="text" type="{http://www.nativescript.org/tns.xsd}StringValidator" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}FormattedTextAttributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedText", propOrder = {
    "formattedString"
})
@XmlSeeAlso({
    org.nativescript.tns.TextView.TextViewFormattedText.class
})
public class FormattedText {

    @XmlElement(name = "FormattedString", required = true)
    protected FormattedText.FormattedString formattedString;

    /**
     * Obtém o valor da propriedade formattedString.
     * 
     * @return
     *     possible object is
     *     {@link FormattedText.FormattedString }
     *     
     */
    public FormattedText.FormattedString getFormattedString() {
        return formattedString;
    }

    /**
     * Define o valor da propriedade formattedString.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedText.FormattedString }
     *     
     */
    public void setFormattedString(FormattedText.FormattedString value) {
        this.formattedString = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FormattedString.spans">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Span" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}FormattedTextAttributes"/>
     *                           &lt;attribute name="text" type="{http://www.nativescript.org/tns.xsd}StringValidator" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}FormattedTextAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "formattedStringSpans"
    })
    public static class FormattedString {

        @XmlElement(name = "FormattedString.spans", required = true)
        protected FormattedText.FormattedString.FormattedStringSpans formattedStringSpans;
        @XmlAttribute(name = "fontSize")
        protected String fontSize;
        @XmlAttribute(name = "fontFamily")
        protected String fontFamily;
        @XmlAttribute(name = "fontAttributes")
        protected String fontAttributes;
        @XmlAttribute(name = "foregroundColor")
        protected String foregroundColor;
        @XmlAttribute(name = "backgroundColor")
        protected String backgroundColor;
        @XmlAttribute(name = "underline")
        protected String underline;
        @XmlAttribute(name = "strikethrough")
        protected String strikethrough;

        /**
         * Obtém o valor da propriedade formattedStringSpans.
         * 
         * @return
         *     possible object is
         *     {@link FormattedText.FormattedString.FormattedStringSpans }
         *     
         */
        public FormattedText.FormattedString.FormattedStringSpans getFormattedStringSpans() {
            return formattedStringSpans;
        }

        /**
         * Define o valor da propriedade formattedStringSpans.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedText.FormattedString.FormattedStringSpans }
         *     
         */
        public void setFormattedStringSpans(FormattedText.FormattedString.FormattedStringSpans value) {
            this.formattedStringSpans = value;
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
         * Obtém o valor da propriedade fontFamily.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFontFamily() {
            return fontFamily;
        }

        /**
         * Define o valor da propriedade fontFamily.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFontFamily(String value) {
            this.fontFamily = value;
        }

        /**
         * Obtém o valor da propriedade fontAttributes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFontAttributes() {
            return fontAttributes;
        }

        /**
         * Define o valor da propriedade fontAttributes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFontAttributes(String value) {
            this.fontAttributes = value;
        }

        /**
         * Obtém o valor da propriedade foregroundColor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForegroundColor() {
            return foregroundColor;
        }

        /**
         * Define o valor da propriedade foregroundColor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForegroundColor(String value) {
            this.foregroundColor = value;
        }

        /**
         * Obtém o valor da propriedade backgroundColor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackgroundColor() {
            return backgroundColor;
        }

        /**
         * Define o valor da propriedade backgroundColor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackgroundColor(String value) {
            this.backgroundColor = value;
        }

        /**
         * Obtém o valor da propriedade underline.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnderline() {
            return underline;
        }

        /**
         * Define o valor da propriedade underline.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnderline(String value) {
            this.underline = value;
        }

        /**
         * Obtém o valor da propriedade strikethrough.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrikethrough() {
            return strikethrough;
        }

        /**
         * Define o valor da propriedade strikethrough.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrikethrough(String value) {
            this.strikethrough = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Span" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}FormattedTextAttributes"/>
         *                 &lt;attribute name="text" type="{http://www.nativescript.org/tns.xsd}StringValidator" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "span"
        })
        public static class FormattedStringSpans {

            @XmlElement(name = "Span", required = true)
            protected List<FormattedText.FormattedString.FormattedStringSpans.Span> span;

            /**
             * Gets the value of the span property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the span property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpan().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FormattedText.FormattedString.FormattedStringSpans.Span }
             * 
             * 
             */
            public List<FormattedText.FormattedString.FormattedStringSpans.Span> getSpan() {
                if (span == null) {
                    span = new ArrayList<FormattedText.FormattedString.FormattedStringSpans.Span>();
                }
                return this.span;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}FormattedTextAttributes"/>
             *       &lt;attribute name="text" type="{http://www.nativescript.org/tns.xsd}StringValidator" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Span {

                @XmlAttribute(name = "text")
                protected String text;
                @XmlAttribute(name = "fontSize")
                protected String fontSize;
                @XmlAttribute(name = "fontFamily")
                protected String fontFamily;
                @XmlAttribute(name = "fontAttributes")
                protected String fontAttributes;
                @XmlAttribute(name = "foregroundColor")
                protected String foregroundColor;
                @XmlAttribute(name = "backgroundColor")
                protected String backgroundColor;
                @XmlAttribute(name = "underline")
                protected String underline;
                @XmlAttribute(name = "strikethrough")
                protected String strikethrough;

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
                 * Obtém o valor da propriedade fontFamily.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFontFamily() {
                    return fontFamily;
                }

                /**
                 * Define o valor da propriedade fontFamily.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFontFamily(String value) {
                    this.fontFamily = value;
                }

                /**
                 * Obtém o valor da propriedade fontAttributes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFontAttributes() {
                    return fontAttributes;
                }

                /**
                 * Define o valor da propriedade fontAttributes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFontAttributes(String value) {
                    this.fontAttributes = value;
                }

                /**
                 * Obtém o valor da propriedade foregroundColor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getForegroundColor() {
                    return foregroundColor;
                }

                /**
                 * Define o valor da propriedade foregroundColor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setForegroundColor(String value) {
                    this.foregroundColor = value;
                }

                /**
                 * Obtém o valor da propriedade backgroundColor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBackgroundColor() {
                    return backgroundColor;
                }

                /**
                 * Define o valor da propriedade backgroundColor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBackgroundColor(String value) {
                    this.backgroundColor = value;
                }

                /**
                 * Obtém o valor da propriedade underline.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnderline() {
                    return underline;
                }

                /**
                 * Define o valor da propriedade underline.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnderline(String value) {
                    this.underline = value;
                }

                /**
                 * Obtém o valor da propriedade strikethrough.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStrikethrough() {
                    return strikethrough;
                }

                /**
                 * Define o valor da propriedade strikethrough.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStrikethrough(String value) {
                    this.strikethrough = value;
                }

            }

        }

    }

}
