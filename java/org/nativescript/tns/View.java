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
 * <p>Classe Java de View complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="View">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}viewAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "View")
@XmlSeeAlso({
    Placeholder.class,
    TimePicker.class,
    Slider.class,
    SearchBar.class,
    Image.class,
    ListView.class,
    Button.class,
    WebView.class,
    Progress.class,
    TabView.class,
    ActivityIndicator.class,
    Switch.class,
    SegmentedBar.class,
    Repeater.class,
    DatePicker.class,
    ContentView.class,
    ListPicker.class,
    GridLayout.class,
    TextBase.class,
    Layout.class
})
public class View {

    @XmlAttribute(name = "borderRadius")
    protected String borderRadius;
    @XmlAttribute(name = "borderWidth")
    protected String borderWidth;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "loaded")
    protected String loaded;
    @XmlAttribute(name = "unloaded")
    protected String unloaded;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "backgroundColor")
    protected String backgroundColor;
    @XmlAttribute(name = "backgroundImage")
    protected String backgroundImage;
    @XmlAttribute(name = "minWidth")
    protected String minWidth;
    @XmlAttribute(name = "minHeight")
    protected String minHeight;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "margin")
    protected String margin;
    @XmlAttribute(name = "marginLeft")
    protected String marginLeft;
    @XmlAttribute(name = "marginTop")
    protected String marginTop;
    @XmlAttribute(name = "marginRight")
    protected String marginRight;
    @XmlAttribute(name = "marginBottom")
    protected String marginBottom;
    @XmlAttribute(name = "padding")
    protected String padding;
    @XmlAttribute(name = "paddingLeft")
    protected String paddingLeft;
    @XmlAttribute(name = "paddingTop")
    protected String paddingTop;
    @XmlAttribute(name = "paddingRight")
    protected String paddingRight;
    @XmlAttribute(name = "paddingBottom")
    protected String paddingBottom;
    @XmlAttribute(name = "horizontalAlignment")
    protected String horizontalAlignment;
    @XmlAttribute(name = "verticalAlignment")
    protected String verticalAlignment;
    @XmlAttribute(name = "visibility")
    protected String visibility;
    @XmlAttribute(name = "opacity")
    protected String opacity;
    @XmlAttribute(name = "isEnabled")
    protected String isEnabled;
    @XmlAttribute(name = "isUserInteractionEnabled")
    protected String isUserInteractionEnabled;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "cssClass")
    protected String cssClass;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "cssType")
    protected String cssType;

    /**
     * Obtém o valor da propriedade borderRadius.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRadius() {
        return borderRadius;
    }

    /**
     * Define o valor da propriedade borderRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRadius(String value) {
        this.borderRadius = value;
    }

    /**
     * Obtém o valor da propriedade borderWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderWidth() {
        return borderWidth;
    }

    /**
     * Define o valor da propriedade borderWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderWidth(String value) {
        this.borderWidth = value;
    }

    /**
     * Obtém o valor da propriedade borderColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Define o valor da propriedade borderColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Obtém o valor da propriedade loaded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoaded() {
        return loaded;
    }

    /**
     * Define o valor da propriedade loaded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoaded(String value) {
        this.loaded = value;
    }

    /**
     * Obtém o valor da propriedade unloaded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnloaded() {
        return unloaded;
    }

    /**
     * Define o valor da propriedade unloaded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnloaded(String value) {
        this.unloaded = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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
     * Obtém o valor da propriedade backgroundImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Define o valor da propriedade backgroundImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImage(String value) {
        this.backgroundImage = value;
    }

    /**
     * Obtém o valor da propriedade minWidth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinWidth() {
        return minWidth;
    }

    /**
     * Define o valor da propriedade minWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinWidth(String value) {
        this.minWidth = value;
    }

    /**
     * Obtém o valor da propriedade minHeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeight() {
        return minHeight;
    }

    /**
     * Define o valor da propriedade minHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeight(String value) {
        this.minHeight = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Obtém o valor da propriedade margin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMargin() {
        return margin;
    }

    /**
     * Define o valor da propriedade margin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMargin(String value) {
        this.margin = value;
    }

    /**
     * Obtém o valor da propriedade marginLeft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginLeft() {
        return marginLeft;
    }

    /**
     * Define o valor da propriedade marginLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginLeft(String value) {
        this.marginLeft = value;
    }

    /**
     * Obtém o valor da propriedade marginTop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginTop() {
        return marginTop;
    }

    /**
     * Define o valor da propriedade marginTop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginTop(String value) {
        this.marginTop = value;
    }

    /**
     * Obtém o valor da propriedade marginRight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginRight() {
        return marginRight;
    }

    /**
     * Define o valor da propriedade marginRight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginRight(String value) {
        this.marginRight = value;
    }

    /**
     * Obtém o valor da propriedade marginBottom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarginBottom() {
        return marginBottom;
    }

    /**
     * Define o valor da propriedade marginBottom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarginBottom(String value) {
        this.marginBottom = value;
    }

    /**
     * Obtém o valor da propriedade padding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Define o valor da propriedade padding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Obtém o valor da propriedade paddingLeft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingLeft() {
        return paddingLeft;
    }

    /**
     * Define o valor da propriedade paddingLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingLeft(String value) {
        this.paddingLeft = value;
    }

    /**
     * Obtém o valor da propriedade paddingTop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingTop() {
        return paddingTop;
    }

    /**
     * Define o valor da propriedade paddingTop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingTop(String value) {
        this.paddingTop = value;
    }

    /**
     * Obtém o valor da propriedade paddingRight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingRight() {
        return paddingRight;
    }

    /**
     * Define o valor da propriedade paddingRight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingRight(String value) {
        this.paddingRight = value;
    }

    /**
     * Obtém o valor da propriedade paddingBottom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaddingBottom() {
        return paddingBottom;
    }

    /**
     * Define o valor da propriedade paddingBottom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaddingBottom(String value) {
        this.paddingBottom = value;
    }

    /**
     * Obtém o valor da propriedade horizontalAlignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalAlignment() {
        return horizontalAlignment;
    }

    /**
     * Define o valor da propriedade horizontalAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalAlignment(String value) {
        this.horizontalAlignment = value;
    }

    /**
     * Obtém o valor da propriedade verticalAlignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * Define o valor da propriedade verticalAlignment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalAlignment(String value) {
        this.verticalAlignment = value;
    }

    /**
     * Obtém o valor da propriedade visibility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Define o valor da propriedade visibility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Obtém o valor da propriedade opacity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * Define o valor da propriedade opacity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEnabled(String value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isUserInteractionEnabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUserInteractionEnabled() {
        return isUserInteractionEnabled;
    }

    /**
     * Define o valor da propriedade isUserInteractionEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUserInteractionEnabled(String value) {
        this.isUserInteractionEnabled = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade cssClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssClass() {
        return cssClass;
    }

    /**
     * Define o valor da propriedade cssClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssClass(String value) {
        this.cssClass = value;
    }

    /**
     * Obtém o valor da propriedade style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Define o valor da propriedade style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Obtém o valor da propriedade cssType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssType() {
        return cssType;
    }

    /**
     * Define o valor da propriedade cssType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssType(String value) {
        this.cssType = value;
    }

}
